class FinalFormat{

   public static void main(String[] args){
   
      // int v1_1 = 1 ;
      // int v1_2 = 1 ;
      // int v1_3 = 0 ;
      // int v1_4 = 1 ;
   //    
      // int v2_1 = 0 ;
      // int v2_2 = 2 ;
      // int v2_3 = 1 ;
      // int v2_4 = 1 ;
   //    
      // int v3_1 =-4 ;
      // int v3_2 = 0 ;
      // int v3_3 = 2 ;
      // int v3_4 = 1 ;
      
      int v1_1 = 1 ;
      int v1_2 = 1 ;
      int v1_3 = 0 ;
      int v1_4 = 1 ;
      
      int v2_1 = -1 ;
      int v2_2 = 0 ;
      int v2_3 = 1 ;
      int v2_4 = -2 ;
      
      int v3_1 = 1 ;
      int v3_2 = -1 ;
      int v3_3 = 1 ;
      int v3_4 = 3 ;
      
      
      System.out.println(v1_1 + " " + v1_2 + " " + v1_3 + " " +  v1_4 + "|");
      System.out.println(v2_1 + " " + v2_2 + " " + v2_3 + " " +  v2_4 + "|");
      System.out.println(v3_1 + " " + v3_2 + " " + v3_3 + " " +  v3_4 + "|");
      
      //-------------------------------------------------------------------
       
      int v1_sum = v1_1 * v1_1 + v1_2 * v1_2 + v1_3 * v1_3 + v1_4 * v1_4;
      int v2_sum = v1_1 * v2_1 + v1_2 * v2_2 + v1_3 * v2_3 + v1_4 * v2_4;
      int v3_sum = v1_1 * v3_1 + v1_2 * v3_2 + v1_3 * v3_3 + v1_4 * v3_4;
      
      
      System.out.println(v1_sum + "|");
      System.out.println(v2_sum + "|");
      System.out.println(v3_sum + "|");
   
   //------------------------------------------------------------------------
   
      int frac1 = v2_sum / v1_sum; 
      int frac2 = v3_sum / v1_sum;
         
      v2_1 = v2_1 - frac1 * (v1_1); 
      v2_2 = v2_2 - frac1 * (v1_2); 
      v2_3 = v2_3 - frac1 * (v1_3); 
      v2_4 = v2_4 - frac1 * (v1_4); 
      
      v3_1 = v3_1 - frac2 * (v1_1);
      v3_2 = v3_2 - frac2 * (v1_2);
      v3_3 = v3_3 - frac2 * (v1_3);
      v3_4 = v3_4 - frac2 * (v1_4);
      
      System.out.println(v2_1 + " " + v2_2 + " " + v2_3 + " " + v2_4 + "|");
      System.out.println(v3_1 + " " + v3_2 + " " + v3_3 + " " + v3_4 + "|");
      
   //--------------------------------------------------------------------------
   
      v1_sum = v2_1 * v2_1 + v2_2 * v2_2 + v2_3 * v2_3 + v2_4 * v2_4;
      v2_sum = v2_1 * v3_1 + v2_2 * v3_2 + v2_3 * v3_3 + v2_4 * v3_4;
   
      System.out.println(v1_sum + "|");
      System.out.println(v2_sum + "|");
      
   //---------------------------------------------------------------------------
      int fr1 = v2_sum / v1_sum; 
   
      v3_1 = v3_1 - fr1 * (v2_1);   
      v3_2 = v3_2 - fr1 * (v2_2);
      v3_3 = v3_3 - fr1 * (v2_3);
      v3_4 = v3_4 - fr1 * (v2_4);   
      
      System.out.println(v3_1 + " " + v3_2 + " " + v3_3 + " " + v3_4 + "|");
   
   //----------------------------------------------------------------------------
   
      int sum = v3_1 * v3_1 + v3_2 * v3_2 + v3_3 * v3_3 + v3_4 * v3_4;
   
      System.out.println(sum);
   }

}
