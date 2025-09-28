 class TestString {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("First");
        sb.append(459);
        sb.append(", Now this is the ");
        sb.append(76.57);
        sb.toString();
        System.out.println(sb);
    }
}
