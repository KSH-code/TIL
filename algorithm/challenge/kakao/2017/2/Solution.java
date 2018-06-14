class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int g[]=new int[3];
        int check=0;
        int temp=0;
        char cchar;
        for(int i=0;i<dartResult.length();i++){
            cchar=dartResult.charAt(i);
            switch(cchar){
                case 'S':
                    g[check++]=(int)temp;
                    temp=0;
                break;
                case 'D':
                    g[check++]=(int)Math.pow(temp,2);
                    temp=0;
                break;
                case 'T':
                    g[check++]=(int)Math.pow(temp,3);
                    temp=0;
                break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    if(temp!=0){
                        temp=10;
                    }else{
                        temp=Integer.parseInt(cchar+"");
                    }
                break;
                case '*':
                    g[check-1]*=2;
                    if(check-2>=0){
                        g[check-2]*=2;
                    }
                break;
                case '#':
                    g[check-1]*=-1;
                break;
            }
        }
        for(int i=0;i<3;i++){
            answer+=g[i];
        }
        return answer;
    }
  }

  1	1S2D*3T	37	11 * 2 + 22 * 2 + 33
  2	1D2S#10S	9	12 + 21 * (-1) + 101
  3	1D2S0T	3	12 + 21 + 03
  4	1S*2T*3S	23	11 * 2 * 2 + 23 * 2 + 31
  5	1D#2S*3S	5	12 * (-1) * 2 + 21 * 2 + 31
  6	1T2D3D#	-4	13 + 22 + 32 * (-1)
  7	1D2S3T*	59	12 + 21 * 2 + 33 * 2