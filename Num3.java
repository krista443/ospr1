public class Num3 {
        public static void main(String[] args){
            if (args.length != 2){
                System.out.println("Vi ne peredavali parametrov");
            } else {
                System.out.println(args[0] + " " + args[1]);
                System.out.println(args[0] + " + " + args[1] + " = " + (Integer.parseInt(args[0]) + Integer.parseInt(args[1])));
            }
        }
    }

