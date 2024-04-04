import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

interface MenuChoice {
    int ADD = 1;
    int SEARCH = 2;
    int SHOWALL = 3;
    int DELETE = 4;
    int QUIT = 5;
}

public class AddressBook {
    public static final String PROGRAM_NAME = "연락처 저장소";
    static String dataFilePath = "../bin/address-data.bin";
    static Scanner userInput = new Scanner(System.in);
    static Map<String, AddressInfo> hmap = new HashMap<>();

    public static void printNewLine() {
        System.out.println();
    }

    public static void showMainMenu() {
        System.out.printf(" *** %s *** \n", PROGRAM_NAME);
        System.out.println("1. 새 연락처 추가");
        System.out.println("2. 연락처 검색");
        System.out.println("3. 연락처 전체 조회");
        System.out.println("4. 연락처 삭제");
        System.out.println("5. 종료");
        System.out.print("원하는 메뉴 번호를 입력하세요 : ");
    }

    public static void addInfo() {
        System.out.print("이름 : ");
        String name = userInput.nextLine();
        System.out.print("전화 번호 : ");
        String phoneNum = userInput.nextLine();
        System.out.print("이메일 (생략 시 아무것도 입력하지 않은 상태에서 엔터키 입력) : ");
        String email = userInput.nextLine();

        AddressInfo personInfo;
        if (email != null) {
            personInfo = new AddressInfo(name, phoneNum, email);
        } else {
            personInfo = new AddressInfo(name, phoneNum);
        }
        personInfo.showAddressInfo();  // 확인 차 입력한 정보 다시 보여줌.
        hmap.put(name, personInfo);
        System.out.println("현재 보유 연락처 수 : " + hmap.size());
        printNewLine();
    }

    public static void searchInfo() {
        System.out.print("이름 검색 : ");
        String name = userInput.nextLine();

        AddressInfo personInfo = hmap.get(name);
        if(personInfo != null) {
            personInfo.showAddressInfo();
        } else {
            System.out.println("조회 결과 없음.");
        }
        printNewLine();
    }

    public static void deleteInfo() {
        System.out.println("연락처 삭제를 위한 이름 입력: ");
        String name = userInput.nextLine();

        AddressInfo personInfo = hmap.remove(name);
        if (personInfo != null) {
            System.out.println(name + " 연락처가 삭제되었습니다.");
        } else {
            System.out.println("해당 연락처가 없습니다.");
        }
        printNewLine();
    }

    public static void showAllNames() {
        System.out.println("=== 연락처 명단 ===");
        Set<String> mapSet = hmap.keySet();
        for(String k : mapSet) {
            System.out.println(k);
        }
        System.out.println("---------------------");
        System.out.println("총 연락처 수 : " + hmap.size());
        System.out.println("=====================");
        printNewLine();
    }

    public static void saveAllData() {
        try(OutputStream fos = new FileOutputStream(dataFilePath);
        ObjectOutputStream objos = new ObjectOutputStream(fos)) {
            Set<String> mks = hmap.keySet();
            for(String k : mks) {
                AddressInfo personInfo = hmap.get(k);
                objos.writeObject(personInfo);
            }
        } catch(IOException e) {
            System.out.println("데이터 저장 중 에러 발생.");
            e.printStackTrace();
        }
    }

    public static void readAlldata() throws FileNotFoundException {
        try (InputStream fis = new FileInputStream(dataFilePath);
        ObjectInputStream objis = new ObjectInputStream(fis)) {
            while(true) {
                AddressInfo personInfo = (AddressInfo)objis.readObject();
                if(personInfo == null) {
                    break;
                }
                hmap.put(personInfo.name, personInfo);
            }
        } catch (ClassNotFoundException e) {} 
        catch(IOException e) {
            if (e instanceof FileNotFoundException) {
                throw (FileNotFoundException) e;
            } else if (e instanceof EOFException) {
                // 파일은 존재하나 안에 데이터가 하나도 없을 경우 발생.
                // 단순히 데이터가 없는 경우이므로 따로 어떠한 처리 작업을 할 필요도, 
                // 에러 메시지를 출력할 필요도 없음.
                return;
            }
            else {
                System.out.println("데이터를 불러오는 중 에러가 발생했습니다.");
                e.printStackTrace();
            }
        }
    }

    public static void createDataFile() {
        try(OutputStream fos = new FileOutputStream(dataFilePath)) {}
        catch(IOException e) {
            System.out.println("데이터 파일 생성 중 에러 발생");
            e.printStackTrace();
        }
    }

    public static void executeMain() throws Exception {
        int choice;

        try {
            readAlldata();
        } catch(FileNotFoundException e) {
            createDataFile();
        }

        while(true) {
            showMainMenu();
            choice = userInput.nextInt();

            // 이전에 숫자 입력 후 엔터키를 입력했을 때, 엔터키도 입력된 데이터로 인식하기에, 
            // 이로 인해 생길 수 있는 버그 방지를 위해 작성.
            userInput.nextLine();
            printNewLine();

            switch(choice) {
                case MenuChoice.ADD:
                    addInfo();
                    saveAllData();
                    break;
                case MenuChoice.SEARCH:
                    searchInfo();
                    break;
                case MenuChoice.SHOWALL:
                    showAllNames();
                    break;
                case MenuChoice.DELETE:
                    deleteInfo();
                    saveAllData();
                    break;
                case MenuChoice.QUIT:
                    System.out.printf("%s 프로그램을 종료합니다.\n", PROGRAM_NAME);
                    return;
                default:
                    System.out.println("잘못된 입력값. 메뉴 번호들 중 하나를 입력하세요.");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        try {
            executeMain();
        } catch(Exception e) {
            System.out.println("프로그램 실행 도중 에러 발생.");
            e.printStackTrace();
        }
    }
}
