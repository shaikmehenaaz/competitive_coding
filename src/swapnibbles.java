public class swapnibbles {
    public static void main(String[] args)
    {
        int num=100;
        System.out.println((num&0X0F)<<4 | (num&0XF0)>>4);
    }
}