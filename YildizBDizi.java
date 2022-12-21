public class YildizBDizi {


    public static void main(String[] args) {
        String [][]sekil=new String[7][4];

          for(int i=0;i<sekil.length;i++)
          {
              for(int j=0;j<sekil[i].length;j++)
              {
                  if(i==0||i==3||i==6)
                  {
                    sekil[i][j]=" * ";

                  }
                  else if(j==0||j==3)
                  {
                      sekil[i][j]=" * ";

                  }
                  else
                      sekil[i][j]="   ";
              }


          }
          for(String []row:sekil)
          {
              for(String col:row)
              {
                  System.out.print(col);
              }
              System.out.println();
          }


    }
}
