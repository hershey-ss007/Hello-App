ublic class HelloApp {
    public static void main(String[] args) {
        if (args.length > 0) {
            StringBuilder nameBuilder = new StringBuilder("Hello ");
            
            // Enhanced for loop to iterate over arguments
            for (String arg : args) {
                nameBuilder.append(arg).append(" ");
            }
            
            System.out.println(nameBuilder.toString().trim());
        } else {
            System.out.println("Hello, no arguments provided!");
        }
    }
}
