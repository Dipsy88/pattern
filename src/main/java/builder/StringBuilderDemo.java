package builder;



public class StringBuilderDemo {

    /**
     * StringBuilder is not thread safe unlike StringBuffer
     * @param args
     */
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("String builder is not thread safe ");
        builder.append("unlike String buffer. ");
        builder.append("Thus, String builder is faster. ");

        System.out.println(builder.toString());

    }
}
