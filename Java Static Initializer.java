
    static Scanner s = new Scanner(System.in);
    static int B =Integer.parseInt(s.nextLine());
    static int H = Integer.parseInt(s.nextLine());
    static boolean flag = true;
static {
    try{
       if(B <= 0 || H <= 0){
           flag = false;
           throw new Exception("Breadth and height must be positive");
    }
    }
    catch (Exception e){
        System.out.println(e);
    }
}
