/* 9-最长回文子串
 *
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

/* 从指定位置查找最长回文子串，如果大于之前的子串，更新结果子串。
 * 返回最长子串长度
 */
int copyMaxPalindrome(char *result, char *s, const int i, const int j, int l)
{
    // 计算长度要用到 i 和 j 的原始值，这里定义两个循环变量替代 i 和 j
    int left = i;
    int right = j;

    // 从中间向两边扩展查找更长回文子串
    while (left-- > 0 && right++ < l - 1)
        if (*(s + left) != *(s + right))
            break;

    // 计算回文子串长度，计算中左边界(left)小于回文子串起始元素，所以实际为：(i - left - 1) * 2 ，然后再加上初始函数进入时回文长度：(j - i + 1)
    int plen = (i - left - 1) * 2 + (j - i + 1);
    size_t rsize = strlen(result);

    // 当前子串更长时拷贝新结果
    if (plen > rsize)
    {
        strncpy(result, s + left + 1, plen);
        return plen;
    }

    return rsize;
}

/* 查找最长的回文子串 */
char *longestPalindrome(char *s)
{
    int rsize;    // 最长子串长度
    char *result; // 存放找到的最长子串

    size_t l = strlen(s);
    result = calloc(1001, sizeof(char)); /* 申请返回数组空间，返回空间加比输入字符长度大1位，在特殊情况下存放 '\0' */

    // 只有1位长度的直接返回
    if (l == 1)
    {
        *result = *s;
        return result;
    }

    // 如果剩余的字符长度小于已发现的最长子串的一半，不可能再发现更长子串，不需要再查找。
    rsize = -2; // 初始取2不方便最后没有发现回文子串的处理，这里用 abs(rsize)
    for (int i = 0; i < l - (abs(rsize) / 2); i++)
    {
        // 2位相等
        if (*(s + i) == *(s + i + 1))
            rsize = copyMaxPalindrome(result, s, i, i + 1, l);

        // 3位相等
        if (*(s + i) == *(s + i + 2))
            rsize = copyMaxPalindrome(result, s, i, i + 2, l);
    }

    // 没有发现回文子串，这是 rsize = -2
    if (rsize < 2)
        *result = *s; // 取第一个字符

    return result;
}

int main(int argc, char const *argv[])
{
    char *result;
    // char *s = "babad";
    // char *s = "a";
    // char *s = "aaaa";
    char *s = "tscvrnsnnwjzkynzxwcltutcvvhdivtmcvwdiwnbmdyfdvdiseyxyiiurpnhuuufarbwalzysetxbaziuuywugfzzmhoessycogxgujmgvnncwacziyybryxjagesgcmqdryfbofwxhikuauulaqyiztkpgmelnoudvlobdsgharsdkzzuxouezcycsafvpmrzanrixubvojyeuhbcpkuuhkxdvldhdtpkdhpiejshrqpgsoslbkfyraqbmrwiykggdlkgvbvrficmiignctsxeqslhzonlfekxexpvnblrfatvetwasewpglimeqemdgdgmemvdsrzpgacpnrbmomngjpiklqgbbalzxiikacwwzbzapqmatqmexxqhssggsyzpnvvpmzngtljlrhrjbnxgpcjuokgxcbzxqhmitcxlzfehwfiwcmwfliedljghrvrahlcoiescsbupitckjfkrfhhfvdlweeeverrwfkujjdwtcwbbbbwctwdjjukfwrreveeewldvfhhfrkfjkctipubscseioclharvrhgjldeilfwmcwifwhefzlxctimhqxzbcxgkoujcpgxnbjrhrljltgnzmpvvnpzysggsshqxxemqtamqpazbzwwcakiixzlabbgqlkipjgnmombrnpcagpzrsdvmemgdgdmeqemilgpwesawtevtafrlbnvpxexkeflnozhlsqexstcngiimcifrvbvgkldggkyiwrmbqaryfkblsosgpqrhsjeiphdkptdhdlvdxkhuukpcbhueyjovbuxirnazrmpvfascyczeuoxuzzkdsrahgsdbolvduonlemgpktziyqaluuaukihxwfobfyrdqmcgsegajxyrbyyizcawcnnvgmjugxgocysseohmzzfguwyuuizabxtesyzlawbrafuuuhnpruiiyxyesidvdfydmbnwidwvcmtvidhvvctutlcwxznykzjwnnsnrvcst";

    result = longestPalindrome(s);
    printf("%s", result);

    return 0;
}
