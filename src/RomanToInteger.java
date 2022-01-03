public class RomanToInteger {

    public static void main(String[] args) {
        int s = new RomanToInteger().romanToInt("MCMXCIV");
        System.out.println(s);
    }

    public int romanToInt(String s) {
        int intValue = 0;
        for(int i=0; i<s.length()-1; i++){
            if(getIntegerValue(s.charAt(i)) < getIntegerValue(s.charAt(i+1)))
                intValue-=getIntegerValue(s.charAt(i));
            else
                intValue+=getIntegerValue(s.charAt(i));
        }
        return intValue+=getIntegerValue(s.charAt(s.length()-1));
    }

    public int getIntegerValue(char ch){
        int res = 0;
        switch(ch){
            case 'I' : res = 1;
                break;
            case 'V' : res = 5;
                break;
            case 'X' : res = 10;
                break;
            case 'L' : res = 50;
                break;
            case 'C' : res = 100;
                break;
            case 'D' : res = 500;
                break;
            case 'M' : res = 1000;
                break;
        }
        return res;
    }
}
