class Box
{
    double width;
    double height;
    double depth;
    Box()
    {
      System.out.println("Constructor Box");
      width=10;
      height=10;
      depth=10;
    }
    double volume()
    {
      return width*height*depth;
    }
}
class DefualtConstructor
{
  public static void main(String args[])
  {
    Box mybox1=new Box();
    Box mybox2=new Box();
    double vol;
    vol=mybox1.volume();
    System.out.println("volume of mybox1:"+vol);
    vol=mybox2.volume();
    System.out.println("volume of mybox2:"+vol);
  }
}   