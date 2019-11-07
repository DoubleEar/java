public class FruitTest{
    public static void main(String[] args){
        Fruit f[]= new Fruit[3];
        Fruit f1= new Fruit("水果类");
        f1.setFruitName("水果类");
		System.out.println(f1.getFruitName("水果类"));
        f[0]= new Apple(300);
        f[1]= new Banana(400);
        f[2]= new Apple(300);
        for(int i=0;i<f.length;i++) {
            f[i].gain();
        }
        Apple a1= new Apple(500);
        a1.gain();
        Banana b1= new Banana(400);
        b1.gain();
    }

    public static class Fruit{
        //成员变量
        private String fruitName;
        int input;
        int output;

        public void setFruitName(String fruitname) {
            this.fruitName=fruitname;
        }
        //获取成员变量私有的值
        public String getFruitName(String fruitname) {
            return this.fruitName;
        }
        //成员变量
        //String fruitname;
        //构造方法一
        public Fruit(String fruitname,int input){
            this.fruitName=fruitname;
            this.input=input;
        }
        //构造方法二
        public Fruit(String fruitname){
            this.fruitName=fruitname;
        }
        //构造方法三
        public Fruit(){
            System.out.println("不带参数的方法被调用");
        }
        //成员方法
        public void gain() {
            if(input<0) {
                System.out.println("输入不正确，请重新输入");
            }
            else {
                output=2*input;
                System.out.println("Fruit计算收益的方法被调用");
                System.out.println("种植水果的收益为:"+output);

            }
        }
    }

    //子类1
    public static class Apple extends Fruit{
        int charge=200;
        //构造方法一
        public Apple( int input){
            this.input=input;
        }
        public Apple(){
        }
        //成员方法
        public void gain() {
            if(input<0) {
                System.out.println("输入不正确，请重新输入");
            }
            else {
                output=2*input;
                System.out.println("种植苹果的收益为:"+(output-charge));
            }
        }
    }
    //子类2
    public static class Banana extends Fruit{
        //构造方法一
		//int input=300;
        public Banana( int input){
            this.input=input;
        }
        Banana(){
        }
        //成员方法
        public void gain() {
            if(input<0) {
                System.out.println("输入不正确，请重新输入");
            }
            else {
                output=3*input;
                System.out.println("种植香蕉的收益为:"+output);
            }
        }
    }
}