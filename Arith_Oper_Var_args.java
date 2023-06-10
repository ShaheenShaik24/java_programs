class Arith_Oper_Var_args {

    public int sumNumber(int ... args){
        System.out.println("argument length: " + args.length);
        int sum = 0;
        for(int x: args){
            sum += x;
        }
        return sum;
    }
 public int sub(int ... args){
        System.out.println("argument length: " + args.length);
        int sub = args[0];
        for(int i=1;i<args.length;i++){
            sub -= args[i];
        }
        return sub;
    }
    public int multiply(int ... args){
        System.out.println("argument length: " + args.length);
        int mul = 1;
        for(int x: args){
            mul *= x;
        }
        return mul;
    }
 public int divide(int ... args){
        System.out.println("argument length: " + args.length);
        int div = args[0];
        for(int i=1;i<args.length;i++){
            div /= args[i];
        }
        return div;
    }

    public static void main( String[] args ) {
        Var_Args_operations ex = new Var_Args_operations();

        int sum2 = ex.sumNumber(1,2);
        System.out.println("sum2 = " + sum2);

        int sum3 = ex.sumNumber(3, 4, 5);
        System.out.println("sum3 = " + sum3+"\n");
   System.out.println("SUB OF 2 NOs= " + ex.sub(2,1));
   System.out.println("SUB OF 3 NOs= " + ex.sub(3,2,1)+"\n");
   
   System.out.println("PRODUCT OF 3 NOs= " + ex.multiply(2,3,4));    
   System.out.println("PRODUCT OF 4  NOs= " + ex.multiply(2,3,4,5)+"\n");

   System.out.println("DIVISION OF 2 NOs= " + ex.divide(20,10));
   System.out.println("DIVISION OF 3 NOs= " + ex.divide(10,5,2));     

   }
}