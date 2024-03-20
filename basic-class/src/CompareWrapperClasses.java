class CompareWrapperClasses {
    public static void main(String[] args) {
        Integer n1 = Integer.valueOf(10);
        Integer n2 = Integer.valueOf(11);
        Integer n3 = Integer.valueOf(10);
        Double dn1 = Double.valueOf(10.0);

        System.out.println(n1.equals(n2));
        System.out.println(n1.equals(n3));
        System.out.println(n1.equals(dn1));
    }
}
