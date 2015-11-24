package tubes2;

import java.lang.Object;
import java.util.*;

public class Arena {
	private Player pemain;
	private GameController kendali;
        private boolean[][] area ;

//	public Arena(Player pemain) {
//            this.pemain = pemain;
//            int lvl = pemain.getLevel();
//            area = new boolean[10][5];
//            //boolean true=ground, false=air
//            switch(lvl){
//                case 1:
//                    for(int i=0;i<10;i++){
//                        for(int j=0;j<5;j++){
//                            if(j==4){
//                                area[i][j]=true;
//                            }else{
//                                area[i][j]=false;
//                            }
//                        }
//                    }
//                    break;
//                case 2:
//                    for(int i=0;i<10;i++){
//                        for(int j=0;j<5;j++){
//                            area[i][j]=false;
//                        }
//                    }
//                    area[7][2]=true;
//                    area[9][2]=true;
//                    area[7][3]=true;
//                    area[8][3]=true;
//                    area[9][3]=true;
//                    break;
//                case 3:
//                    for(int i=0;i<10;i++){
//                        for(int j=0;j<5;j++){
//                            if(((3<=i && i<10)&&(j==2))&&((6<=i && i<10)&&(j==3))
//                                    &&((7<=i && i<10)&&(j==1))&&(j==4)){
//                                area[i][j]=true;
//                            } else{
//                                area[i][j]=false;
//                            }
//                        }
//                    }
//                    break;
//                case 4:
//                    for(int i=0;i<=9;i++){
//                        for(int j=0;j<=4;j++){
//                            if(((0<=i && i<=5)&&(j==3))&&((8<=i && i<=9)&&(j==3))
//                                    &&((i==9)&&(j>=1&&j<=2))&&(j==4)){
//                                area[i][j]=true;
//                            }else{
//                                area[i][j]=false;}
//                        }
//                    }
//                    break;
//                case 5:
//                    for(int i=0;i<=9;i++){
//                        for(int j=0;j<=4;j++){
//                            if((((0<=i&&i<=1)&&(7<=i&&i<=9))&&(j==3))&&(((i==1)&&(i==9))&&(j==2))
//                                    &&((i==8&&i==0&&i==6)&&(j==1))&&(j==4)){
//                                area[i][j]=true;
//                            }else{
//                                area[i][j]=false;
//                            }
//                        }
//                    }
//                    break;
//                    }
//            }
        
       public Arena(int lvl) {
           area = new boolean[10][5];
           
            switch(lvl){
                case 1:
                    for(int i=0;i<10;i++){
                        for(int j=0;j<5;j++){
                            if(j==4){
                                area[i][j]=true;
                            }else{
                                area[i][j]=false;
                            }
                        }
                    }
                    break;
                case 2:
                    for(int i=0;i<10;i++){
                        for(int j=0;j<5;j++){
                            area[i][j]=false;
                        }
                    }
                    area[7][2]=true;
                    area[9][2]=true;
                    area[7][3]=true;
                    area[8][3]=true;
                    area[9][3]=true;
                    break;
                case 3:
                    for(int i=0;i<10;i++){
                        for(int j=0;j<5;j++){
                            if(((3<=i && i<10)&&(j==2))&&((6<=i && i<10)&&(j==3))
                                    &&((7<=i && i<10)&&(j==1))&&(j==4)){
                                area[i][j]=true;
                            } else{
                                area[i][j]=false;
                            }
                        }
                    }
                    break;
                case 4:
                    for(int i=0;i<=9;i++){
                        for(int j=0;j<=4;j++){
                            if(((0<=i && i<=5)&&(j==3))&&((8<=i && i<=9)&&(j==3))
                                    &&((i==9)&&(j>=1&&j<=2))&&(j==4)){
                                area[i][j]=true;
                            }else{
                                area[i][j]=false;}
                        }
                    }
                    break;
                case 5:
                    for(int i=0;i<=9;i++){
                        for(int j=0;j<=4;j++){
                            if((((0<=i&&i<=1)&&(7<=i&&i<=9))&&(j==3))&&(((i==1)&&(i==9))&&(j==2))
                                    &&((i==8&&i==0&&i==6)&&(j==1))&&(j==4)){
                                area[i][j]=true;
                            }else{
                                area[i][j]=false;
                            }
                        }
                    }
                    break;
                    }
            }
        
        public boolean[][] getArea(){
            return this.area;
        }
}
