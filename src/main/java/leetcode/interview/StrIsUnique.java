package main.java.leetcode.interview;

/**
 *
 *  字符是否唯一
 * 难度 ：简单
 *
 * 例如: "abc" 返回 true; "aab" 返回 false;
 *
 * 由于ASCII码字符个数为128个，
 * 因此可以使用两个64位的long变量来存储是否出现某个字符，二进制位1表示出现过， 0表示未出现过
 *
 * @author loukai
 * @date 2020/6/23 16:41
 */
public class StrIsUnique {

    public static void main(String[] args) {

        System.out.println(isUnique("abc9123fjtd"));

    }

    public static boolean isUnique(String str) {
        long h = 0L;
        long l=0L;
        for(char c:str.toCharArray()){
            if (c<64){
                //左移c位 使得bitIndex 的 c位置变为 1
                long bitIndex = 1L<<c;
                //如果l的c位置有值则 & 上bitIndex 就会 = 1;
                if ((bitIndex&l)!=0L){
                    return false;
                }
                // 设置 l 对应的c位置为1
                l|=bitIndex;
            }else {
                long bitIndex = 1L<<c-64;
                if ((bitIndex&h)!=0){
                    return false;
                }
                h|=bitIndex;
            }
        }
        return true;
    }
}
