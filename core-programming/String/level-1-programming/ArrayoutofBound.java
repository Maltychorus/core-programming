class main {
    public static void main(String[] args) {
        try {
            String[] arr = {"A", "B"};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled ArrayIndexOutOfBoundsException");
        }
    }
}
