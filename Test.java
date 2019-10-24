1.
给定一个非负整数 n，计算各位数字都不同的数字 x 的个数，其中 0 ≤ x < 10n 。

class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        
        if(n==0){
            return 1;
        }if(n==1){
            return 10;
        }
        int num=10;
        int a=9;
        int b=1;
        for(int i=2;i<=n;i++){
           b*=a;
           num+=9*(b);
            a--;
        }
        return num;
    }
}

2.
爱丽丝有一手（hand）由整数数组给定的牌。 

现在她想把牌重新排列成组，使得每个组的大小都是 W，且由 W 张连续的牌组成。

如果她可以完成分组就返回 true，否则返回 false。

 

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/hand-of-straights
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
class Solution {
    public boolean isNStraightHand(int[] hand, int W) {
        int[] arr=new int[W];
        for(int x:hand){
            arr[x%W]++;
        }
        for(int i=0;i<W-1;i++){
            if(arr[i]!=arr[i+1]){
                return false;
            }
        }
        return true;
    }
}

