class po1
{
    public static void main(String ar[])
    {
        po1 p = new po1();
        po1 p1=new po1();
        p=null;
        p=p1;
        System.out.println("1 :"+p);
        System.out.println("1 :"+p1);
    }
}
