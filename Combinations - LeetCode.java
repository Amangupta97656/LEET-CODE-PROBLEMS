<!DOCTYPE html>
<!-- saved from url=(0053)https://leetcode.com/problems/combinations/solutions/ -->
<html lang="en" data-theme="dark" class="js-focus-visible dark" data-js-focus-visible="" style="color-scheme: dark;"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8"><meta name="viewport" content="width=device-width"><title>Combinations - LeetCode</title><meta name="robots" content="index,follow"><meta name="twitter:card" content="summary_large_image"><meta name="twitter:site" content="@LeetCode"><meta property="og:image" content="https://leetcode.com/static/images/LeetCode_Sharing.png"><meta property="og:locale" content="en_US"><meta property="og:site_name" content="LeetCode"><meta name="description" content="Can you solve this real interview question? Combinations - Given two integers n and k, return all possible combinations of k numbers chosen from the range [1, n].

You may return the answer in any order.

 

Example 1:


Input: n = 4, k = 2
Output: [[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]
Explanation: There are 4 choose 2 = 6 total combinations.
Note that combinations are unordered, i.e., [1,2] and [2,1] are considered to be the same combination.


Example 2:


Input: n = 1, k = 1
Output: [[1]]
Explanation: There is 1 choose 1 = 1 total combination.


 

Constraints:

 * 1 &lt;= n &lt;= 20
 * 1 &lt;= k &lt;= n"><meta property="og:title" content="Combinations - LeetCode"><meta property="og:description" content="Can you solve this real interview question? Combinations - Given two integers n and k, return all possible combinations of k numbers chosen from the range [1, n].

You may return the answer in any order.

 

Example 1:


Input: n = 4, k = 2
Output: [[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]
Explanation: There are 4 choose 2 = 6 total combinations.
Note that combinations are unordered, i.e., [1,2] and [2,1] are considered to be the same combination.


Example 2:


Input: n = 1, k = 1
Output: [[1]]
Explanation: There is 1 choose 1 = 1 total combination.


 

Constraints:

 * 1 &lt;= n &lt;= 20
 * 1 &lt;= k &lt;= n"><meta property="og:url" content="https://leetcode.com/problems/combinations/description"><meta name="next-head-count" content="13"><link rel="preload" href="./Combinations - LeetCode_files/3a176c01f0bb4845.css" as="style"><link rel="stylesheet" href="./Combinations - LeetCode_files/3a176c01f0bb4845.css" data-n-g=""><link rel="preload" href="https://leetcode.com/_next/static/css/252f0105d6c99cc5.css" as="style"><link rel="preload" href="https://leetcode.com/_next/static/css/cbb137c583621905.css" as="style"><noscript data-n-css=""></noscript><style data-n-href="/_next/static/css/252f0105d6c99cc5.css">@font-face{font-family:KaTeX_AMS;font-style:normal;font-weight:400;src:url(/_next/static/media/KaTeX_AMS-Regular.a79f1c31.woff2) format("woff2"),url(/_next/static/media/KaTeX_AMS-Regular.1608a09b.woff) format("woff"),url(/_next/static/media/KaTeX_AMS-Regular.4aafdb68.ttf) format("truetype")}@font-face{font-family:KaTeX_Caligraphic;font-style:normal;font-weight:700;src:url(/_next/static/media/KaTeX_Caligraphic-Bold.ec17d132.woff2) format("woff2"),url(/_next/static/media/KaTeX_Caligraphic-Bold.b6770918.woff) format("woff"),url(/_next/static/media/KaTeX_Caligraphic-Bold.cce5b8ec.ttf) format("truetype")}@font-face{font-family:KaTeX_Caligraphic;font-style:normal;font-weight:400;src:url(/_next/static/media/KaTeX_Caligraphic-Regular.55fac258.woff2) format("woff2"),url(/_next/static/media/KaTeX_Caligraphic-Regular.dad44a7f.woff) format("woff"),url(/_next/static/media/KaTeX_Caligraphic-Regular.07ef19e7.ttf) format("truetype")}@font-face{font-family:KaTeX_Fraktur;font-style:normal;font-weight:700;src:url(/_next/static/media/KaTeX_Fraktur-Bold.d42a5579.woff2) format("woff2"),url(/_next/static/media/KaTeX_Fraktur-Bold.9f256b85.woff) format("woff"),url(/_next/static/media/KaTeX_Fraktur-Bold.b18f59e1.ttf) format("truetype")}@font-face{font-family:KaTeX_Fraktur;font-style:normal;font-weight:400;src:url(/_next/static/media/KaTeX_Fraktur-Regular.d3c882a6.woff2) format("woff2"),url(/_next/static/media/KaTeX_Fraktur-Regular.7c187121.woff) format("woff"),url(/_next/static/media/KaTeX_Fraktur-Regular.ed38e79f.ttf) format("truetype")}@font-face{font-family:KaTeX_Main;font-style:normal;font-weight:700;src:url(/_next/static/media/KaTeX_Main-Bold.c3fb5ac2.woff2) format("woff2"),url(/_next/static/media/KaTeX_Main-Bold.d181c465.woff) format("woff"),url(/_next/static/media/KaTeX_Main-Bold.b74a1a8b.ttf) format("truetype")}@font-face{font-family:KaTeX_Main;font-style:italic;font-weight:700;src:url(/_next/static/media/KaTeX_Main-BoldItalic.6f2bb1df.woff2) format("woff2"),url(/_next/static/media/KaTeX_Main-BoldItalic.e3f82f9d.woff) format("woff"),url(/_next/static/media/KaTeX_Main-BoldItalic.70d8b0a5.ttf) format("truetype")}@font-face{font-family:KaTeX_Main;font-style:italic;font-weight:400;src:url(/_next/static/media/KaTeX_Main-Italic.8916142b.woff2) format("woff2"),url(/_next/static/media/KaTeX_Main-Italic.9024d815.woff) format("woff"),url(/_next/static/media/KaTeX_Main-Italic.47373d1e.ttf) format("truetype")}@font-face{font-family:KaTeX_Main;font-style:normal;font-weight:400;src:url(/_next/static/media/KaTeX_Main-Regular.0462f03b.woff2) format("woff2"),url(/_next/static/media/KaTeX_Main-Regular.7f51fe03.woff) format("woff"),url(/_next/static/media/KaTeX_Main-Regular.b7f8fe9b.ttf) format("truetype")}@font-face{font-family:KaTeX_Math;font-style:italic;font-weight:700;src:url(/_next/static/media/KaTeX_Math-BoldItalic.572d331f.woff2) format("woff2"),url(/_next/static/media/KaTeX_Math-BoldItalic.f1035d8d.woff) format("woff"),url(/_next/static/media/KaTeX_Math-BoldItalic.a879cf83.ttf) format("truetype")}@font-face{font-family:KaTeX_Math;font-style:italic;font-weight:400;src:url(/_next/static/media/KaTeX_Math-Italic.f28c23ac.woff2) format("woff2"),url(/_next/static/media/KaTeX_Math-Italic.5295ba48.woff) format("woff"),url(/_next/static/media/KaTeX_Math-Italic.939bc644.ttf) format("truetype")}@font-face{font-family:"KaTeX_SansSerif";font-style:normal;font-weight:700;src:url(/_next/static/media/KaTeX_SansSerif-Bold.8c5b5494.woff2) format("woff2"),url(/_next/static/media/KaTeX_SansSerif-Bold.bf59d231.woff) format("woff"),url(/_next/static/media/KaTeX_SansSerif-Bold.94e1e8dc.ttf) format("truetype")}@font-face{font-family:"KaTeX_SansSerif";font-style:italic;font-weight:400;src:url(/_next/static/media/KaTeX_SansSerif-Italic.3b1e59b3.woff2) format("woff2"),url(/_next/static/media/KaTeX_SansSerif-Italic.7c9bc82b.woff) format("woff"),url(/_next/static/media/KaTeX_SansSerif-Italic.b4c20c84.ttf) format("truetype")}@font-face{font-family:"KaTeX_SansSerif";font-style:normal;font-weight:400;src:url(/_next/static/media/KaTeX_SansSerif-Regular.ba21ed5f.woff2) format("woff2"),url(/_next/static/media/KaTeX_SansSerif-Regular.74048478.woff) format("woff"),url(/_next/static/media/KaTeX_SansSerif-Regular.d4d7ba48.ttf) format("truetype")}@font-face{font-family:KaTeX_Script;font-style:normal;font-weight:400;src:url(/_next/static/media/KaTeX_Script-Regular.03e9641d.woff2) format("woff2"),url(/_next/static/media/KaTeX_Script-Regular.07505710.woff) format("woff"),url(/_next/static/media/KaTeX_Script-Regular.fe9cbbe1.ttf) format("truetype")}@font-face{font-family:KaTeX_Size1;font-style:normal;font-weight:400;src:url(/_next/static/media/KaTeX_Size1-Regular.eae34984.woff2) format("woff2"),url(/_next/static/media/KaTeX_Size1-Regular.e1e279cb.woff) format("woff"),url(/_next/static/media/KaTeX_Size1-Regular.fabc004a.ttf) format("truetype")}@font-face{font-family:KaTeX_Size2;font-style:normal;font-weight:400;src:url(/_next/static/media/KaTeX_Size2-Regular.5916a24f.woff2) format("woff2"),url(/_next/static/media/KaTeX_Size2-Regular.57727022.woff) format("woff"),url(/_next/static/media/KaTeX_Size2-Regular.d6b476ec.ttf) format("truetype")}@font-face{font-family:KaTeX_Size3;font-style:normal;font-weight:400;src:url(/_next/static/media/KaTeX_Size3-Regular.b4230e7e.woff2) format("woff2"),url(/_next/static/media/KaTeX_Size3-Regular.9acaf01c.woff) format("woff"),url(/_next/static/media/KaTeX_Size3-Regular.a144ef58.ttf) format("truetype")}@font-face{font-family:KaTeX_Size4;font-style:normal;font-weight:400;src:url(/_next/static/media/KaTeX_Size4-Regular.10d95fd3.woff2) format("woff2"),url(/_next/static/media/KaTeX_Size4-Regular.7a996c9d.woff) format("woff"),url(/_next/static/media/KaTeX_Size4-Regular.fbccdabe.ttf) format("truetype")}@font-face{font-family:KaTeX_Typewriter;font-style:normal;font-weight:400;src:url(/_next/static/media/KaTeX_Typewriter-Regular.a8709e36.woff2) format("woff2"),url(/_next/static/media/KaTeX_Typewriter-Regular.6258592b.woff) format("woff"),url(/_next/static/media/KaTeX_Typewriter-Regular.d97aaf4a.ttf) format("truetype")}.katex{font:normal 1.21em KaTeX_Main,Times New Roman,serif;line-height:1.2;text-indent:0;text-rendering:auto}.katex *{-ms-high-contrast-adjust:none!important;border-color:currentColor}.katex .katex-version:after{content:"0.16.4"}.katex .katex-mathml{clip:rect(1px,1px,1px,1px);border:0;height:1px;overflow:hidden;padding:0;position:absolute;width:1px}.katex .katex-html>.newline{display:block}.katex .base{position:relative;white-space:nowrap;width:min-content}.katex .base,.katex .strut{display:inline-block}.katex .textbf{font-weight:700}.katex .textit{font-style:italic}.katex .textrm{font-family:KaTeX_Main}.katex .textsf{font-family:KaTeX_SansSerif}.katex .texttt{font-family:KaTeX_Typewriter}.katex .mathnormal{font-family:KaTeX_Math;font-style:italic}.katex .mathit{font-family:KaTeX_Main;font-style:italic}.katex .mathrm{font-style:normal}.katex .mathbf{font-family:KaTeX_Main;font-weight:700}.katex .boldsymbol{font-family:KaTeX_Math;font-style:italic;font-weight:700}.katex .amsrm,.katex .mathbb,.katex .textbb{font-family:KaTeX_AMS}.katex .mathcal{font-family:KaTeX_Caligraphic}.katex .mathfrak,.katex .textfrak{font-family:KaTeX_Fraktur}.katex .mathtt{font-family:KaTeX_Typewriter}.katex .mathscr,.katex .textscr{font-family:KaTeX_Script}.katex .mathsf,.katex .textsf{font-family:KaTeX_SansSerif}.katex .mathboldsf,.katex .textboldsf{font-family:KaTeX_SansSerif;font-weight:700}.katex .mathitsf,.katex .textitsf{font-family:KaTeX_SansSerif;font-style:italic}.katex .mainrm{font-family:KaTeX_Main;font-style:normal}.katex .vlist-t{border-collapse:collapse;display:inline-table;table-layout:fixed}.katex .vlist-r{display:table-row}.katex .vlist{display:table-cell;position:relative;vertical-align:bottom}.katex .vlist>span{display:block;height:0;position:relative}.katex .vlist>span>span{display:inline-block}.katex .vlist>span>.pstrut{overflow:hidden;width:0}.katex .vlist-t2{margin-right:-2px}.katex .vlist-s{display:table-cell;font-size:1px;min-width:2px;vertical-align:bottom;width:2px}.katex .vbox{align-items:baseline;display:inline-flex;flex-direction:column}.katex .hbox{width:100%}.katex .hbox,.katex .thinbox{display:inline-flex;flex-direction:row}.katex .thinbox{max-width:0;width:0}.katex .msupsub{text-align:left}.katex .mfrac>span>span{text-align:center}.katex .mfrac .frac-line{border-bottom-style:solid;display:inline-block;width:100%}.katex .hdashline,.katex .hline,.katex .mfrac .frac-line,.katex .overline .overline-line,.katex .rule,.katex .underline .underline-line{min-height:1px}.katex .mspace{display:inline-block}.katex .clap,.katex .llap,.katex .rlap{position:relative;width:0}.katex .clap>.inner,.katex .llap>.inner,.katex .rlap>.inner{position:absolute}.katex .clap>.fix,.katex .llap>.fix,.katex .rlap>.fix{display:inline-block}.katex .llap>.inner{right:0}.katex .clap>.inner,.katex .rlap>.inner{left:0}.katex .clap>.inner>span{margin-left:-50%;margin-right:50%}.katex .rule{border:0 solid;display:inline-block;position:relative}.katex .hline,.katex .overline .overline-line,.katex .underline .underline-line{border-bottom-style:solid;display:inline-block;width:100%}.katex .hdashline{border-bottom-style:dashed;display:inline-block;width:100%}.katex .sqrt>.root{margin-left:.27777778em;margin-right:-.55555556em}.katex .fontsize-ensurer.reset-size1.size1,.katex .sizing.reset-size1.size1{font-size:1em}.katex .fontsize-ensurer.reset-size1.size2,.katex .sizing.reset-size1.size2{font-size:1.2em}.katex .fontsize-ensurer.reset-size1.size3,.katex .sizing.reset-size1.size3{font-size:1.4em}.katex .fontsize-ensurer.reset-size1.size4,.katex .sizing.reset-size1.size4{font-size:1.6em}.katex .fontsize-ensurer.reset-size1.size5,.katex .sizing.reset-size1.size5{font-size:1.8em}.katex .fontsize-ensurer.reset-size1.size6,.katex .sizing.reset-size1.size6{font-size:2em}.katex .fontsize-ensurer.reset-size1.size7,.katex .sizing.reset-size1.size7{font-size:2.4em}.katex .fontsize-ensurer.reset-size1.size8,.katex .sizing.reset-size1.size8{font-size:2.88em}.katex .fontsize-ensurer.reset-size1.size9,.katex .sizing.reset-size1.size9{font-size:3.456em}.katex .fontsize-ensurer.reset-size1.size10,.katex .sizing.reset-size1.size10{font-size:4.148em}.katex .fontsize-ensurer.reset-size1.size11,.katex .sizing.reset-size1.size11{font-size:4.976em}.katex .fontsize-ensurer.reset-size2.size1,.katex .sizing.reset-size2.size1{font-size:.83333333em}.katex .fontsize-ensurer.reset-size2.size2,.katex .sizing.reset-size2.size2{font-size:1em}.katex .fontsize-ensurer.reset-size2.size3,.katex .sizing.reset-size2.size3{font-size:1.16666667em}.katex .fontsize-ensurer.reset-size2.size4,.katex .sizing.reset-size2.size4{font-size:1.33333333em}.katex .fontsize-ensurer.reset-size2.size5,.katex .sizing.reset-size2.size5{font-size:1.5em}.katex .fontsize-ensurer.reset-size2.size6,.katex .sizing.reset-size2.size6{font-size:1.66666667em}.katex .fontsize-ensurer.reset-size2.size7,.katex .sizing.reset-size2.size7{font-size:2em}.katex .fontsize-ensurer.reset-size2.size8,.katex .sizing.reset-size2.size8{font-size:2.4em}.katex .fontsize-ensurer.reset-size2.size9,.katex .sizing.reset-size2.size9{font-size:2.88em}.katex .fontsize-ensurer.reset-size2.size10,.katex .sizing.reset-size2.size10{font-size:3.45666667em}.katex .fontsize-ensurer.reset-size2.size11,.katex .sizing.reset-size2.size11{font-size:4.14666667em}.katex .fontsize-ensurer.reset-size3.size1,.katex .sizing.reset-size3.size1{font-size:.71428571em}.katex .fontsize-ensurer.reset-size3.size2,.katex .sizing.reset-size3.size2{font-size:.85714286em}.katex .fontsize-ensurer.reset-size3.size3,.katex .sizing.reset-size3.size3{font-size:1em}.katex .fontsize-ensurer.reset-size3.size4,.katex .sizing.reset-size3.size4{font-size:1.14285714em}.katex .fontsize-ensurer.reset-size3.size5,.katex .sizing.reset-size3.size5{font-size:1.28571429em}.katex .fontsize-ensurer.reset-size3.size6,.katex .sizing.reset-size3.size6{font-size:1.42857143em}.katex .fontsize-ensurer.reset-size3.size7,.katex .sizing.reset-size3.size7{font-size:1.71428571em}.katex .fontsize-ensurer.reset-size3.size8,.katex .sizing.reset-size3.size8{font-size:2.05714286em}.katex .fontsize-ensurer.reset-size3.size9,.katex .sizing.reset-size3.size9{font-size:2.46857143em}.katex .fontsize-ensurer.reset-size3.size10,.katex .sizing.reset-size3.size10{font-size:2.96285714em}.katex .fontsize-ensurer.reset-size3.size11,.katex .sizing.reset-size3.size11{font-size:3.55428571em}.katex .fontsize-ensurer.reset-size4.size1,.katex .sizing.reset-size4.size1{font-size:.625em}.katex .fontsize-ensurer.reset-size4.size2,.katex .sizing.reset-size4.size2{font-size:.75em}.katex .fontsize-ensurer.reset-size4.size3,.katex .sizing.reset-size4.size3{font-size:.875em}.katex .fontsize-ensurer.reset-size4.size4,.katex .sizing.reset-size4.size4{font-size:1em}.katex .fontsize-ensurer.reset-size4.size5,.katex .sizing.reset-size4.size5{font-size:1.125em}.katex .fontsize-ensurer.reset-size4.size6,.katex .sizing.reset-size4.size6{font-size:1.25em}.katex .fontsize-ensurer.reset-size4.size7,.katex .sizing.reset-size4.size7{font-size:1.5em}.katex .fontsize-ensurer.reset-size4.size8,.katex .sizing.reset-size4.size8{font-size:1.8em}.katex .fontsize-ensurer.reset-size4.size9,.katex .sizing.reset-size4.size9{font-size:2.16em}.katex .fontsize-ensurer.reset-size4.size10,.katex .sizing.reset-size4.size10{font-size:2.5925em}.katex .fontsize-ensurer.reset-size4.size11,.katex .sizing.reset-size4.size11{font-size:3.11em}.katex .fontsize-ensurer.reset-size5.size1,.katex .sizing.reset-size5.size1{font-size:.55555556em}.katex .fontsize-ensurer.reset-size5.size2,.katex .sizing.reset-size5.size2{font-size:.66666667em}.katex .fontsize-ensurer.reset-size5.size3,.katex .sizing.reset-size5.size3{font-size:.77777778em}.katex .fontsize-ensurer.reset-size5.size4,.katex .sizing.reset-size5.size4{font-size:.88888889em}.katex .fontsize-ensurer.reset-size5.size5,.katex .sizing.reset-size5.size5{font-size:1em}.katex .fontsize-ensurer.reset-size5.size6,.katex .sizing.reset-size5.size6{font-size:1.11111111em}.katex .fontsize-ensurer.reset-size5.size7,.katex .sizing.reset-size5.size7{font-size:1.33333333em}.katex .fontsize-ensurer.reset-size5.size8,.katex .sizing.reset-size5.size8{font-size:1.6em}.katex .fontsize-ensurer.reset-size5.size9,.katex .sizing.reset-size5.size9{font-size:1.92em}.katex .fontsize-ensurer.reset-size5.size10,.katex .sizing.reset-size5.size10{font-size:2.30444444em}.katex .fontsize-ensurer.reset-size5.size11,.katex .sizing.reset-size5.size11{font-size:2.76444444em}.katex .fontsize-ensurer.reset-size6.size1,.katex .sizing.reset-size6.size1{font-size:.5em}.katex .fontsize-ensurer.reset-size6.size2,.katex .sizing.reset-size6.size2{font-size:.6em}.katex .fontsize-ensurer.reset-size6.size3,.katex .sizing.reset-size6.size3{font-size:.7em}.katex .fontsize-ensurer.reset-size6.size4,.katex .sizing.reset-size6.size4{font-size:.8em}.katex .fontsize-ensurer.reset-size6.size5,.katex .sizing.reset-size6.size5{font-size:.9em}.katex .fontsize-ensurer.reset-size6.size6,.katex .sizing.reset-size6.size6{font-size:1em}.katex .fontsize-ensurer.reset-size6.size7,.katex .sizing.reset-size6.size7{font-size:1.2em}.katex .fontsize-ensurer.reset-size6.size8,.katex .sizing.reset-size6.size8{font-size:1.44em}.katex .fontsize-ensurer.reset-size6.size9,.katex .sizing.reset-size6.size9{font-size:1.728em}.katex .fontsize-ensurer.reset-size6.size10,.katex .sizing.reset-size6.size10{font-size:2.074em}.katex .fontsize-ensurer.reset-size6.size11,.katex .sizing.reset-size6.size11{font-size:2.488em}.katex .fontsize-ensurer.reset-size7.size1,.katex .sizing.reset-size7.size1{font-size:.41666667em}.katex .fontsize-ensurer.reset-size7.size2,.katex .sizing.reset-size7.size2{font-size:.5em}.katex .fontsize-ensurer.reset-size7.size3,.katex .sizing.reset-size7.size3{font-size:.58333333em}.katex .fontsize-ensurer.reset-size7.size4,.katex .sizing.reset-size7.size4{font-size:.66666667em}.katex .fontsize-ensurer.reset-size7.size5,.katex .sizing.reset-size7.size5{font-size:.75em}.katex .fontsize-ensurer.reset-size7.size6,.katex .sizing.reset-size7.size6{font-size:.83333333em}.katex .fontsize-ensurer.reset-size7.size7,.katex .sizing.reset-size7.size7{font-size:1em}.katex .fontsize-ensurer.reset-size7.size8,.katex .sizing.reset-size7.size8{font-size:1.2em}.katex .fontsize-ensurer.reset-size7.size9,.katex .sizing.reset-size7.size9{font-size:1.44em}.katex .fontsize-ensurer.reset-size7.size10,.katex .sizing.reset-size7.size10{font-size:1.72833333em}.katex .fontsize-ensurer.reset-size7.size11,.katex .sizing.reset-size7.size11{font-size:2.07333333em}.katex .fontsize-ensurer.reset-size8.size1,.katex .sizing.reset-size8.size1{font-size:.34722222em}.katex .fontsize-ensurer.reset-size8.size2,.katex .sizing.reset-size8.size2{font-size:.41666667em}.katex .fontsize-ensurer.reset-size8.size3,.katex .sizing.reset-size8.size3{font-size:.48611111em}.katex .fontsize-ensurer.reset-size8.size4,.katex .sizing.reset-size8.size4{font-size:.55555556em}.katex .fontsize-ensurer.reset-size8.size5,.katex .sizing.reset-size8.size5{font-size:.625em}.katex .fontsize-ensurer.reset-size8.size6,.katex .sizing.reset-size8.size6{font-size:.69444444em}.katex .fontsize-ensurer.reset-size8.size7,.katex .sizing.reset-size8.size7{font-size:.83333333em}.katex .fontsize-ensurer.reset-size8.size8,.katex .sizing.reset-size8.size8{font-size:1em}.katex .fontsize-ensurer.reset-size8.size9,.katex .sizing.reset-size8.size9{font-size:1.2em}.katex .fontsize-ensurer.reset-size8.size10,.katex .sizing.reset-size8.size10{font-size:1.44027778em}.katex .fontsize-ensurer.reset-size8.size11,.katex .sizing.reset-size8.size11{font-size:1.72777778em}.katex .fontsize-ensurer.reset-size9.size1,.katex .sizing.reset-size9.size1{font-size:.28935185em}.katex .fontsize-ensurer.reset-size9.size2,.katex .sizing.reset-size9.size2{font-size:.34722222em}.katex .fontsize-ensurer.reset-size9.size3,.katex .sizing.reset-size9.size3{font-size:.40509259em}.katex .fontsize-ensurer.reset-size9.size4,.katex .sizing.reset-size9.size4{font-size:.46296296em}.katex .fontsize-ensurer.reset-size9.size5,.katex .sizing.reset-size9.size5{font-size:.52083333em}.katex .fontsize-ensurer.reset-size9.size6,.katex .sizing.reset-size9.size6{font-size:.5787037em}.katex .fontsize-ensurer.reset-size9.size7,.katex .sizing.reset-size9.size7{font-size:.69444444em}.katex .fontsize-ensurer.reset-size9.size8,.katex .sizing.reset-size9.size8{font-size:.83333333em}.katex .fontsize-ensurer.reset-size9.size9,.katex .sizing.reset-size9.size9{font-size:1em}.katex .fontsize-ensurer.reset-size9.size10,.katex .sizing.reset-size9.size10{font-size:1.20023148em}.katex .fontsize-ensurer.reset-size9.size11,.katex .sizing.reset-size9.size11{font-size:1.43981481em}.katex .fontsize-ensurer.reset-size10.size1,.katex .sizing.reset-size10.size1{font-size:.24108004em}.katex .fontsize-ensurer.reset-size10.size2,.katex .sizing.reset-size10.size2{font-size:.28929605em}.katex .fontsize-ensurer.reset-size10.size3,.katex .sizing.reset-size10.size3{font-size:.33751205em}.katex .fontsize-ensurer.reset-size10.size4,.katex .sizing.reset-size10.size4{font-size:.38572806em}.katex .fontsize-ensurer.reset-size10.size5,.katex .sizing.reset-size10.size5{font-size:.43394407em}.katex .fontsize-ensurer.reset-size10.size6,.katex .sizing.reset-size10.size6{font-size:.48216008em}.katex .fontsize-ensurer.reset-size10.size7,.katex .sizing.reset-size10.size7{font-size:.57859209em}.katex .fontsize-ensurer.reset-size10.size8,.katex .sizing.reset-size10.size8{font-size:.69431051em}.katex .fontsize-ensurer.reset-size10.size9,.katex .sizing.reset-size10.size9{font-size:.83317261em}.katex .fontsize-ensurer.reset-size10.size10,.katex .sizing.reset-size10.size10{font-size:1em}.katex .fontsize-ensurer.reset-size10.size11,.katex .sizing.reset-size10.size11{font-size:1.19961427em}.katex .fontsize-ensurer.reset-size11.size1,.katex .sizing.reset-size11.size1{font-size:.20096463em}.katex .fontsize-ensurer.reset-size11.size2,.katex .sizing.reset-size11.size2{font-size:.24115756em}.katex .fontsize-ensurer.reset-size11.size3,.katex .sizing.reset-size11.size3{font-size:.28135048em}.katex .fontsize-ensurer.reset-size11.size4,.katex .sizing.reset-size11.size4{font-size:.32154341em}.katex .fontsize-ensurer.reset-size11.size5,.katex .sizing.reset-size11.size5{font-size:.36173633em}.katex .fontsize-ensurer.reset-size11.size6,.katex .sizing.reset-size11.size6{font-size:.40192926em}.katex .fontsize-ensurer.reset-size11.size7,.katex .sizing.reset-size11.size7{font-size:.48231511em}.katex .fontsize-ensurer.reset-size11.size8,.katex .sizing.reset-size11.size8{font-size:.57877814em}.katex .fontsize-ensurer.reset-size11.size9,.katex .sizing.reset-size11.size9{font-size:.69453376em}.katex .fontsize-ensurer.reset-size11.size10,.katex .sizing.reset-size11.size10{font-size:.83360129em}.katex .fontsize-ensurer.reset-size11.size11,.katex .sizing.reset-size11.size11{font-size:1em}.katex .delimsizing.size1{font-family:KaTeX_Size1}.katex .delimsizing.size2{font-family:KaTeX_Size2}.katex .delimsizing.size3{font-family:KaTeX_Size3}.katex .delimsizing.size4{font-family:KaTeX_Size4}.katex .delimsizing.mult .delim-size1>span{font-family:KaTeX_Size1}.katex .delimsizing.mult .delim-size4>span{font-family:KaTeX_Size4}.katex .nulldelimiter{display:inline-block;width:.12em}.katex .delimcenter,.katex .op-symbol{position:relative}.katex .op-symbol.small-op{font-family:KaTeX_Size1}.katex .op-symbol.large-op{font-family:KaTeX_Size2}.katex .accent>.vlist-t,.katex .op-limits>.vlist-t{text-align:center}.katex .accent .accent-body{position:relative}.katex .accent .accent-body:not(.accent-full){width:0}.katex .overlay{display:block}.katex .mtable .vertical-separator{display:inline-block;min-width:1px}.katex .mtable .arraycolsep{display:inline-block}.katex .mtable .col-align-c>.vlist-t{text-align:center}.katex .mtable .col-align-l>.vlist-t{text-align:left}.katex .mtable .col-align-r>.vlist-t{text-align:right}.katex .svg-align{text-align:left}.katex svg{fill:currentColor;stroke:currentColor;fill-rule:nonzero;fill-opacity:1;stroke-width:1;stroke-linecap:butt;stroke-linejoin:miter;stroke-miterlimit:4;stroke-dasharray:none;stroke-dashoffset:0;stroke-opacity:1;display:block;height:inherit;position:absolute;width:100%}.katex svg path{stroke:none}.katex img{border-style:none;max-height:none;max-width:none;min-height:0;min-width:0}.katex .stretchy{display:block;overflow:hidden;position:relative;width:100%}.katex .stretchy:after,.katex .stretchy:before{content:""}.katex .hide-tail{overflow:hidden;position:relative;width:100%}.katex .halfarrow-left{left:0;overflow:hidden;position:absolute;width:50.2%}.katex .halfarrow-right{overflow:hidden;position:absolute;right:0;width:50.2%}.katex .brace-left{left:0;overflow:hidden;position:absolute;width:25.1%}.katex .brace-center{left:25%;overflow:hidden;position:absolute;width:50%}.katex .brace-right{overflow:hidden;position:absolute;right:0;width:25.1%}.katex .x-arrow-pad{padding:0 .5em}.katex .cd-arrow-pad{padding:0 .55556em 0 .27778em}.katex .mover,.katex .munder,.katex .x-arrow{text-align:center}.katex .boxpad{padding:0 .3em}.katex .fbox,.katex .fcolorbox{border:.04em solid;box-sizing:border-box}.katex .cancel-pad{padding:0 .2em}.katex .cancel-lap{margin-left:-.2em;margin-right:-.2em}.katex .sout{border-bottom-style:solid;border-bottom-width:.08em}.katex .angl{border-right:.049em solid;border-top:.049em solid;box-sizing:border-box;margin-right:.03889em}.katex .anglpad{padding:0 .03889em}.katex .eqn-num:before{content:"(" counter(katexEqnNo) ")";counter-increment:katexEqnNo}.katex .mml-eqn-num:before{content:"(" counter(mmlEqnNo) ")";counter-increment:mmlEqnNo}.katex .mtr-glue{width:50%}.katex .cd-vert-arrow{display:inline-block;position:relative}.katex .cd-label-left{display:inline-block;position:absolute;right:calc(50% + .3em);text-align:left}.katex .cd-label-right{display:inline-block;left:calc(50% + .3em);position:absolute;text-align:right}.katex-display{display:block;margin:1em 0;text-align:center}.katex-display>.katex{display:block;text-align:center;white-space:nowrap}.katex-display>.katex>.katex-html{display:block;position:relative}.katex-display>.katex>.katex-html>.tag{position:absolute;right:0}.katex-display.leqno>.katex>.katex-html>.tag{left:0;right:auto}.katex-display.fleqn>.katex{padding-left:2em;text-align:left}body{counter-reset:katexEqnNo mmlEqnNo}</style><style data-n-href="/_next/static/css/cbb137c583621905.css">.debugger_monacoDebuggerBreakpoint__43nXZ:after{background-color:#d47d78}.debugger_monacoDebuggerBreakpointHovered__gfp_3:after,.debugger_monacoDebuggerBreakpoint__43nXZ:after{border-radius:100%;content:"";cursor:pointer;display:block;height:10px;width:10px}.debugger_monacoDebuggerBreakpointHovered__gfp_3:after{background-color:#eabebc}.debugger_monacoDebuggerBreakpointHoveredDisabled__g383c:after{background-color:#efd0cf;border-radius:100%;content:"";cursor:not-allowed;display:block;height:10px;width:10px}.debugger_monacoHighlightLine__FO1Et{background-color:#d47d7833;border:1px solid #d47d78;border-right:none;border-left:none}.input_input-container__SZzNg:hover .input_clear-icon__WR5Cb{display:inline}.input_input-container__SZzNg:hover .input_right-icon__DWVxd{display:none}.input_input-container__SZzNg input::-webkit-contacts-auto-fill-button{display:none!important;pointer-events:none;position:absolute;right:0;visibility:hidden}.Box_box__0mKsf{background:#f7f8fa;border-radius:21px;box-shadow:0 1px 3px #0000000a,0 10px 28px -4px #00000029;font-family:PingFang SC,sans-serif;left:50%;overflow:hidden;position:fixed;top:50%;transform:translateX(-50%) translateY(-50%);width:629px;z-index:1000}.dark .Box_box__0mKsf{background:#1a1a1a}.Box_mask__07luv{background:#0000004d;height:100%;left:0;position:fixed;top:0;width:100%;z-index:1000}.Header_header__CtwcI{background:linear-gradient(87.91deg,#eeca94 23.26%,#f5e0c2 75.35%);height:100px;overflow:hidden}.Header_logo__frF2X{right:32px;top:0}.Header_logo__frF2X,.Header_user__4fzjf{position:absolute}.Header_user__4fzjf{align-items:center;display:flex;flex-direction:row;gap:16px;height:52px;left:32px;padding:0;top:24px}.Header_avatar__Ga5nV{background-position:50% 50%;background-repeat:no-repeat;background-size:cover;border-radius:50%;flex-grow:0;height:50px;order:0;width:50px}.Header_userInner__PEbt0{align-items:flex-start;flex:none;flex-direction:column;flex-grow:0;height:52px;order:1}.Header_nick__O_C6d,.Header_userInner__PEbt0{display:flex;padding:0}.Header_nick__O_C6d{align-items:flex-end;color:#262626bf;flex:none;flex-direction:row;flex-grow:0;font-size:20px;gap:4px;height:28px;order:0}.Header_tag__BCh02{align-items:center;background:#0000000d;border-radius:12px;color:#3c3c4399;display:flex;font-size:12px;font-weight:400;height:24px;padding:4px 0 4px 8px;width:72px}.Header_icon__H_hJI{background-position:50% 50%;background-repeat:no-repeat;background-size:contain;height:16px;margin-right:4px;width:16px}.Header_premium__PVj15{background-image:url(https://static.leetcode-cn.com/cn-frontendx-assets/development/_next/static/images/premium-plus-b81e87ee9afdf123c5f0b97ab8abdd0c.png)}.Header_free__0h4bR{background-image:url("data:image/svg+xml;charset=utf-8,%3Csvg width='16' height='16' fill='none' xmlns='http://www.w3.org/2000/svg'%3E%3Cpath d='M6.475 1.054a3.05 3.05 0 0 1 3.05 0l3.728 2.152a3.05 3.05 0 0 1 1.525 2.642v4.305a3.05 3.05 0 0 1-1.525 2.64l-3.728 2.153a3.05 3.05 0 0 1-3.05 0l-3.728-2.152a3.05 3.05 0 0 1-1.525-2.641V5.848a3.05 3.05 0 0 1 1.525-2.642l3.728-2.152Z' fill='url(%23a)' stroke='url(%23b)' stroke-width='.3'/%3E%3Cpath d='M7.918 8.325 8 8.378l.082-.053 3.284-2.134a.25.25 0 0 1 .384.239l-.482 4.046a.65.65 0 0 1-.645.574H5.377a.65.65 0 0 1-.645-.574L4.25 6.43a.25.25 0 0 1 .385-.24l3.283 2.135Z' fill='url(%23c)' stroke='url(%23d)' stroke-width='.3'/%3E%3Cpath d='M7.783 4.882a.25.25 0 0 1 .434 0l2.969 5.195a.65.65 0 0 1-.565.973H5.378a.65.65 0 0 1-.564-.973l2.969-5.195Z' fill='url(%23e)' stroke='url(%23f)' stroke-width='.3'/%3E%3Cdefs%3E%3ClinearGradient id='a' x1='-1.675' y1='7.906' x2='7.445' y2='17.483' gradientUnits='userSpaceOnUse'%3E%3Cstop stop-color='silver'/%3E%3Cstop offset='1' stop-color='%23A09F9F'/%3E%3C/linearGradient%3E%3ClinearGradient id='b' x1='-.219' y1='5.129' x2='6.835' y2='16.285' gradientUnits='userSpaceOnUse'%3E%3Cstop stop-color='%23E0DCDC'/%3E%3Cstop offset='1' stop-color='%23A19F9F'/%3E%3C/linearGradient%3E%3ClinearGradient id='c' x1='1.166' y1='8.547' x2='5.276' y2='14.919' gradientUnits='userSpaceOnUse'%3E%3Cstop stop-color='%23EDEDED'/%3E%3Cstop offset='1' stop-color='%23D4D4D4'/%3E%3C/linearGradient%3E%3ClinearGradient id='d' x1='2.698' y1='7.657' x2='5.11' y2='13.288' gradientUnits='userSpaceOnUse'%3E%3Cstop stop-color='%23F3F3F3'/%3E%3Cstop offset='1' stop-color='%23CFCFCF'/%3E%3C/linearGradient%3E%3ClinearGradient id='e' x1='4.457' y1='7.126' x2='7.335' y2='13.035' gradientUnits='userSpaceOnUse'%3E%3Cstop stop-color='%23F5F5F5'/%3E%3Cstop offset='1' stop-color='%23DCDCDC'/%3E%3C/linearGradient%3E%3ClinearGradient id='f' x1='3.46' y1='6.608' x2='6.228' y2='12.677' gradientUnits='userSpaceOnUse'%3E%3Cstop stop-color='%23fff'/%3E%3Cstop offset='1' stop-color='%23DEDEDE'/%3E%3C/linearGradient%3E%3C/defs%3E%3C/svg%3E")}.Header_close__JeVCt{cursor:pointer;height:24px;position:absolute;right:24px;top:24px;width:24px}.Sku_box__3c1Sb{align-items:stretch;display:flex;flex-direction:row;gap:16px;height:130px;margin:16px;padding:0}.Sku_item__Obmax{border:2px solid #0000;border-radius:13px;overflow:hidden;position:relative;-webkit-user-select:none;user-select:none}.Sku_active__qHxVv{border-color:#ffa116;box-shadow:0 2px 12px #ff9d1633}.Sku_content__61ob8{background:#fff;cursor:pointer;font-weight:400;padding:24px 0;position:relative;text-align:center}.dark .Sku_content__61ob8{background:#282828}.Sku_active__qHxVv .Sku_content__61ob8{background:#ffa1161a}.dark .Sku_active__qHxVv .Sku_content__61ob8{background:#ff9d0a1a}.Sku_sku365__atT2G,.Sku_sku90__qXtX3{width:150px}.Sku_sku30__BFLPT{width:265px}.Sku_days__JAhuu{color:#262626;font-size:14px;line-height:22px}.dark .Sku_days__JAhuu{color:#fff}.Sku_average__vICFW{color:#3c3c4399;font-size:12px;line-height:16px;margin-top:4px}.dark .Sku_average__vICFW{color:#eff2f699}.Item365_best__koJug{background:linear-gradient(90deg,#ffa116,#ffba49 95%);border-radius:0 0 0 13px;color:#fff;font-size:12px;font-weight:500;height:24px;line-height:24px;position:absolute;right:0;text-align:center;top:0;width:60px}.dark .Item365_best__koJug{background:linear-gradient(90deg,#ff9d0a,#ffba49 95%)}.Price_price__jeYkN{font-family:DIN Alternate,sans-serif;font-style:normal;font-weight:700;height:40px;position:relative;text-align:center}.Price_on__3_cKW{color:#ffa116}.dark .Price_on__3_cKW{color:#ff9d0a}.Price_off__zum0b{color:#262626}.dark .Price_off__zum0b{color:#fff}.Price_unit__VNpaj{color:#262626bf;display:inline-block;font-size:16px;height:20px;margin-right:4px;vertical-align:initial;width:12px}.dark .Price_unit__VNpaj{color:#eff1f6bf}.Price_on__3_cKW .Price_unit__VNpaj{color:#ffa116}.dark .Price_on__3_cKW .Price_unit__VNpaj{color:#ff9d0a}.Price_value__WagVa{font-size:32px;vertical-align:initial}.Item30_multi__WSeb0{align-items:center;display:flex}.Item30_child__jjMpp{flex:1 1}.Item30_line__kSs3B{border-left:1px solid #000a200d;height:66px}.Consecutive_box__iT8S2{align-items:center;border-radius:0 13px;display:flex;font-size:11px;font-weight:400;height:24px;justify-content:center;line-height:13px;position:absolute;right:0;top:0;width:108px}.Consecutive_off__pcOMj{background:#007aff14;color:#3c3c434d}.dark .Consecutive_off__pcOMj{background:#ffffff12;color:#ebebf54d}.Consecutive_on__VAaEE{background:#007aff14;color:#007aff}.dark .Consecutive_on__VAaEE{background:#0a84ff2e;color:#0a84ff}.Consecutive_title__K__B_{margin-right:8px}.Toggle_box__DHiW_{background:#bfbfbf;border-radius:16px;height:16px;overflow:hidden;padding:2px;transition-duration:.15s;transition-property:all;transition-timing-function:cubic-bezier(.4,0,.2,1);width:32px}.Toggle_disabled__GnESS{cursor:not-allowed}.Toggle_inner__49M_c{background:#fff;border-radius:6px;height:12px;transition-duration:.15s;transition-property:all;transition-timing-function:cubic-bezier(.4,0,.2,1);width:12px}.Toggle_on__yH5Iq{background:#007aff}.Toggle_on__yH5Iq .Toggle_inner__49M_c{transform:translateX(16px)}.Student_box__sOiKU{background:#007aff14;border-radius:8px;height:40px;margin:16px;overflow:hidden;position:relative}.dark .Student_box__sOiKU{background:#0a84ff1f}.Student_icon__fBh3X{bottom:0;left:0;position:absolute}.Student_icon__fBh3X path{fill:#007aff;fill-opacity:.08}.dark .Student_icon__fBh3X path{fill:#0a84ff;fill-opacity:.12}.Student_content__NSamf{align-items:center;display:flex;height:100%;left:0;padding:9px 16px;position:absolute;top:0;width:100%}.Student_title__nFxlg{color:#262626;font-size:14px;line-height:22px;margin-right:16px}.dark .Student_title__nFxlg{color:#fff}.Student_desc__ZT2LL{color:#262626bf;flex:auto;font-size:12px;font-weight:400}.dark .Student_desc__ZT2LL{color:#eff1f6bf}.Student_link__4_dOF{color:#262626bf;font-size:12px;font-weight:500}.dark .Student_link__4_dOF{color:#eff1f6bf}.Pay_box__tHAzH{align-items:stretch;background:#fff;border-radius:13px;display:flex;gap:16px;margin:16px;padding:16px}.dark .Pay_box__tHAzH{background:#282828}.Pay_right__fVimP{flex:auto}.Gift_box__UjbI8{background:#00000008;border-radius:8px;padding:12px 0 0 12px;position:relative;width:115px}.dark .Gift_box__UjbI8{background:#ffffff0d}.Gift_title__oEDmn{color:#000;font-size:12px;font-weight:500;line-height:16px;margin-bottom:12px}.dark .Gift_title__oEDmn{color:#ebebf5b3}.Gift_list__7W_wS{height:153px;overflow-x:hidden;overflow-y:scroll}.Gift_item__MFW75{background-position:50% 50%;background-repeat:no-repeat;background-size:cover;border-radius:5px;height:52px;margin-bottom:8px;overflow:hidden;position:relative;width:91px}.Gift_item__MFW75:before{background:linear-gradient(0deg,#0003,#0003);content:" ";display:block;height:100%;left:0;position:absolute;top:0;width:100%}.Gift_name__Ym8WC{bottom:6px;color:#fff;font-size:12px;font-weight:500;left:4px;position:absolute}.Coupon_box__EkqgP{height:24px;position:relative}.Coupon_icon___H7ys{display:inline-block;margin-left:4px;margin-right:8px}.Coupon_icon___H7ys,.Coupon_title__S0nZJ{vertical-align:middle}.Coupon_title__S0nZJ{color:#000;font-size:14px;font-weight:500;line-height:22px}.dark .Coupon_title__S0nZJ{color:#fff}.Coupon_count__TI1b5{color:#3c3c4399;font-size:12px;font-weight:500;line-height:18px;position:absolute;right:0;top:0}.dark .Coupon_count__TI1b5{color:#eff2f699}.CouponDialogue_box__TwQeY{align-items:flex-start;background:#fff;border-radius:8px;box-shadow:0 1px 3px #0000000a,0 6px 16px #0000001f;display:flex;flex-direction:column;gap:8px;left:0;padding:13px 20px;position:absolute;top:28px;width:100%;z-index:1}.dark .CouponDialogue_box__TwQeY{background:#2e2e2f}.CouponDialogue_item__hxL8m{color:#262626bf;cursor:pointer;font-size:14px;font-weight:400;line-height:22px}.dark .CouponDialogue_item__hxL8m{color:#eff2f699}.Line_line__9GBBH{border-top:1px dashed #000a201c;margin:12px 0}.dark .Line_line__9GBBH{border-top:1px dashed #f7faff2e}.OrderDetail_box__Np5_x{align-items:stretch;display:flex}.OrderDetail_left__Bu6iw{background:#fff;height:120px;margin-right:16px;width:120px}.OrderDetail_right__AeVLd{flex:auto}.MoneyDetail_box___68s5{color:#3c3c4399;font-size:14px;font-weight:400;line-height:22px;margin-bottom:32px}.dark .MoneyDetail_box___68s5{color:#eff2f699}.MoneyDetail_unit__gRJO3{color:#ffa116;font-family:DIN Alternate,sans-serif;font-size:14px;font-weight:700;line-height:22px;margin-right:4px}.dark .MoneyDetail_unit__gRJO3{color:#ff9d0a}.MoneyDetail_money__2Gtj7{color:#ffa116;font-family:DIN Alternate,sans-serif;font-size:32px;font-weight:700;line-height:40px;margin-right:4px}.MoneyDetail_originalPrice__xpeVb{margin-right:8px;text-decoration-line:line-through}.dark .MoneyDetail_money__2Gtj7{color:#ff9d0a}.MoneyDetail_detail__gtQkI{align-items:center;display:inline-flex}.MoneyDetail_locator__Hqj46{position:relative}.DetailTip_box__1jAeX{bottom:0;height:130px;left:-140px;position:absolute;width:240px;z-index:1000}.DetailTip_content__9gZ4H{position:relative}.DetailTip_arrow__V3iZE{background:0 0;bottom:0;height:22px;left:50%;overflow:hidden;transform:translateY(100%) translate(-50%);width:22px}.DetailTip_arrowContent__h_iuo,.DetailTip_arrow__V3iZE{display:block;pointer-events:none;position:absolute}.DetailTip_arrowContent__h_iuo{background-color:#fff;border-radius:0 0 2px;box-shadow:3px 3px 7px #00000012;content:"";height:11px;inset:0;margin:auto;transform:translateY(-12px) rotate(45deg);width:11px}.dark .DetailTip_arrowContent__h_iuo{background-color:#2e2e2f}.DetailTip_arrowContent__h_iuo:before{background:#fff;background-position:-10px -10px;background-repeat:no-repeat;-webkit-clip-path:path("M 9.849242404917499 24.091883092036785 A 5 5 0 0 1 13.384776310850237 22.627416997969522 L 20.627416997969522 22.627416997969522 A 2 2 0 0 0 22.627416997969522 20.627416997969522 L 22.627416997969522 13.384776310850237 A 5 5 0 0 1 24.091883092036785 9.849242404917499 L 23.091883092036785 9.849242404917499 L 9.849242404917499 23.091883092036785 Z");clip-path:path("M 9.849242404917499 24.091883092036785 A 5 5 0 0 1 13.384776310850237 22.627416997969522 L 20.627416997969522 22.627416997969522 A 2 2 0 0 0 22.627416997969522 20.627416997969522 L 22.627416997969522 13.384776310850237 A 5 5 0 0 1 24.091883092036785 9.849242404917499 L 23.091883092036785 9.849242404917499 L 9.849242404917499 23.091883092036785 Z");content:"";height:34px;left:-11px;position:absolute;top:-11px;width:34px}.dark .DetailTip_arrowContent__h_iuo:before{background-color:#2e2e2f}.DetailTip_cursor__xJ7aE{bottom:0;cursor:pointer;height:20px;left:95px;position:absolute;width:50px}.DetailTip_inner__vwkim{background-clip:padding-box;background-color:#fff;border-radius:8px;box-shadow:0 3px 6px -4px #0000001f,0 6px 16px #00000014,0 9px 28px 8px #0000000d;padding:8px 12px 12px}.dark .DetailTip_inner__vwkim{background-color:#2e2e2f}.DetailTip_title__ck8nu{color:#262626;font-size:14px;font-weight:500;line-height:22px;margin-bottom:4px}.dark .DetailTip_title__ck8nu{color:#fff}.DetailTip_main__D4rsT{background:#00000008;border-radius:8px;padding:4px 12px}.dark .DetailTip_main__D4rsT{background:#ffffff0d}.DetailTip_days___O7Gx{color:#262626;font-size:14px;font-weight:400;line-height:22px}.dark .DetailTip_days___O7Gx{color:#fff}.DetailTip_price__9H0Gl{color:#262626;float:right;font-size:14px;font-weight:500;line-height:22px}.dark .DetailTip_price__9H0Gl{color:#fff}.DetailTip_endTime__lgK_Q{color:#3c3c4399;font-size:12px;font-weight:400;line-height:16px;margin-top:4px}.dark .DetailTip_endTime__lgK_Q{color:#eff2f699}.PayMethod_box__1bSbc{align-items:center;color:#3c3c4399;display:flex;font-size:12px;font-weight:400;line-height:16px;margin-bottom:8px}.dark .PayMethod_box__1bSbc{color:#eff2f699}.PayMethod_text__naSH5{flex:auto}.PayMethod_bold__yGI_n{color:#5c5c5c;font-weight:500}.dark .PayMethod_bold__yGI_n{color:#bdbfc2}.Agreement_box__ZZ5ib{color:#3c3c4399;font-size:12px;font-weight:400;line-height:16px}.dark .Agreement_box__ZZ5ib{color:#eff2f699}.Agreement_link__Crlfj{color:#007aff}.dark .Agreement_link__Crlfj{color:#0a84ff}.TipRefresh_box___BgyH{align-items:center;background:#74748014;border-radius:8px;color:#3c3c4399;display:flex;font-size:12px;font-weight:400;line-height:16px;margin-top:12px;padding:8px 0 8px 12px}.dark .TipRefresh_box___BgyH{color:#eff2f699}.TipRefresh_icon__1y8K_{margin-right:8px}.TipRefresh_icon__1y8K_ path{fill:#bfbfbf}.dark .TipRefresh_icon__1y8K_ path{fill:#5c5c5c}.Intro_box__42UhS{background:#fff;border-radius:13px;margin:16px;padding:16px 16px 24px;position:relative}.dark .Intro_box__42UhS{background:#282828}.Intro_title__XkBzy{color:#ca965e;font-size:16px;font-style:normal;font-weight:500;line-height:24px}.dark .Intro_title__XkBzy{color:#dcbc8c}.Intro_more__pZa3Q{color:#262626bf;font-size:12px;font-style:normal;font-weight:400;line-height:16px;position:absolute;right:16px;top:20px}.dark .Intro_more__pZa3Q{color:#eff1f6bf}.Intro_line__66BYP,.Intro_link__JLJkY{vertical-align:middle}.Intro_line__66BYP{border-left:1px solid #000a201c;display:inline;height:12px;margin:0 6px}.dark .Intro_line__66BYP{border-left:1px solid #f7faff2e}.Intro_items__l9axd{align-items:flex-end;display:flex;flex-direction:row;gap:62px;margin:16px auto 0;padding:0;width:474px}.Intro_item__y0ea6{color:#262626bf;font-size:12px;font-style:normal;font-weight:400;height:76px;line-height:16px;text-align:center;width:72px}.dark .Intro_item__y0ea6{color:#fff}.Intro_icon__U0kiN{background-position:50% 50%;background-repeat:no-repeat;background-size:contain;height:36px;margin:12px auto;width:36px}.Intro_right1__RpfQ2{background-image:url(https://static.leetcode.cn/cn-mono-assets/production/assets/company_pop@2x.89d521e7.png)}.Intro_right2__K3mZt{background-image:url(https://static.leetcode.cn/cn-mono-assets/production/assets/interview_pop@2x.9b8324b5.png)}.Intro_right3__hwUCK{background-image:url(https://static.leetcode.cn/cn-mono-assets/production/assets/hot_pop@2x.89470849.png)}.Intro_right4__NvQ8i{background-image:url(https://static.leetcode.cn/cn-mono-assets/production/assets/lightning_pop@2x.7404043b.png)}.error-highlight_monacoErrorLineNumber__kGCqI{z-index:1}.error-highlight_monacoErrorLineNumber__kGCqI+.line-numbers{opacity:0}.error-highlight_monacoErrorLineNumber__kGCqI:before{align-items:center;color:#ef4743;content:"\e900";display:flex;font-family:lc-icon;font-size:20px;height:20px;justify-content:center;left:20px;position:absolute;width:20px}.error-highlight_monacoErrorLine__0kMjJ{background-color:#d47d7833}.demo_container__kMSWS{contain:layout;display:grid;gap:8px;grid-template-areas:"header header" "content editor" "content console";grid-template-columns:min-content 1fr;grid-template-rows:36px 1fr min-content;height:362px}.demo_content__qFsd2{animation-direction:alternate;animation-duration:1s;animation-iteration-count:infinite;animation-name:demo_h-drag__KaY2C;animation-timing-function:ease-in-out;position:relative;width:140px}.demo_content__qFsd2 img{position:absolute;right:-4px;top:50%;transform:translate(50%,-50%)}.demo_console__nKqWg{animation-direction:alternate;animation-duration:1s;animation-iteration-count:infinite;animation-name:demo_v-drag__chCM9;animation-timing-function:ease-in-out;height:96px;position:relative}.demo_console__nKqWg img{left:50%;position:absolute;top:-4px;transform:translate(-50%,-50%) rotate(90deg)}@keyframes demo_h-drag__KaY2C{0%{opacity:1;width:140px}50%{opacity:1;width:200px}51%{opacity:0;width:200px}to{opacity:0;width:200px}}@keyframes demo_v-drag__chCM9{0%{height:96px;opacity:0}50%{height:96px;opacity:0}51%{height:96px;opacity:1}to{height:125px;opacity:1}}</style><script type="text/javascript" async="" src="./Combinations - LeetCode_files/js"></script><script type="text/javascript" async="" src="./Combinations - LeetCode_files/gtm.js.download"></script><script type="text/javascript" async="" src="./Combinations - LeetCode_files/analytics.js.download"></script><script type="text/javascript" async="" src="./Combinations - LeetCode_files/gio.js.download"></script><script defer="" nomodule="" src="./Combinations - LeetCode_files/polyfills-c67a75d1b6f99dc8.js.download"></script><script src="./Combinations - LeetCode_files/webpack-1a30cbc14846800d.js.download" defer=""></script><script src="./Combinations - LeetCode_files/framework-4ed89e9640adfb9e.js.download" defer=""></script><script src="./Combinations - LeetCode_files/main-97fdb12e5623e6fb.js.download" defer=""></script><script src="./Combinations - LeetCode_files/_app-9544a5644dddbc6b.js.download" defer=""></script><script src="./Combinations - LeetCode_files/e6848cf3-e709bce199e80e90.js.download" defer=""></script><script src="./Combinations - LeetCode_files/4b358913-3386a572e61b7894.js.download" defer=""></script><script src="./Combinations - LeetCode_files/129-07e4846883f0f080.js.download" defer=""></script><script src="./Combinations - LeetCode_files/4937-37bfc49dfc12487e.js.download" defer=""></script><script src="./Combinations - LeetCode_files/1664-daeac2d69868e96c.js.download" defer=""></script><script src="./Combinations - LeetCode_files/5501-869ef1b78a0de7d9.js.download" defer=""></script><script src="./Combinations - LeetCode_files/1092-750d8d5451b0dbe2.js.download" defer=""></script><script src="./Combinations - LeetCode_files/8764-af0c73afa4e21dd2.js.download" defer=""></script><script src="./Combinations - LeetCode_files/1613-a50781f59b455a67.js.download" defer=""></script><script src="./Combinations - LeetCode_files/3098-83021b1176e1bc69.js.download" defer=""></script><script src="./Combinations - LeetCode_files/930-c92ad2d8affa12ab.js.download" defer=""></script><script src="./Combinations - LeetCode_files/1033-9096c101d6a3d73f.js.download" defer=""></script><script src="./Combinations - LeetCode_files/8561-596d9c185985b6c5.js.download" defer=""></script><script src="./Combinations - LeetCode_files/8379-4f783ddc96ff62c2.js.download" defer=""></script><script src="./Combinations - LeetCode_files/6732-ea9f9478eb5c0836.js.download" defer=""></script><script src="./Combinations - LeetCode_files/9431-4ca1f1acbf9b2e55.js.download" defer=""></script><script src="./Combinations - LeetCode_files/5518-947f6e5beafa728a.js.download" defer=""></script><script src="./Combinations - LeetCode_files/4416-2327aeb6e6dbd3f9.js.download" defer=""></script><script src="./Combinations - LeetCode_files/4703-2c9c25fd1dd4eee3.js.download" defer=""></script><script src="./Combinations - LeetCode_files/4116-3b82b2ffc43d6c46.js.download" defer=""></script><script src="./Combinations - LeetCode_files/2212-ed23dc05d9dcd53e.js.download" defer=""></script><script src="./Combinations - LeetCode_files/2475-6bfb209e1bf1da47.js.download" defer=""></script><script src="./Combinations - LeetCode_files/8712-ca8c61ecadc4ba8a.js.download" defer=""></script><script src="./Combinations - LeetCode_files/5427-e5d971a1ec8327be.js.download" defer=""></script><script src="./Combinations - LeetCode_files/7047-b0804a8dbe847954.js.download" defer=""></script><script src="./Combinations - LeetCode_files/3523-7abbe6bdc29ef747.js.download" defer=""></script><script src="./Combinations - LeetCode_files/5284-4e4cf56e7d994d6e.js.download" defer=""></script><script src="./Combinations - LeetCode_files/8359-9f04b94d0b3d30bd.js.download" defer=""></script><script src="./Combinations - LeetCode_files/7347-51e0675da164f522.js.download" defer=""></script><script src="./Combinations - LeetCode_files/[[...tab]]-63dc42d916aa8fa0.js.download" defer=""></script><script src="./Combinations - LeetCode_files/_buildManifest.js.download" defer=""></script><script src="./Combinations - LeetCode_files/_ssgManifest.js.download" defer=""></script><style type="text/css">.transform-component-module_wrapper__7HFJe {
  position: relative;
  width: -moz-fit-content;
  width: fit-content;
  height: -moz-fit-content;
  height: fit-content;
  overflow: hidden;
  -webkit-touch-callout: none; /* iOS Safari */
  -webkit-user-select: none; /* Safari */
  -khtml-user-select: none; /* Konqueror HTML */
  -moz-user-select: none; /* Firefox */
  -ms-user-select: none; /* Internet Explorer/Edge */
  user-select: none;
  margin: 0;
  padding: 0;
}
.transform-component-module_content__uCDPE {
  display: flex;
  flex-wrap: wrap;
  width: -moz-fit-content;
  width: fit-content;
  height: -moz-fit-content;
  height: fit-content;
  margin: 0;
  padding: 0;
  transform-origin: 0% 0%;
}
.transform-component-module_content__uCDPE img {
  pointer-events: none;
}
</style><style data-emotion="css-global" data-s="">:host,:root,[data-theme]{--chakra-ring-inset:var(--chakra-empty,/*!*/ /*!*/);--chakra-ring-offset-width:0px;--chakra-ring-offset-color:#fff;--chakra-ring-color:rgba(66, 153, 225, 0.6);--chakra-ring-offset-shadow:0 0 #0000;--chakra-ring-shadow:0 0 #0000;--chakra-space-x-reverse:0;--chakra-space-y-reverse:0;--chakra-colors-transparent:transparent;--chakra-colors-current:currentColor;--chakra-colors-black:#000000;--chakra-colors-white:#FFFFFF;--chakra-colors-whiteAlpha-50:rgba(255, 255, 255, 0.04);--chakra-colors-whiteAlpha-100:rgba(255, 255, 255, 0.06);--chakra-colors-whiteAlpha-200:rgba(255, 255, 255, 0.08);--chakra-colors-whiteAlpha-300:rgba(255, 255, 255, 0.16);--chakra-colors-whiteAlpha-400:rgba(255, 255, 255, 0.24);--chakra-colors-whiteAlpha-500:rgba(255, 255, 255, 0.36);--chakra-colors-whiteAlpha-600:rgba(255, 255, 255, 0.48);--chakra-colors-whiteAlpha-700:rgba(255, 255, 255, 0.64);--chakra-colors-whiteAlpha-800:rgba(255, 255, 255, 0.80);--chakra-colors-whiteAlpha-900:rgba(255, 255, 255, 0.92);--chakra-colors-blackAlpha-50:rgba(0, 0, 0, 0.04);--chakra-colors-blackAlpha-100:rgba(0, 0, 0, 0.06);--chakra-colors-blackAlpha-200:rgba(0, 0, 0, 0.08);--chakra-colors-blackAlpha-300:rgba(0, 0, 0, 0.16);--chakra-colors-blackAlpha-400:rgba(0, 0, 0, 0.24);--chakra-colors-blackAlpha-500:rgba(0, 0, 0, 0.36);--chakra-colors-blackAlpha-600:rgba(0, 0, 0, 0.48);--chakra-colors-blackAlpha-700:rgba(0, 0, 0, 0.64);--chakra-colors-blackAlpha-800:rgba(0, 0, 0, 0.80);--chakra-colors-blackAlpha-900:rgba(0, 0, 0, 0.92);--chakra-colors-gray-50:#F7FAFC;--chakra-colors-gray-100:#EDF2F7;--chakra-colors-gray-200:#E2E8F0;--chakra-colors-gray-300:#CBD5E0;--chakra-colors-gray-400:#A0AEC0;--chakra-colors-gray-500:#718096;--chakra-colors-gray-600:#4A5568;--chakra-colors-gray-700:#2D3748;--chakra-colors-gray-800:#1A202C;--chakra-colors-gray-900:#171923;--chakra-colors-red-50:#FFF5F5;--chakra-colors-red-100:#FED7D7;--chakra-colors-red-200:#FEB2B2;--chakra-colors-red-300:#FC8181;--chakra-colors-red-400:#F56565;--chakra-colors-red-500:#E53E3E;--chakra-colors-red-600:#C53030;--chakra-colors-red-700:#9B2C2C;--chakra-colors-red-800:#822727;--chakra-colors-red-900:#63171B;--chakra-colors-orange-50:#FFFAF0;--chakra-colors-orange-100:#FEEBC8;--chakra-colors-orange-200:#FBD38D;--chakra-colors-orange-300:#F6AD55;--chakra-colors-orange-400:#ED8936;--chakra-colors-orange-500:#DD6B20;--chakra-colors-orange-600:#C05621;--chakra-colors-orange-700:#9C4221;--chakra-colors-orange-800:#7B341E;--chakra-colors-orange-900:#652B19;--chakra-colors-yellow-50:#FFFFF0;--chakra-colors-yellow-100:#FEFCBF;--chakra-colors-yellow-200:#FAF089;--chakra-colors-yellow-300:#F6E05E;--chakra-colors-yellow-400:#ECC94B;--chakra-colors-yellow-500:#D69E2E;--chakra-colors-yellow-600:#B7791F;--chakra-colors-yellow-700:#975A16;--chakra-colors-yellow-800:#744210;--chakra-colors-yellow-900:#5F370E;--chakra-colors-green-50:#F0FFF4;--chakra-colors-green-100:#C6F6D5;--chakra-colors-green-200:#9AE6B4;--chakra-colors-green-300:#68D391;--chakra-colors-green-400:#48BB78;--chakra-colors-green-500:#38A169;--chakra-colors-green-600:#2F855A;--chakra-colors-green-700:#276749;--chakra-colors-green-800:#22543D;--chakra-colors-green-900:#1C4532;--chakra-colors-teal-50:#E6FFFA;--chakra-colors-teal-100:#B2F5EA;--chakra-colors-teal-200:#81E6D9;--chakra-colors-teal-300:#4FD1C5;--chakra-colors-teal-400:#38B2AC;--chakra-colors-teal-500:#319795;--chakra-colors-teal-600:#2C7A7B;--chakra-colors-teal-700:#285E61;--chakra-colors-teal-800:#234E52;--chakra-colors-teal-900:#1D4044;--chakra-colors-blue-50:#ebf8ff;--chakra-colors-blue-100:#bee3f8;--chakra-colors-blue-200:#90cdf4;--chakra-colors-blue-300:#63b3ed;--chakra-colors-blue-400:#4299e1;--chakra-colors-blue-500:#3182ce;--chakra-colors-blue-600:#2b6cb0;--chakra-colors-blue-700:#2c5282;--chakra-colors-blue-800:#2a4365;--chakra-colors-blue-900:#1A365D;--chakra-colors-cyan-50:#EDFDFD;--chakra-colors-cyan-100:#C4F1F9;--chakra-colors-cyan-200:#9DECF9;--chakra-colors-cyan-300:#76E4F7;--chakra-colors-cyan-400:#0BC5EA;--chakra-colors-cyan-500:#00B5D8;--chakra-colors-cyan-600:#00A3C4;--chakra-colors-cyan-700:#0987A0;--chakra-colors-cyan-800:#086F83;--chakra-colors-cyan-900:#065666;--chakra-colors-purple-50:#FAF5FF;--chakra-colors-purple-100:#E9D8FD;--chakra-colors-purple-200:#D6BCFA;--chakra-colors-purple-300:#B794F4;--chakra-colors-purple-400:#9F7AEA;--chakra-colors-purple-500:#805AD5;--chakra-colors-purple-600:#6B46C1;--chakra-colors-purple-700:#553C9A;--chakra-colors-purple-800:#44337A;--chakra-colors-purple-900:#322659;--chakra-colors-pink-50:#FFF5F7;--chakra-colors-pink-100:#FED7E2;--chakra-colors-pink-200:#FBB6CE;--chakra-colors-pink-300:#F687B3;--chakra-colors-pink-400:#ED64A6;--chakra-colors-pink-500:#D53F8C;--chakra-colors-pink-600:#B83280;--chakra-colors-pink-700:#97266D;--chakra-colors-pink-800:#702459;--chakra-colors-pink-900:#521B41;--chakra-colors-linkedin-50:#E8F4F9;--chakra-colors-linkedin-100:#CFEDFB;--chakra-colors-linkedin-200:#9BDAF3;--chakra-colors-linkedin-300:#68C7EC;--chakra-colors-linkedin-400:#34B3E4;--chakra-colors-linkedin-500:#00A0DC;--chakra-colors-linkedin-600:#008CC9;--chakra-colors-linkedin-700:#0077B5;--chakra-colors-linkedin-800:#005E93;--chakra-colors-linkedin-900:#004471;--chakra-colors-facebook-50:#E8F4F9;--chakra-colors-facebook-100:#D9DEE9;--chakra-colors-facebook-200:#B7C2DA;--chakra-colors-facebook-300:#6482C0;--chakra-colors-facebook-400:#4267B2;--chakra-colors-facebook-500:#385898;--chakra-colors-facebook-600:#314E89;--chakra-colors-facebook-700:#29487D;--chakra-colors-facebook-800:#223B67;--chakra-colors-facebook-900:#1E355B;--chakra-colors-messenger-50:#D0E6FF;--chakra-colors-messenger-100:#B9DAFF;--chakra-colors-messenger-200:#A2CDFF;--chakra-colors-messenger-300:#7AB8FF;--chakra-colors-messenger-400:#2E90FF;--chakra-colors-messenger-500:#0078FF;--chakra-colors-messenger-600:#0063D1;--chakra-colors-messenger-700:#0052AC;--chakra-colors-messenger-800:#003C7E;--chakra-colors-messenger-900:#002C5C;--chakra-colors-whatsapp-50:#dffeec;--chakra-colors-whatsapp-100:#b9f5d0;--chakra-colors-whatsapp-200:#90edb3;--chakra-colors-whatsapp-300:#65e495;--chakra-colors-whatsapp-400:#3cdd78;--chakra-colors-whatsapp-500:#22c35e;--chakra-colors-whatsapp-600:#179848;--chakra-colors-whatsapp-700:#0c6c33;--chakra-colors-whatsapp-800:#01421c;--chakra-colors-whatsapp-900:#001803;--chakra-colors-twitter-50:#E5F4FD;--chakra-colors-twitter-100:#C8E9FB;--chakra-colors-twitter-200:#A8DCFA;--chakra-colors-twitter-300:#83CDF7;--chakra-colors-twitter-400:#57BBF5;--chakra-colors-twitter-500:#1DA1F2;--chakra-colors-twitter-600:#1A94DA;--chakra-colors-twitter-700:#1681BF;--chakra-colors-twitter-800:#136B9E;--chakra-colors-twitter-900:#0D4D71;--chakra-colors-telegram-50:#E3F2F9;--chakra-colors-telegram-100:#C5E4F3;--chakra-colors-telegram-200:#A2D4EC;--chakra-colors-telegram-300:#7AC1E4;--chakra-colors-telegram-400:#47A9DA;--chakra-colors-telegram-500:#0088CC;--chakra-colors-telegram-600:#007AB8;--chakra-colors-telegram-700:#006BA1;--chakra-colors-telegram-800:#005885;--chakra-colors-telegram-900:#003F5E;--chakra-colors-_background-light-index:#F5F5F5;--chakra-colors-_background-light-inverse:#2A2A2A;--chakra-colors-_background-dark-index:#1A1A1A;--chakra-colors-_background-dark-inverse:#DFDFDF;--chakra-colors-_blue-light-10:#E8F7FF;--chakra-colors-_blue-light-20:#BAE4FF;--chakra-colors-_blue-light-30:#8BCFFF;--chakra-colors-_blue-light-40:#5DB6FF;--chakra-colors-_blue-light-50:#2E9AFF;--chakra-colors-_blue-light-60:#007AFF;--chakra-colors-_blue-light-70:#005FD2;--chakra-colors-_blue-light-80:#0045A6;--chakra-colors-_blue-light-90:#002E79;--chakra-colors-_blue-light-100:#001B4D;--chakra-colors-_blue-dark-10:#001B4D;--chakra-colors-_blue-dark-20:#043079;--chakra-colors-_blue-dark-30:#0A4BA6;--chakra-colors-_blue-dark-40:#1369D2;--chakra-colors-_blue-dark-50:#1F8AFF;--chakra-colors-_blue-dark-60:#2696FF;--chakra-colors-_blue-dark-70:#57B3FF;--chakra-colors-_blue-dark-80:#87CDFF;--chakra-colors-_blue-dark-90:#B8E3FF;--chakra-colors-_blue-dark-100:#E8F7FF;--chakra-colors-_button-light-primary:#212121;--chakra-colors-_button-light-primaryHover:#2A2A2A;--chakra-colors-_button-light-primaryActive:#1A1A1A;--chakra-colors-_button-light-theme:#15BD66;--chakra-colors-_button-light-themeHover:#35DB80;--chakra-colors-_button-light-themeActive:#18A352;--chakra-colors-_button-light-secondary:rgba(0,
  0,
  0,
  0.05);--chakra-colors-_button-light-secondaryHover:rgba(0,
  0,
  0,
  0.03);--chakra-colors-_button-light-secondaryActive:rgba(0,
  0,
  0,
  0.08);--chakra-colors-_button-light-danger:#FF334B;--chakra-colors-_button-light-dangerHover:#FF697A;--chakra-colors-_button-light-dangerActive:#D2203A;--chakra-colors-_button-dark-primary:#E8E8E8;--chakra-colors-_button-dark-primaryHover:#F5F5F5;--chakra-colors-_button-dark-primaryActive:#DFDFDF;--chakra-colors-_button-dark-theme:#3FCA7D;--chakra-colors-_button-dark-themeHover:#63D794;--chakra-colors-_button-dark-themeActive:#2EBD73;--chakra-colors-_button-dark-secondary:rgba(255,
  255,
  255,
  0.08);--chakra-colors-_button-dark-secondaryHover:rgba(255,
  255,
  255,
  0.12);--chakra-colors-_button-dark-secondaryActive:rgba(255,
  255,
  255,
  0.03);--chakra-colors-_button-dark-danger:#FF5967;--chakra-colors-_button-dark-dangerHover:#FF7D84;--chakra-colors-_button-dark-dangerActive:#FF475D;--chakra-colors-_fill-light-01:rgba(0,
  0,
  0,
  0.03);--chakra-colors-_fill-light-02:rgba(0,
  0,
  0,
  0.05);--chakra-colors-_fill-light-03:rgba(0,
  0,
  0,
  0.14);--chakra-colors-_fill-dark-01:rgba(255,
  255,
  255,
  0.08);--chakra-colors-_fill-dark-02:rgba(255,
  255,
  255,
  0.12);--chakra-colors-_fill-dark-03:rgba(255,
  255,
  255,
  0.2);--chakra-colors-_fixed-light-black:#000000;--chakra-colors-_fixed-light-white:#FFFFFF;--chakra-colors-_fixed-dark-black:#000000;--chakra-colors-_fixed-dark-white:#FFFFFF;--chakra-colors-_gray-light-10:#F5F5F5;--chakra-colors-_gray-light-20:#E8E8E8;--chakra-colors-_gray-light-30:#DFDFDF;--chakra-colors-_gray-light-40:#B7B7B7;--chakra-colors-_gray-light-50:#949494;--chakra-colors-_gray-light-60:#777777;--chakra-colors-_gray-light-70:#525252;--chakra-colors-_gray-light-80:#2A2A2A;--chakra-colors-_gray-light-90:#212121;--chakra-colors-_gray-light-100:#1A1A1A;--chakra-colors-_gray-dark-10:#1A1A1A;--chakra-colors-_gray-dark-20:#212121;--chakra-colors-_gray-dark-30:#2A2A2A;--chakra-colors-_gray-dark-40:#525252;--chakra-colors-_gray-dark-50:#777777;--chakra-colors-_gray-dark-60:#949494;--chakra-colors-_gray-dark-70:#B7B7B7;--chakra-colors-_gray-dark-80:#DFDFDF;--chakra-colors-_gray-dark-90:#E8E8E8;--chakra-colors-_gray-dark-100:#F5F5F5;--chakra-colors-_green-light-10:#E8FFEF;--chakra-colors-_green-light-20:#B5F2CB;--chakra-colors-_green-light-30:#93EDBF;--chakra-colors-_green-light-40:#64E8A4;--chakra-colors-_green-light-50:#35DB80;--chakra-colors-_green-light-60:#15BD66;--chakra-colors-_green-light-70:#18A352;--chakra-colors-_green-light-80:#07854C;--chakra-colors-_green-light-90:#03693E;--chakra-colors-_green-light-100:#004D2F;--chakra-colors-_green-dark-10:#004D2F;--chakra-colors-_green-dark-20:#03693E;--chakra-colors-_green-dark-30:#0D854F;--chakra-colors-_green-dark-40:#1CA161;--chakra-colors-_green-dark-50:#2EBD73;--chakra-colors-_green-dark-60:#3FCA7D;--chakra-colors-_green-dark-70:#63D794;--chakra-colors-_green-dark-80:#8CE5AE;--chakra-colors-_green-dark-90:#B8F2CD;--chakra-colors-_green-dark-100:#E8FFEF;--chakra-colors-_icon-light-primary:#525252;--chakra-colors-_icon-light-secondary:#949494;--chakra-colors-_icon-light-tertiary:#B7B7B7;--chakra-colors-_icon-light-inverse:#FFFFFF;--chakra-colors-_icon-dark-primary:#B7B7B7;--chakra-colors-_icon-dark-secondary:#777777;--chakra-colors-_icon-dark-tertiary:#525252;--chakra-colors-_icon-dark-inverse:#1A1A1A;--chakra-colors-_layer-light-01:#FFFFFF;--chakra-colors-_layer-light-02:#F5F5F5;--chakra-colors-_layer-light-03:#FFFFFF;--chakra-colors-_layer-dark-01:#2A2A2A;--chakra-colors-_layer-dark-02:#525252;--chakra-colors-_layer-dark-03:#777777;--chakra-colors-_magenta-light-10:#FFE8EF;--chakra-colors-_magenta-light-20:#FFCADF;--chakra-colors-_magenta-light-30:#FFBAD8;--chakra-colors-_magenta-light-40:#FF9CCD;--chakra-colors-_magenta-light-50:#FF70B0;--chakra-colors-_magenta-light-60:#F74397;--chakra-colors-_magenta-light-70:#DE2C7F;--chakra-colors-_magenta-light-80:#BF0659;--chakra-colors-_magenta-light-90:#860246;--chakra-colors-_magenta-light-100:#4D002E;--chakra-colors-_magenta-dark-10:#4D002E;--chakra-colors-_magenta-dark-20:#770747;--chakra-colors-_magenta-dark-30:#A21962;--chakra-colors-_magenta-dark-40:#CC317F;--chakra-colors-_magenta-dark-50:#F7529F;--chakra-colors-_magenta-dark-60:#F969A7;--chakra-colors-_magenta-dark-70:#FF96C2;--chakra-colors-_magenta-dark-80:#FCACC9;--chakra-colors-_magenta-dark-90:#FDCDDE;--chakra-colors-_magenta-dark-100:#FFF0F5;--chakra-colors-_purple-light-10:#FBE8FF;--chakra-colors-_purple-light-20:#EFC7F8;--chakra-colors-_purple-light-30:#E1A8F2;--chakra-colors-_purple-light-40:#D18AEB;--chakra-colors-_purple-light-50:#C16DE5;--chakra-colors-_purple-light-60:#AF52DE;--chakra-colors-_purple-light-70:#8833BA;--chakra-colors-_purple-light-80:#651C95;--chakra-colors-_purple-light-90:#440A71;--chakra-colors-_purple-light-100:#29004D;--chakra-colors-_purple-dark-10:#29004D;--chakra-colors-_purple-dark-20:#440971;--chakra-colors-_purple-dark-30:#651C95;--chakra-colors-_purple-dark-40:#8A38BA;--chakra-colors-_purple-dark-50:#B25BDE;--chakra-colors-_purple-dark-60:#C477E5;--chakra-colors-_purple-dark-70:#D392EA;--chakra-colors-_purple-dark-80:#E1B0EF;--chakra-colors-_purple-dark-90:#F0CBF8;--chakra-colors-_purple-dark-100:#FBEAFF;--chakra-colors-_red-light-10:#FFE9E8;--chakra-colors-_red-light-20:#FFCCCB;--chakra-colors-_red-light-30:#FFB7BA;--chakra-colors-_red-light-40:#FF96A3;--chakra-colors-_red-light-50:#FF697A;--chakra-colors-_red-light-60:#FF334B;--chakra-colors-_red-light-70:#D2203A;--chakra-colors-_red-light-80:#A6112C;--chakra-colors-_red-light-90:#79061F;--chakra-colors-_red-light-100:#4D0013;--chakra-colors-_red-dark-10:#4D0013;--chakra-colors-_red-dark-20:#941E33;--chakra-colors-_red-dark-30:#B82E43;--chakra-colors-_red-dark-40:#DB4253;--chakra-colors-_red-dark-50:#FF475D;--chakra-colors-_red-dark-60:#FF5967;--chakra-colors-_red-dark-70:#FF7D84;--chakra-colors-_red-dark-80:#FFA1A2;--chakra-colors-_red-dark-90:#FFC5C4;--chakra-colors-_red-dark-100:#FFE9E8;--chakra-colors-_support-light-error:#FF334B;--chakra-colors-_support-light-errorBackground:rgba(255,
  51,
  75,
  0.12);--chakra-colors-_support-light-success:#15BD66;--chakra-colors-_support-light-successBackground:rgba(21,
  189,
  102,
  0.12);--chakra-colors-_support-light-warning:#FFB800;--chakra-colors-_support-light-warningBackground:rgba(255,
  184,
  0,
  0.12);--chakra-colors-_support-light-info:#007AFF;--chakra-colors-_support-light-infoBackground:rgba(0,
  122,
  255,
  0.12);--chakra-colors-_support-dark-error:#FF5967;--chakra-colors-_support-dark-errorBackground:rgba(255,
  89,
  103,
  0.12);--chakra-colors-_support-dark-success:#3FCA7D;--chakra-colors-_support-dark-successBackground:rgba(63,
  202,
  125,
  0.12);--chakra-colors-_support-dark-warning:#FFC926;--chakra-colors-_support-dark-warningBackground:rgba(255,
  201,
  38,
  0.12);--chakra-colors-_support-dark-info:#2696FF;--chakra-colors-_support-dark-infoBackground:rgba(38,
  150,
  255,
  0.12);--chakra-colors-_system-light-primary:#007AFF;--chakra-colors-_system-light-primaryHover:#2E9AFF;--chakra-colors-_system-light-primaryActive:#2E9AFF;--chakra-colors-_system-dark-primary:#2696FF;--chakra-colors-_system-dark-primaryHover:#57B3FF;--chakra-colors-_system-dark-primaryActive:#1F8AFF;--chakra-colors-_teal-light-10:#E8FFFB;--chakra-colors-_teal-light-20:#BCF6EE;--chakra-colors-_teal-light-30:#92EDE4;--chakra-colors-_teal-light-40:#47DAD5;--chakra-colors-_teal-light-50:#26D1D1;--chakra-colors-_teal-light-60:#1CB8B8;--chakra-colors-_teal-light-70:#10A1A1;--chakra-colors-_teal-light-80:#107575;--chakra-colors-_teal-light-90:#155C5C;--chakra-colors-_teal-light-100:#00424D;--chakra-colors-_teal-dark-10:#00424D;--chakra-colors-_teal-dark-20:#035D67;--chakra-colors-_teal-dark-30:#0F7A82;--chakra-colors-_teal-dark-40:#1E989D;--chakra-colors-_teal-dark-50:#32B8B8;--chakra-colors-_teal-dark-60:#46C6C2;--chakra-colors-_teal-dark-70:#68D4CD;--chakra-colors-_teal-dark-80:#90E3DB;--chakra-colors-_teal-dark-90:#BAF1E9;--chakra-colors-_teal-dark-100:#E9FFFB;--chakra-colors-_text-light-primary:#1A1A1A;--chakra-colors-_text-light-secondary:rgba(26,
  26,
  26,
  0.75);--chakra-colors-_text-light-tertiary:rgba(82,
  82,
  82,
  0.60);--chakra-colors-_text-light-quaternary:rgba(82,
  82,
  82,
  0.30);--chakra-colors-_text-light-inverse:#FFFFFF;--chakra-colors-_text-light-error:#FF334B;--chakra-colors-_text-dark-primary:#F5F5F5;--chakra-colors-_text-dark-secondary:rgba(245,
  245,
  245,
  0.75);--chakra-colors-_text-dark-tertiary:rgba(183,
  183,
  183,
  0.60);--chakra-colors-_text-dark-quaternary:rgba(183,
  183,
  183,
  0.30);--chakra-colors-_text-dark-inverse:#1A1A1A;--chakra-colors-_text-dark-error:#FF5967;--chakra-colors-_yellow-light-10:#FFFCE6;--chakra-colors-_yellow-light-20:#FFF1A3;--chakra-colors-_yellow-light-30:#FFE77A;--chakra-colors-_yellow-light-40:#FFD952;--chakra-colors-_yellow-light-50:#FFC929;--chakra-colors-_yellow-light-60:#FFB800;--chakra-colors-_yellow-light-70:#D99400;--chakra-colors-_yellow-light-80:#B37400;--chakra-colors-_yellow-light-90:#8C5600;--chakra-colors-_yellow-light-100:#663C00;--chakra-colors-_yellow-dark-10:#4D2D00;--chakra-colors-_yellow-dark-20:#794C04;--chakra-colors-_yellow-dark-30:#A66F0A;--chakra-colors-_yellow-dark-40:#D29613;--chakra-colors-_yellow-dark-50:#FFC11F;--chakra-colors-_yellow-dark-60:#FFC926;--chakra-colors-_yellow-dark-70:#FFDB57;--chakra-colors-_yellow-dark-80:#FFE987;--chakra-colors-_yellow-dark-90:#FFF5B8;--chakra-colors-_yellow-dark-100:#FFFCE8;--chakra-borders-none:0;--chakra-borders-1px:1px solid;--chakra-borders-2px:2px solid;--chakra-borders-4px:4px solid;--chakra-borders-8px:8px solid;--chakra-fonts-heading:-apple-system,BlinkMacSystemFont,"Segoe UI",Helvetica,Arial,sans-serif,"Apple Color Emoji","Segoe UI Emoji","Segoe UI Symbol";--chakra-fonts-body:-apple-system,BlinkMacSystemFont,"Segoe UI",Helvetica,Arial,sans-serif,"Apple Color Emoji","Segoe UI Emoji","Segoe UI Symbol";--chakra-fonts-mono:SFMono-Regular,Menlo,Monaco,Consolas,"Liberation Mono","Courier New",monospace;--chakra-fontSizes-xs:0.75rem;--chakra-fontSizes-sm:0.875rem;--chakra-fontSizes-md:1rem;--chakra-fontSizes-lg:1.125rem;--chakra-fontSizes-xl:1.25rem;--chakra-fontSizes-2xl:1.5rem;--chakra-fontSizes-3xl:1.875rem;--chakra-fontSizes-4xl:2.25rem;--chakra-fontSizes-5xl:3rem;--chakra-fontSizes-6xl:3.75rem;--chakra-fontSizes-7xl:4.5rem;--chakra-fontSizes-8xl:6rem;--chakra-fontSizes-9xl:8rem;--chakra-fontWeights-hairline:100;--chakra-fontWeights-thin:200;--chakra-fontWeights-light:300;--chakra-fontWeights-normal:400;--chakra-fontWeights-medium:500;--chakra-fontWeights-semibold:600;--chakra-fontWeights-bold:700;--chakra-fontWeights-extrabold:800;--chakra-fontWeights-black:900;--chakra-letterSpacings-tighter:-0.05em;--chakra-letterSpacings-tight:-0.025em;--chakra-letterSpacings-normal:0;--chakra-letterSpacings-wide:0.025em;--chakra-letterSpacings-wider:0.05em;--chakra-letterSpacings-widest:0.1em;--chakra-lineHeights-3:.75rem;--chakra-lineHeights-4:1rem;--chakra-lineHeights-5:1.25rem;--chakra-lineHeights-6:1.5rem;--chakra-lineHeights-7:1.75rem;--chakra-lineHeights-8:2rem;--chakra-lineHeights-9:2.25rem;--chakra-lineHeights-10:2.5rem;--chakra-lineHeights-normal:normal;--chakra-lineHeights-none:1;--chakra-lineHeights-shorter:1.25;--chakra-lineHeights-short:1.375;--chakra-lineHeights-base:1.5;--chakra-lineHeights-tall:1.625;--chakra-lineHeights-taller:2;--chakra-radii-none:0;--chakra-radii-sm:0.125rem;--chakra-radii-base:0.25rem;--chakra-radii-md:0.375rem;--chakra-radii-lg:0.5rem;--chakra-radii-xl:0.75rem;--chakra-radii-2xl:1rem;--chakra-radii-3xl:1.5rem;--chakra-radii-full:9999px;--chakra-space-1:0.25rem;--chakra-space-2:0.5rem;--chakra-space-3:0.75rem;--chakra-space-4:1rem;--chakra-space-5:1.25rem;--chakra-space-6:1.5rem;--chakra-space-7:1.75rem;--chakra-space-8:2rem;--chakra-space-9:2.25rem;--chakra-space-10:2.5rem;--chakra-space-12:3rem;--chakra-space-14:3.5rem;--chakra-space-16:4rem;--chakra-space-20:5rem;--chakra-space-24:6rem;--chakra-space-28:7rem;--chakra-space-32:8rem;--chakra-space-36:9rem;--chakra-space-40:10rem;--chakra-space-44:11rem;--chakra-space-48:12rem;--chakra-space-52:13rem;--chakra-space-56:14rem;--chakra-space-60:15rem;--chakra-space-64:16rem;--chakra-space-72:18rem;--chakra-space-80:20rem;--chakra-space-96:24rem;--chakra-space-px:1px;--chakra-space-0-5:0.125rem;--chakra-space-1-5:0.375rem;--chakra-space-2-5:0.625rem;--chakra-space-3-5:0.875rem;--chakra-shadows-xs:0 0 0 1px rgba(0, 0, 0, 0.05);--chakra-shadows-sm:0 1px 2px 0 rgba(0, 0, 0, 0.05);--chakra-shadows-base:0 1px 3px 0 rgba(0, 0, 0, 0.1),0 1px 2px 0 rgba(0, 0, 0, 0.06);--chakra-shadows-md:0 4px 6px -1px rgba(0, 0, 0, 0.1),0 2px 4px -1px rgba(0, 0, 0, 0.06);--chakra-shadows-lg:0 10px 15px -3px rgba(0, 0, 0, 0.1),0 4px 6px -2px rgba(0, 0, 0, 0.05);--chakra-shadows-xl:0 20px 25px -5px rgba(0, 0, 0, 0.1),0 10px 10px -5px rgba(0, 0, 0, 0.04);--chakra-shadows-2xl:0 25px 50px -12px rgba(0, 0, 0, 0.25);--chakra-shadows-outline:0 0 0 3px rgba(66, 153, 225, 0.6);--chakra-shadows-inner:inset 0 2px 4px 0 rgba(0,0,0,0.06);--chakra-shadows-none:none;--chakra-shadows-dark-lg:rgba(0, 0, 0, 0.1) 0px 0px 0px 1px,rgba(0, 0, 0, 0.2) 0px 5px 10px,rgba(0, 0, 0, 0.4) 0px 15px 40px;--chakra-sizes-1:0.25rem;--chakra-sizes-2:0.5rem;--chakra-sizes-3:0.75rem;--chakra-sizes-4:1rem;--chakra-sizes-5:1.25rem;--chakra-sizes-6:1.5rem;--chakra-sizes-7:1.75rem;--chakra-sizes-8:2rem;--chakra-sizes-9:2.25rem;--chakra-sizes-10:2.5rem;--chakra-sizes-12:3rem;--chakra-sizes-14:3.5rem;--chakra-sizes-16:4rem;--chakra-sizes-20:5rem;--chakra-sizes-24:6rem;--chakra-sizes-28:7rem;--chakra-sizes-32:8rem;--chakra-sizes-36:9rem;--chakra-sizes-40:10rem;--chakra-sizes-44:11rem;--chakra-sizes-48:12rem;--chakra-sizes-52:13rem;--chakra-sizes-56:14rem;--chakra-sizes-60:15rem;--chakra-sizes-64:16rem;--chakra-sizes-72:18rem;--chakra-sizes-80:20rem;--chakra-sizes-96:24rem;--chakra-sizes-px:1px;--chakra-sizes-0-5:0.125rem;--chakra-sizes-1-5:0.375rem;--chakra-sizes-2-5:0.625rem;--chakra-sizes-3-5:0.875rem;--chakra-sizes-max:max-content;--chakra-sizes-min:min-content;--chakra-sizes-full:100%;--chakra-sizes-3xs:14rem;--chakra-sizes-2xs:16rem;--chakra-sizes-xs:20rem;--chakra-sizes-sm:24rem;--chakra-sizes-md:28rem;--chakra-sizes-lg:32rem;--chakra-sizes-xl:36rem;--chakra-sizes-2xl:42rem;--chakra-sizes-3xl:48rem;--chakra-sizes-4xl:56rem;--chakra-sizes-5xl:64rem;--chakra-sizes-6xl:72rem;--chakra-sizes-7xl:80rem;--chakra-sizes-8xl:90rem;--chakra-sizes-container-sm:640px;--chakra-sizes-container-md:768px;--chakra-sizes-container-lg:1024px;--chakra-sizes-container-xl:1280px;--chakra-zIndices-hide:-1;--chakra-zIndices-auto:auto;--chakra-zIndices-base:0;--chakra-zIndices-docked:10;--chakra-zIndices-dropdown:1000;--chakra-zIndices-sticky:1100;--chakra-zIndices-banner:1200;--chakra-zIndices-overlay:1300;--chakra-zIndices-modal:1400;--chakra-zIndices-popover:1500;--chakra-zIndices-skipLink:1600;--chakra-zIndices-toast:1700;--chakra-zIndices-tooltip:1800;--chakra-transition-property-common:background-color,border-color,color,fill,stroke,opacity,box-shadow,transform;--chakra-transition-property-colors:background-color,border-color,color,fill,stroke;--chakra-transition-property-dimensions:width,height;--chakra-transition-property-position:left,right,top,bottom;--chakra-transition-property-background:background-color,background-image,background-position;--chakra-transition-easing-ease-in:cubic-bezier(0.4, 0, 1, 1);--chakra-transition-easing-ease-out:cubic-bezier(0, 0, 0.2, 1);--chakra-transition-easing-ease-in-out:cubic-bezier(0.4, 0, 0.2, 1);--chakra-transition-duration-ultra-fast:50ms;--chakra-transition-duration-faster:100ms;--chakra-transition-duration-fast:150ms;--chakra-transition-duration-normal:200ms;--chakra-transition-duration-slow:300ms;--chakra-transition-duration-slower:400ms;--chakra-transition-duration-ultra-slow:500ms;--chakra-blur-none:0;--chakra-blur-sm:4px;--chakra-blur-base:8px;--chakra-blur-md:12px;--chakra-blur-lg:16px;--chakra-blur-xl:24px;--chakra-blur-2xl:40px;--chakra-blur-3xl:64px;}.chakra-ui-light :host:not([data-theme]),.chakra-ui-light :root:not([data-theme]),.chakra-ui-light [data-theme]:not([data-theme]),[data-theme=light] :host:not([data-theme]),[data-theme=light] :root:not([data-theme]),[data-theme=light] [data-theme]:not([data-theme]),:host[data-theme=light],:root[data-theme=light],[data-theme][data-theme=light]{--chakra-colors-chakra-body-text:var(--chakra-colors-gray-800);--chakra-colors-chakra-body-bg:var(--chakra-colors-white);--chakra-colors-chakra-border-color:var(--chakra-colors-gray-200);--chakra-colors-chakra-placeholder-color:var(--chakra-colors-gray-500);}.chakra-ui-dark :host:not([data-theme]),.chakra-ui-dark :root:not([data-theme]),.chakra-ui-dark [data-theme]:not([data-theme]),[data-theme=dark] :host:not([data-theme]),[data-theme=dark] :root:not([data-theme]),[data-theme=dark] [data-theme]:not([data-theme]),:host[data-theme=dark],:root[data-theme=dark],[data-theme][data-theme=dark]{--chakra-colors-chakra-body-text:var(--chakra-colors-whiteAlpha-900);--chakra-colors-chakra-body-bg:var(--chakra-colors-gray-800);--chakra-colors-chakra-border-color:var(--chakra-colors-whiteAlpha-300);--chakra-colors-chakra-placeholder-color:var(--chakra-colors-whiteAlpha-400);}</style><style data-emotion="css-global" data-s="">body{font-family:var(--chakra-fonts-body);color:var(--chakra-colors-chakra-body-text);background:var(--chakra-colors-chakra-body-bg);transition-property:background-color;transition-duration:var(--chakra-transition-duration-normal);line-height:var(--chakra-lineHeights-base);}*::-webkit-input-placeholder{color:var(--chakra-colors-chakra-placeholder-color);}*::-moz-placeholder{color:var(--chakra-colors-chakra-placeholder-color);}*:-ms-input-placeholder{color:var(--chakra-colors-chakra-placeholder-color);}*::placeholder{color:var(--chakra-colors-chakra-placeholder-color);}*,*::before,::after{border-color:var(--chakra-colors-chakra-border-color);word-wrap:break-word;}</style><style data-emotion="css-global" data-s="">html{-webkit-text-size-adjust:100%;touch-action:manipulation;}body{position:relative;min-height:100%;}*,*::before,*::after{border-width:0;border-style:solid;box-sizing:border-box;}main{display:block;}hr{border-top-width:1px;box-sizing:content-box;height:0;overflow:visible;}pre,code,kbd,samp{font-family:SFMono-Regular,Menlo,Monaco,Consolas,monospace;font-size:1em;}a{background-color:transparent;color:inherit;-webkit-text-decoration:inherit;text-decoration:inherit;}abbr[title]{border-bottom:none;-webkit-text-decoration:underline;text-decoration:underline;-webkit-text-decoration:underline dotted;-webkit-text-decoration:underline dotted;text-decoration:underline dotted;}b,strong{font-weight:bold;}small{font-size:80%;}sub,sup{font-size:75%;line-height:0;position:relative;vertical-align:baseline;}sub{bottom:-0.25em;}sup{top:-0.5em;}img{border-style:none;}button,input,optgroup,select,textarea{font-family:inherit;font-size:100%;line-height:1.15;margin:0;}button,input{overflow:visible;}button,select{text-transform:none;}button::-moz-focus-inner,[type="button"]::-moz-focus-inner,[type="reset"]::-moz-focus-inner,[type="submit"]::-moz-focus-inner{border-style:none;padding:0;}fieldset{padding:0.35em 0.75em 0.625em;}legend{box-sizing:border-box;color:inherit;display:table;max-width:100%;padding:0;white-space:normal;}progress{vertical-align:baseline;}textarea{overflow:auto;}[type="checkbox"],[type="radio"]{box-sizing:border-box;padding:0;}[type="number"]::-webkit-inner-spin-button,[type="number"]::-webkit-outer-spin-button{-webkit-appearance:none!important;}input[type="number"]{-moz-appearance:textfield;}[type="search"]{-webkit-appearance:textfield;outline-offset:-2px;}[type="search"]::-webkit-search-decoration{-webkit-appearance:none!important;}::-webkit-file-upload-button{-webkit-appearance:button;font:inherit;}details{display:block;}summary{display:-webkit-box;display:-webkit-list-item;display:-ms-list-itembox;display:list-item;}template{display:none;}[hidden]{display:none!important;}body,blockquote,dl,dd,h1,h2,h3,h4,h5,h6,hr,figure,p,pre{margin:0;}button{background:transparent;padding:0;}fieldset{margin:0;padding:0;}ol,ul{margin:0;padding:0;}textarea{resize:vertical;}button,[role="button"]{cursor:pointer;}button::-moz-focus-inner{border:0!important;}table{border-collapse:collapse;}h1,h2,h3,h4,h5,h6{font-size:inherit;font-weight:inherit;}button,input,optgroup,select,textarea{padding:0;line-height:inherit;color:inherit;}img,svg,video,canvas,audio,iframe,embed,object{display:block;}img,video{max-width:100%;height:auto;}[data-js-focus-visible] :focus:not([data-focus-visible-added]):not([data-focus-visible-disabled]){outline:none;}select::-ms-expand{display:none;}</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-aria-container {
	position: absolute; /* try to hide from window but not from screen readers */
	left:-999em;
}</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

/* -------------------- IE10 remove auto clear button -------------------- */

::-ms-clear {
	display: none;
}

/* All widgets */
/* I am not a big fan of this rule */
.monaco-editor .editor-widget input {
	color: inherit;
}

/* -------------------- Editor -------------------- */

.monaco-editor {
	position: relative;
	overflow: visible;
	-webkit-text-size-adjust: 100%;
}

/* -------------------- Misc -------------------- */

.monaco-editor .overflow-guard {
	position: relative;
	overflow: hidden;
}

.monaco-editor .view-overlays {
	position: absolute;
	top: 0;
}

/*
.monaco-editor .auto-closed-character {
	opacity: 0.3;
}
*/
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-editor .inputarea {
	min-width: 0;
	min-height: 0;
	margin: 0;
	padding: 0;
	position: absolute;
	outline: none !important;
	resize: none;
	border: none;
	overflow: hidden;
	color: transparent;
	background-color: transparent;
}
/*.monaco-editor .inputarea {
	position: fixed !important;
	width: 800px !important;
	height: 500px !important;
	top: initial !important;
	left: initial !important;
	bottom: 0 !important;
	right: 0 !important;
	color: black !important;
	background: white !important;
	line-height: 15px !important;
	font-size: 14px !important;
}*/
.monaco-editor .inputarea.ime-input {
	z-index: 10;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-editor .margin-view-overlays .line-numbers {
	font-variant-numeric: tabular-nums;
	position: absolute;
	text-align: right;
	display: inline-block;
	vertical-align: middle;
	box-sizing: border-box;
	cursor: default;
	height: 100%;
}

.monaco-editor .relative-current-line-number {
	text-align: left;
	display: inline-block;
	width: 100%;
}

.monaco-editor .margin-view-overlays .line-numbers.lh-odd {
	margin-top: 1px;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-mouse-cursor-text {
	cursor: text;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-editor .view-overlays .current-line {
	display: block;
	position: absolute;
	left: 0;
	top: 0;
	box-sizing: border-box;
}

.monaco-editor .margin-view-overlays .current-line {
	display: block;
	position: absolute;
	left: 0;
	top: 0;
	box-sizing: border-box;
}

.monaco-editor .margin-view-overlays .current-line.current-line-margin.current-line-margin-both {
	border-right: 0;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

/*
	Keeping name short for faster parsing.
	cdr = core decorations rendering (div)
*/
.monaco-editor .lines-content .cdr {
	position: absolute;
}</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

/* Arrows */
.monaco-scrollable-element > .scrollbar > .scra {
	cursor: pointer;
	font-size: 11px !important;
}

.monaco-scrollable-element > .visible {
	opacity: 1;

	/* Background rule added for IE9 - to allow clicks on dom node */
	background:rgba(0,0,0,0);

	transition: opacity 100ms linear;
}
.monaco-scrollable-element > .invisible {
	opacity: 0;
	pointer-events: none;
}
.monaco-scrollable-element > .invisible.fade {
	transition: opacity 800ms linear;
}

/* Scrollable Content Inset Shadow */
.monaco-scrollable-element > .shadow {
	position: absolute;
	display: none;
}
.monaco-scrollable-element > .shadow.top {
	display: block;
	top: 0;
	left: 3px;
	height: 3px;
	width: 100%;
}
.monaco-scrollable-element > .shadow.left {
	display: block;
	top: 3px;
	left: 0;
	height: 100%;
	width: 3px;
}
.monaco-scrollable-element > .shadow.top-left-corner {
	display: block;
	top: 0;
	left: 0;
	height: 3px;
	width: 3px;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-editor .glyph-margin {
	position: absolute;
	top: 0;
}

/*
	Keeping name short for faster parsing.
	cgmr = core glyph margin rendering (div)
*/
.monaco-editor .margin-view-overlays .cgmr {
	position: absolute;
	display: flex;
	align-items: center;
	justify-content: center;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-editor .lines-content .core-guide {
	position: absolute;
	box-sizing: border-box;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

/* Uncomment to see lines flashing when they're painted */
/*.monaco-editor .view-lines > .view-line {
	background-color: none;
	animation-name: flash-background;
	animation-duration: 800ms;
}
@keyframes flash-background {
	0%   { background-color: lightgreen; }
	100% { background-color: none }
}*/

.mtkcontrol {
	color: rgb(255, 255, 255) !important;
	background: rgb(150, 0, 0) !important;
}

.monaco-editor.no-user-select .lines-content,
.monaco-editor.no-user-select .view-line,
.monaco-editor.no-user-select .view-lines {
	user-select: none;
	-webkit-user-select: none;
	-ms-user-select: none;
}

.monaco-editor .view-lines {
	white-space: nowrap;
}

.monaco-editor .view-line {
	position: absolute;
	width: 100%;
}

.monaco-editor .mtkz {
	display: inline-block;
}

/* TODO@tokenization bootstrap fix */
/*.monaco-editor .view-line > span > span {
	float: none;
	min-height: inherit;
	margin-left: inherit;
}*/
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/
.monaco-editor .lines-decorations {
	position: absolute;
	top: 0;
	background: white;
}

/*
	Keeping name short for faster parsing.
	cldr = core lines decorations rendering (div)
*/
.monaco-editor .margin-view-overlays .cldr {
	position: absolute;
	height: 100%;
}</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

/*
	Keeping name short for faster parsing.
	cmdr = core margin decorations rendering (div)
*/
.monaco-editor .margin-view-overlays .cmdr {
	position: absolute;
	left: 0;
	width: 100%;
	height: 100%;
}</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

/* START cover the case that slider is visible on mouseover */
.monaco-editor .minimap.slider-mouseover .minimap-slider {
	opacity: 0;
	transition: opacity 100ms linear;
}
.monaco-editor .minimap.slider-mouseover:hover .minimap-slider {
	opacity: 1;
}
.monaco-editor .minimap.slider-mouseover .minimap-slider.active {
	opacity: 1;
}
/* END cover the case that slider is visible on mouseover */

.monaco-editor .minimap-shadow-hidden {
	position: absolute;
	width: 0;
}
.monaco-editor .minimap-shadow-visible {
	position: absolute;
	left: -6px;
	width: 6px;
}
.monaco-editor.no-minimap-shadow .minimap-shadow-visible {
	position: absolute;
	left: -1px;
	width: 1px;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/
.monaco-editor .overlayWidgets {
	position: absolute;
	top: 0;
	left:0;
}</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-editor .view-ruler {
	position: absolute;
	top: 0;
}</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-editor .scroll-decoration {
	position: absolute;
	top: 0;
	left: 0;
	height: 6px;
}</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

/*
	Keeping name short for faster parsing.
	cslr = core selections layer rendering (div)
*/
.monaco-editor .lines-content .cslr {
	position: absolute;
}

.monaco-editor			.top-left-radius		{ border-top-left-radius: 3px; }
.monaco-editor			.bottom-left-radius		{ border-bottom-left-radius: 3px; }
.monaco-editor			.top-right-radius		{ border-top-right-radius: 3px; }
.monaco-editor			.bottom-right-radius	{ border-bottom-right-radius: 3px; }

.monaco-editor.hc-black .top-left-radius		{ border-top-left-radius: 0; }
.monaco-editor.hc-black .bottom-left-radius		{ border-bottom-left-radius: 0; }
.monaco-editor.hc-black .top-right-radius		{ border-top-right-radius: 0; }
.monaco-editor.hc-black .bottom-right-radius	{ border-bottom-right-radius: 0; }
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/
.monaco-editor .cursors-layer {
	position: absolute;
	top: 0;
}

.monaco-editor .cursors-layer > .cursor {
	position: absolute;
	overflow: hidden;
}

/* -- smooth-caret-animation -- */
.monaco-editor .cursors-layer.cursor-smooth-caret-animation > .cursor {
	transition: all 80ms;
}

/* -- block-outline-style -- */
.monaco-editor .cursors-layer.cursor-block-outline-style > .cursor {
	box-sizing: border-box;
	background: transparent !important;
	border-style: solid;
	border-width: 1px;
}

/* -- underline-style -- */
.monaco-editor .cursors-layer.cursor-underline-style > .cursor {
	border-bottom-width: 2px;
	border-bottom-style: solid;
	background: transparent !important;
	box-sizing: border-box;
}

/* -- underline-thin-style -- */
.monaco-editor .cursors-layer.cursor-underline-thin-style > .cursor {
	border-bottom-width: 1px;
	border-bottom-style: solid;
	background: transparent !important;
	box-sizing: border-box;
}

@keyframes monaco-cursor-smooth {
	0%,
	20% {
		opacity: 1;
	}
	60%,
	100% {
		opacity: 0;
	}
}

@keyframes monaco-cursor-phase {
	0%,
	20% {
		opacity: 1;
	}
	90%,
	100% {
		opacity: 0;
	}
}

@keyframes monaco-cursor-expand {
	0%,
	20% {
		transform: scaleY(1);
	}
	80%,
	100% {
		transform: scaleY(0);
	}
}

.cursor-smooth {
	animation: monaco-cursor-smooth 0.5s ease-in-out 0s 20 alternate;
}

.cursor-phase {
	animation: monaco-cursor-phase 0.5s ease-in-out 0s 20 alternate;
}

.cursor-expand > .cursor {
	animation: monaco-cursor-expand 0.5s ease-in-out 0s 20 alternate;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-editor .bracket-match {
	box-sizing: border-box;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-editor.vs .dnd-target {
	border-right: 2px dotted black;
	color: white; /* opposite of black */
}
.monaco-editor.vs-dark .dnd-target {
	border-right: 2px dotted #AEAFAD;
	color: #51504f; /* opposite of #AEAFAD */
}
.monaco-editor.hc-black .dnd-target {
	border-right: 2px dotted #fff;
	color: #000; /* opposite of #fff */
}

.monaco-editor.mouse-default .view-lines,
.monaco-editor.vs-dark.mac.mouse-default .view-lines,
.monaco-editor.hc-black.mac.mouse-default .view-lines {
	cursor: default;
}
.monaco-editor.mouse-copy .view-lines,
.monaco-editor.vs-dark.mac.mouse-copy .view-lines,
.monaco-editor.hc-black.mac.mouse-copy .view-lines {
	cursor: copy;
}</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-custom-checkbox {
	margin-left: 2px;
	float: left;
	cursor: pointer;
	overflow: hidden;
	width: 20px;
	height: 20px;
	border-radius: 3px;
	border: 1px solid transparent;
	padding: 1px;
	box-sizing:	border-box;
	user-select: none;
	-webkit-user-select: none;
	-ms-user-select: none;
}

.monaco-custom-checkbox:hover {
	background-color: var(--vscode-inputOption-hoverBackground);
}

.hc-black .monaco-custom-checkbox:hover {
	border: 1px dashed var(--vscode-focusBorder);
}

.hc-black .monaco-custom-checkbox {
	background: none;
}

.hc-black .monaco-custom-checkbox:hover {
	background: none;
}

.monaco-custom-checkbox.monaco-simple-checkbox {
	height: 18px;
	width: 18px;
	border: 1px solid transparent;
	border-radius: 3px;
	margin-right: 9px;
	margin-left: 0px;
	padding: 0px;
	opacity: 1;
	background-size: 16px !important;
}

/* hide check when unchecked */
.monaco-custom-checkbox.monaco-simple-checkbox:not(.checked)::before {
	visibility: hidden;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

:root {
	--sash-size: 4px;
}

.monaco-sash {
	position: absolute;
	z-index: 35;
	touch-action: none;
}

.monaco-sash.disabled {
	pointer-events: none;
}

.monaco-sash.mac.vertical {
	cursor: col-resize;
}

.monaco-sash.vertical.minimum {
	cursor: e-resize;
}

.monaco-sash.vertical.maximum {
	cursor: w-resize;
}

.monaco-sash.mac.horizontal {
	cursor: row-resize;
}

.monaco-sash.horizontal.minimum {
	cursor: s-resize;
}

.monaco-sash.horizontal.maximum {
	cursor: n-resize;
}

.monaco-sash.disabled {
	cursor: default !important;
	pointer-events: none !important;
}

.monaco-sash.vertical {
	cursor: ew-resize;
	top: 0;
	width: var(--sash-size);
	height: 100%;
}

.monaco-sash.horizontal {
	cursor: ns-resize;
	left: 0;
	width: 100%;
	height: var(--sash-size);
}

.monaco-sash:not(.disabled) > .orthogonal-drag-handle {
	content: " ";
	height: calc(var(--sash-size) * 2);
	width: calc(var(--sash-size) * 2);
	z-index: 100;
	display: block;
	cursor: all-scroll;
	position: absolute;
}

.monaco-sash.horizontal.orthogonal-edge-north:not(.disabled)
	> .orthogonal-drag-handle.start,
.monaco-sash.horizontal.orthogonal-edge-south:not(.disabled)
	> .orthogonal-drag-handle.end {
	cursor: nwse-resize;
}

.monaco-sash.horizontal.orthogonal-edge-north:not(.disabled)
	> .orthogonal-drag-handle.end,
.monaco-sash.horizontal.orthogonal-edge-south:not(.disabled)
	> .orthogonal-drag-handle.start {
	cursor: nesw-resize;
}

.monaco-sash.vertical > .orthogonal-drag-handle.start {
	left: calc(var(--sash-size) * -0.5);
	top: calc(var(--sash-size) * -1);
}
.monaco-sash.vertical > .orthogonal-drag-handle.end {
	left: calc(var(--sash-size) * -0.5);
	bottom: calc(var(--sash-size) * -1);
}
.monaco-sash.horizontal > .orthogonal-drag-handle.start {
	top: calc(var(--sash-size) * -0.5);
	left: calc(var(--sash-size) * -1);
}
.monaco-sash.horizontal > .orthogonal-drag-handle.end {
	top: calc(var(--sash-size) * -0.5);
	right: calc(var(--sash-size) * -1);
}

.monaco-sash:before {
	content: '';
	pointer-events: none;
	position: absolute;
	width: 100%;
	height: 100%;
	transition: background-color 0.1s ease-out;
	background: transparent;
}

.monaco-sash.vertical:before {
	width: var(--sash-hover-size);
	left: calc(50% - (var(--sash-hover-size) / 2));
}

.monaco-sash.horizontal:before {
	height: var(--sash-hover-size);
	top: calc(50% - (var(--sash-hover-size) / 2));
}

.pointer-events-disabled {
	pointer-events: none !important;
}

/** Debug **/

.monaco-sash.debug {
	background: cyan;
}

.monaco-sash.debug.disabled {
	background: rgba(0, 255, 255, 0.2);
}

.monaco-sash.debug:not(.disabled) > .orthogonal-drag-handle {
	background: red;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

/* Find widget */
.monaco-editor .find-widget {
	position: absolute;
	z-index: 35;
	height: 33px;
	overflow: hidden;
	line-height: 19px;
	transition: transform 200ms linear;
	padding: 0 4px;
	box-sizing: border-box;
	transform: translateY(calc(-100% - 10px)); /* shadow (10px) */
}

.monaco-editor .find-widget textarea {
	margin: 0px;
}

.monaco-editor .find-widget.hiddenEditor {
	display: none;
}

/* Find widget when replace is toggled on */
.monaco-editor .find-widget.replaceToggled > .replace-part {
	display: flex;
}

.monaco-editor .find-widget.visible  {
	transform: translateY(0);
}

.monaco-editor .find-widget .monaco-inputbox.synthetic-focus {
	outline: 1px solid -webkit-focus-ring-color;
	outline-offset: -1px;
}

.monaco-editor .find-widget .monaco-inputbox .input {
	background-color: transparent;
	min-height: 0;
}

.monaco-editor .find-widget .monaco-findInput .input {
	font-size: 13px;
}

.monaco-editor .find-widget > .find-part,
.monaco-editor .find-widget > .replace-part {
	margin: 4px 0 0 17px;
	font-size: 12px;
	display: flex;
}

.monaco-editor .find-widget > .find-part .monaco-inputbox,
.monaco-editor .find-widget > .replace-part .monaco-inputbox {
	min-height: 25px;
}


.monaco-editor .find-widget > .replace-part .monaco-inputbox > .ibwrapper > .mirror {
	padding-right: 22px;
}

.monaco-editor .find-widget > .find-part .monaco-inputbox > .ibwrapper > .input,
.monaco-editor .find-widget > .find-part .monaco-inputbox > .ibwrapper > .mirror,
.monaco-editor .find-widget > .replace-part .monaco-inputbox > .ibwrapper > .input,
.monaco-editor .find-widget > .replace-part .monaco-inputbox > .ibwrapper > .mirror {
	padding-top: 2px;
	padding-bottom: 2px;
}

.monaco-editor .find-widget > .find-part .find-actions {
	height: 25px;
	display: flex;
	align-items: center;
}

.monaco-editor .find-widget > .replace-part .replace-actions {
	height: 25px;
	display: flex;
	align-items: center;
}

.monaco-editor .find-widget .monaco-findInput {
	vertical-align: middle;
	display: flex;
	flex:1;
}

.monaco-editor .find-widget .monaco-findInput .monaco-scrollable-element {
	/* Make sure textarea inherits the width correctly */
	width: 100%;
}

.monaco-editor .find-widget .monaco-findInput .monaco-scrollable-element .scrollbar.vertical {
	/* Hide vertical scrollbar */
	opacity: 0;
}

.monaco-editor .find-widget .matchesCount {
	display: flex;
	flex: initial;
	margin: 0 0 0 3px;
	padding: 2px 0 0 2px;
	height: 25px;
	vertical-align: middle;
	box-sizing: border-box;
	text-align: center;
	line-height: 23px;
}

.monaco-editor .find-widget .button {
	width: 16px;
	height: 16px;
	padding: 3px;
	border-radius: 5px;
	display: flex;
	flex: initial;
	margin-left: 3px;
	background-position: center center;
	background-repeat: no-repeat;
	cursor: pointer;
	display: flex;
	align-items: center;
	justify-content: center;
}

/* find in selection button */
.monaco-editor .find-widget .codicon-find-selection {
	width: 22px;
	height: 22px;
	padding: 3px;
	border-radius: 5px;
}

.monaco-editor .find-widget .button.left {
	margin-left: 0;
	margin-right: 3px;
}

.monaco-editor .find-widget .button.wide {
	width: auto;
	padding: 1px 6px;
	top: -1px;
}

.monaco-editor .find-widget .button.toggle {
	position: absolute;
	top: 0;
	left: 3px;
	width: 18px;
	height: 100%;
	border-radius: 0;
	box-sizing: border-box;
}

.monaco-editor .find-widget .button.toggle.disabled {
	display: none;
}

.monaco-editor .find-widget .disabled {
	opacity: 0.3;
	cursor: default;
}

.monaco-editor .find-widget > .replace-part {
	display: none;
}

.monaco-editor .find-widget > .replace-part > .monaco-findInput {
	position: relative;
	display: flex;
	vertical-align: middle;
	flex: auto;
	flex-grow: 0;
	flex-shrink: 0;
}

.monaco-editor .find-widget > .replace-part > .monaco-findInput > .controls {
	position: absolute;
	top: 3px;
	right: 2px;
}

/* REDUCED */
.monaco-editor .find-widget.reduced-find-widget .matchesCount {
	display:none;
}

/* NARROW (SMALLER THAN REDUCED) */
.monaco-editor .find-widget.narrow-find-widget {
	max-width: 257px !important;
}

/* COLLAPSED (SMALLER THAN NARROW) */
.monaco-editor .find-widget.collapsed-find-widget {
	max-width: 170px !important;
}

.monaco-editor .find-widget.collapsed-find-widget .button.previous,
.monaco-editor .find-widget.collapsed-find-widget .button.next,
.monaco-editor .find-widget.collapsed-find-widget .button.replace,
.monaco-editor .find-widget.collapsed-find-widget .button.replace-all,
.monaco-editor .find-widget.collapsed-find-widget > .find-part .monaco-findInput .controls {
	display:none;
}

.monaco-editor .findMatch {
	animation-duration: 0;
	animation-name: inherit !important;
}

.monaco-editor .find-widget .monaco-sash {
	left: 0 !important;
}

.monaco-editor.hc-black .find-widget .button:before {
	position: relative;
	top: 1px;
	left: 2px;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-action-bar {
	white-space: nowrap;
	height: 100%;
}

.monaco-action-bar .actions-container {
	display: flex;
	margin: 0 auto;
	padding: 0;
	height: 100%;
	width: 100%;
	align-items: center;
}

.monaco-action-bar.vertical .actions-container {
	display: inline-block;
}

.monaco-action-bar .action-item {
	display: block;
	align-items: center;
	justify-content: center;
	cursor: pointer;
	position: relative;  /* DO NOT REMOVE - this is the key to preventing the ghosting icon bug in Chrome 42 */
}

.monaco-action-bar .action-item.disabled {
	cursor: default;
}

.monaco-action-bar .action-item .icon,
.monaco-action-bar .action-item .codicon {
	display: block;
}

.monaco-action-bar .action-item .codicon {
	display: flex;
	align-items: center;
	width: 16px;
	height: 16px;
}

.monaco-action-bar .action-label {
	font-size: 11px;
	padding: 3px;
	border-radius: 5px;
}

.monaco-action-bar .action-item.disabled .action-label,
.monaco-action-bar .action-item.disabled .action-label::before,
.monaco-action-bar .action-item.disabled .action-label:hover {
	opacity: 0.4;
}

/* Vertical actions */

.monaco-action-bar.vertical {
	text-align: left;
}

.monaco-action-bar.vertical .action-item {
	display: block;
}

.monaco-action-bar.vertical .action-label.separator {
	display: block;
	border-bottom: 1px solid #bbb;
	padding-top: 1px;
	margin-left: .8em;
	margin-right: .8em;
}

.monaco-action-bar .action-item .action-label.separator {
	width: 1px;
	height: 16px;
	margin: 5px 4px !important;
	cursor: default;
	min-width: 1px;
	padding: 0;
	background-color: #bbb;
}

.secondary-actions .monaco-action-bar .action-label {
	margin-left: 6px;
}

/* Action Items */
.monaco-action-bar .action-item.select-container {
	overflow: hidden; /* somehow the dropdown overflows its container, we prevent it here to not push */
	flex: 1;
	max-width: 170px;
	min-width: 60px;
	display: flex;
	align-items: center;
	justify-content: center;
	margin-right: 10px;
}

.monaco-action-bar .action-item.action-dropdown-item {
	display: flex;
}

.monaco-action-bar .action-item.action-dropdown-item > .action-label {
	margin-right: 1px;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-inputbox {
	position: relative;
	display: block;
	padding: 0;
	box-sizing:	border-box;

	/* Customizable */
	font-size: inherit;
}

.monaco-inputbox.idle {
	border: 1px solid transparent;
}

.monaco-inputbox > .ibwrapper > .input,
.monaco-inputbox > .ibwrapper > .mirror {

	/* Customizable */
	padding: 4px;
}

.monaco-inputbox > .ibwrapper {
	position: relative;
	width: 100%;
	height: 100%;
}

.monaco-inputbox > .ibwrapper > .input {
	display: inline-block;
	box-sizing:	border-box;
	width: 100%;
	height: 100%;
	line-height: inherit;
	border: none;
	font-family: inherit;
	font-size: inherit;
	resize: none;
	color: inherit;
}

.monaco-inputbox > .ibwrapper > input {
	text-overflow: ellipsis;
}

.monaco-inputbox > .ibwrapper > textarea.input {
	display: block;
	-ms-overflow-style: none; /* IE 10+: hide scrollbars */
	scrollbar-width: none; /* Firefox: hide scrollbars */
	outline: none;
}

.monaco-inputbox > .ibwrapper > textarea.input::-webkit-scrollbar {
	display: none; /* Chrome + Safari: hide scrollbar */
}

.monaco-inputbox > .ibwrapper > textarea.input.empty {
	white-space: nowrap;
}

.monaco-inputbox > .ibwrapper > .mirror {
	position: absolute;
	display: inline-block;
	width: 100%;
	top: 0;
	left: 0;
	box-sizing: border-box;
	white-space: pre-wrap;
	visibility: hidden;
	word-wrap: break-word;
}

/* Context view */

.monaco-inputbox-container {
	text-align: right;
}

.monaco-inputbox-container .monaco-inputbox-message {
	display: inline-block;
	overflow: hidden;
	text-align: left;
	width: 100%;
	box-sizing:	border-box;
	padding: 0.4em;
	font-size: 12px;
	line-height: 17px;
	margin-top: -1px;
	word-wrap: break-word;
}

/* Action bar support */
.monaco-inputbox .monaco-action-bar {
	position: absolute;
	right: 2px;
	top: 4px;
}

.monaco-inputbox .monaco-action-bar .action-item {
	margin-left: 2px;
}

.monaco-inputbox .monaco-action-bar .action-item .codicon {
	background-repeat: no-repeat;
	width: 16px;
	height: 16px;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/
/* ---------- Find input ---------- */

.monaco-findInput {
	position: relative;
}

.monaco-findInput .monaco-inputbox {
	font-size: 13px;
	width: 100%;
}

.monaco-findInput > .controls {
	position: absolute;
	top: 3px;
	right: 2px;
}

.vs .monaco-findInput.disabled {
	background-color: #E1E1E1;
}

/* Theming */
.vs-dark .monaco-findInput.disabled {
	background-color: #333;
}

/* Highlighting */
.monaco-findInput.highlight-0 .controls {
	animation: monaco-findInput-highlight-0 100ms linear 0s;
}
.monaco-findInput.highlight-1 .controls {
	animation: monaco-findInput-highlight-1 100ms linear 0s;
}
.hc-black .monaco-findInput.highlight-0 .controls,
.vs-dark  .monaco-findInput.highlight-0 .controls {
	animation: monaco-findInput-highlight-dark-0 100ms linear 0s;
}
.hc-black .monaco-findInput.highlight-1 .controls,
.vs-dark  .monaco-findInput.highlight-1 .controls {
	animation: monaco-findInput-highlight-dark-1 100ms linear 0s;
}

@keyframes monaco-findInput-highlight-0 {
	0% { background: rgba(253, 255, 0, 0.8); }
	100% { background: transparent; }
}
@keyframes monaco-findInput-highlight-1 {
	0% { background: rgba(253, 255, 0, 0.8); }
	/* Made intentionally different such that the CSS minifier does not collapse the two animations into a single one*/
	99% { background: transparent; }
}

@keyframes monaco-findInput-highlight-dark-0 {
	0% { background: rgba(255, 255, 255, 0.44); }
	100% { background: transparent; }
}
@keyframes monaco-findInput-highlight-dark-1 {
	0% { background: rgba(255, 255, 255, 0.44); }
	/* Made intentionally different such that the CSS minifier does not collapse the two animations into a single one*/
	99% { background: transparent; }
}</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-editor .goto-definition-link {
	text-decoration: underline;
	cursor: pointer;
}</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-editor .peekview-widget .head {
	box-sizing: border-box;
	display: flex;
	justify-content: space-between;
	flex-wrap: nowrap;
}

.monaco-editor .peekview-widget .head .peekview-title {
	display: flex;
	align-items: center;
	font-size: 13px;
	margin-left: 20px;
	min-width: 0;
	text-overflow: ellipsis;
	overflow: hidden;
}

.monaco-editor .peekview-widget .head .peekview-title.clickable {
	cursor: pointer;
}

.monaco-editor .peekview-widget .head .peekview-title .dirname:not(:empty) {
	font-size: 0.9em;
	margin-left: 0.5em;
	text-overflow: ellipsis;
	overflow: hidden;
}

.monaco-editor .peekview-widget .head .peekview-title .meta {
	white-space: nowrap;
	overflow: hidden;
	text-overflow: ellipsis;
}

.monaco-editor .peekview-widget .head .peekview-title .dirname {
	white-space: nowrap;
}

.monaco-editor .peekview-widget .head .peekview-title .filename {
	overflow: hidden;
	text-overflow: ellipsis;
	white-space: nowrap;
}

.monaco-editor .peekview-widget .head .peekview-title .meta:not(:empty)::before {
	content: '-';
	padding: 0 0.3em;
}

.monaco-editor .peekview-widget .head .peekview-actions {
	flex: 1;
	text-align: right;
	padding-right: 2px;
}

.monaco-editor .peekview-widget .head .peekview-actions > .monaco-action-bar {
	display: inline-block;
}

.monaco-editor .peekview-widget .head .peekview-actions > .monaco-action-bar,
.monaco-editor .peekview-widget .head .peekview-actions > .monaco-action-bar > .actions-container {
	height: 100%;
}

.monaco-editor .peekview-widget > .body {
	border-top: 1px solid;
	position: relative;
}

.monaco-editor .peekview-widget .head .peekview-title .codicon {
	margin-right: 4px;
}

.monaco-editor .peekview-widget .monaco-list .monaco-list-row.focused .codicon {
	color: inherit !important;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/
.monaco-editor .zone-widget {
	position: absolute;
	z-index: 10;
}


.monaco-editor .zone-widget .zone-widget-container {
	border-top-style: solid;
	border-bottom-style: solid;
	border-top-width: 0;
	border-bottom-width: 0;
	position: relative;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-dropdown {
	height: 100%;
	padding: 0;
}

.monaco-dropdown > .dropdown-label {
	cursor: pointer;
	height: 100%;
	display: flex;
	align-items: center;
	justify-content: center;
}

.monaco-dropdown > .dropdown-label > .action-label.disabled {
	cursor: default;
}

.monaco-dropdown-with-primary {
	display: flex !important;
	flex-direction: row;
	border-radius: 5px;
}

.monaco-dropdown-with-primary > .action-container > .action-label {
	margin-right: 0;
}

.monaco-dropdown-with-primary > .dropdown-action-container > .monaco-dropdown > .dropdown-label .codicon[class*='codicon-'] {
	font-size: 12px;
	padding-left: 0px;
	padding-right: 0px;
	line-height: 16px;
	margin-left: -3px;
}

.monaco-dropdown-with-primary > .dropdown-action-container > .monaco-dropdown > .dropdown-label > .action-label {
	display: block;
	background-size: 16px;
	background-position: center center;
	background-repeat: no-repeat;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-action-bar .action-item.menu-entry .action-label.icon {
	width: 16px;
	height: 16px;
	background-repeat: no-repeat;
	background-position: 50%;
	background-size: 16px;
}

.monaco-action-bar .action-item.menu-entry .action-label {
	background-image: var(--menu-entry-icon-light);
}

.vs-dark .monaco-action-bar .action-item.menu-entry .action-label,
.hc-black .monaco-action-bar .action-item.menu-entry .action-label {
	background-image: var(--menu-entry-icon-dark);
}


.monaco-dropdown-with-default {
	display: flex !important;
	flex-direction: row;
	border-radius: 5px;
}

.monaco-dropdown-with-default > .action-container > .action-label {
	margin-right: 0;
}

.monaco-dropdown-with-default > .action-container.menu-entry > .action-label.icon {
	width: 16px;
	height: 16px;
	background-repeat: no-repeat;
	background-position: 50%;
	background-size: 16px;
}

.monaco-dropdown-with-default > .action-container.menu-entry > .action-label {
	background-image: var(--menu-entry-icon-light);
}

.vs-dark .monaco-dropdown-with-default > .action-container.menu-entry > .action-label,
.hc-black .monaco-dropdown-with-default > .action-container.menu-entry > .action-label {
	background-image: var(--menu-entry-icon-dark);
}

.monaco-dropdown-with-default > .dropdown-action-container > .monaco-dropdown > .dropdown-label .codicon[class*='codicon-'] {
	font-size: 12px;
	padding-left: 0px;
	padding-right: 0px;
	line-height: 16px;
	margin-left: -3px;
}

.monaco-dropdown-with-default > .dropdown-action-container > .monaco-dropdown > .dropdown-label > .action-label {
	display: block;
	background-size: 16px;
	background-position: center center;
	background-repeat: no-repeat;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-list {
	position: relative;
	height: 100%;
	width: 100%;
	white-space: nowrap;
}

.monaco-list.mouse-support {
	user-select: none;
	-webkit-user-select: none;
	-ms-user-select: none;
}

.monaco-list > .monaco-scrollable-element {
	height: 100%;
}

.monaco-list-rows {
	position: relative;
	width: 100%;
	height: 100%;
}

.monaco-list.horizontal-scrolling .monaco-list-rows {
	width: auto;
	min-width: 100%;
}

.monaco-list-row {
	position: absolute;
	box-sizing: border-box;
	overflow: hidden;
	width: 100%;
}

.monaco-list.mouse-support .monaco-list-row {
	cursor: pointer;
	touch-action: none;
}

/* for OS X ballistic scrolling */
.monaco-list-row.scrolling {
	display: none !important;
}

/* Focus */
.monaco-list.element-focused,
.monaco-list.selection-single,
.monaco-list.selection-multiple {
	outline: 0 !important;
}

/* Dnd */
.monaco-drag-image {
	display: inline-block;
	padding: 1px 7px;
	border-radius: 10px;
	font-size: 12px;
	position: absolute;
	z-index: 1000;
}

/* Type filter */

.monaco-list-type-filter {
	display: flex;
	align-items: center;
	position: absolute;
	border-radius: 2px;
	padding: 0px 3px;
	max-width: calc(100% - 10px);
	text-overflow: ellipsis;
	overflow: hidden;
	text-align: right;
	box-sizing: border-box;
	cursor: all-scroll;
	font-size: 13px;
	line-height: 18px;
	height: 20px;
	z-index: 1;
	top: 4px;
}

.monaco-list-type-filter.dragging {
	transition: top 0.2s, left 0.2s;
}

.monaco-list-type-filter.ne {
	right: 4px;
}

.monaco-list-type-filter.nw {
	left: 4px;
}

.monaco-list-type-filter > .controls {
	display: flex;
	align-items: center;
	box-sizing: border-box;
	transition: width 0.2s;
	width: 0;
}

.monaco-list-type-filter.dragging > .controls,
.monaco-list-type-filter:hover > .controls {
	width: 36px;
}

.monaco-list-type-filter > .controls > * {
	border: none;
	box-sizing: border-box;
	-webkit-appearance: none;
	-moz-appearance: none;
	background: none;
	width: 16px;
	height: 16px;
	flex-shrink: 0;
	margin: 0;
	padding: 0;
	display: flex;
	align-items: center;
	justify-content: center;
	cursor: pointer;
}

.monaco-list-type-filter > .controls > .filter {
	margin-left: 4px;
}

.monaco-list-type-filter-message {
	position: absolute;
	box-sizing: border-box;
	width: 100%;
	height: 100%;
	top: 0;
	left: 0;
	padding: 40px 1em 1em 1em;
	text-align: center;
	white-space: normal;
	opacity: 0.7;
	pointer-events: none;
}

.monaco-list-type-filter-message:empty {
	display: none;
}

/* Electron */

.monaco-list-type-filter {
	cursor: grab;
}

.monaco-list-type-filter.dragging {
	cursor: grabbing;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-split-view2 {
	position: relative;
	width: 100%;
	height: 100%;
}

.monaco-split-view2 > .sash-container {
	position: absolute;
	width: 100%;
	height: 100%;
	pointer-events: none;
}

.monaco-split-view2 > .sash-container > .monaco-sash {
	pointer-events: initial;
}

.monaco-split-view2 > .monaco-scrollable-element {
	width: 100%;
	height: 100%;
}

.monaco-split-view2 > .monaco-scrollable-element > .split-view-container {
	width: 100%;
	height: 100%;
	white-space: nowrap;
	position: relative;
}

.monaco-split-view2 > .monaco-scrollable-element > .split-view-container > .split-view-view {
	white-space: initial;
	position: absolute;
}

.monaco-split-view2 > .monaco-scrollable-element > .split-view-container > .split-view-view:not(.visible) {
	display: none;
}

.monaco-split-view2.vertical > .monaco-scrollable-element > .split-view-container > .split-view-view {
	width: 100%;
}

.monaco-split-view2.horizontal > .monaco-scrollable-element > .split-view-container > .split-view-view {
	height: 100%;
}

.monaco-split-view2.separator-border > .monaco-scrollable-element > .split-view-container > .split-view-view:not(:first-child)::before {
	content: ' ';
	position: absolute;
	top: 0;
	left: 0;
	z-index: 5;
	pointer-events: none;
	background-color: var(--separator-border);
}

.monaco-split-view2.separator-border.horizontal > .monaco-scrollable-element > .split-view-container > .split-view-view:not(:first-child)::before {
	height: 100%;
	width: 1px;
}

.monaco-split-view2.separator-border.vertical > .monaco-scrollable-element > .split-view-container > .split-view-view:not(:first-child)::before {
	height: 1px;
	width: 100%;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-table {
	display: flex;
	flex-direction: column;
	position: relative;
	height: 100%;
	width: 100%;
	white-space: nowrap;
}

.monaco-table > .monaco-split-view2 {
	border-bottom: 1px solid transparent;
}

.monaco-table > .monaco-list {
	flex: 1;
}

.monaco-table-tr {
	display: flex;
	height: 100%;
}

.monaco-table-th {
	width: 100%;
	height: 100%;
	font-weight: bold;
	overflow: hidden;
	text-overflow: ellipsis;
}

.monaco-table-th,
.monaco-table-td {
	box-sizing: border-box;
	flex-shrink: 0;
	overflow: hidden;
	white-space: nowrap;
	text-overflow: ellipsis;
}

.monaco-table > .monaco-split-view2 .monaco-sash.vertical::before {
	content: "";
	position: absolute;
	left: calc(var(--sash-size) / 2);
	width: 0;
	border-left: 1px solid transparent;
}

.monaco-table > .monaco-split-view2,
.monaco-table > .monaco-split-view2 .monaco-sash.vertical::before {
	transition: border-color 0.2s ease-out;
}
/*
.monaco-table:hover > .monaco-split-view2,
.monaco-table:hover > .monaco-split-view2 .monaco-sash.vertical::before {
	border-color: rgba(204, 204, 204, 0.2);
} */
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-tl-row {
	display: flex;
	height: 100%;
	align-items: center;
	position: relative;
}

.monaco-tl-indent {
	height: 100%;
	position: absolute;
	top: 0;
	left: 16px;
	pointer-events: none;
}

.hide-arrows .monaco-tl-indent {
	left: 12px;
}

.monaco-tl-indent > .indent-guide {
	display: inline-block;
	box-sizing: border-box;
	height: 100%;
	border-left: 1px solid transparent;
}

.monaco-tl-indent > .indent-guide {
	transition: border-color 0.1s linear;
}

.monaco-tl-twistie,
.monaco-tl-contents {
	height: 100%;
}

.monaco-tl-twistie {
	font-size: 10px;
	text-align: right;
	padding-right: 6px;
	flex-shrink: 0;
	width: 16px;
	display: flex !important;
	align-items: center;
	justify-content: center;
	transform: translateX(3px);
}

.monaco-tl-contents {
	flex: 1;
	overflow: hidden;
}

.monaco-tl-twistie::before {
	border-radius: 20px;
}

.monaco-tl-twistie.collapsed::before {
	transform: rotate(-90deg);
}

.monaco-tl-twistie.codicon-tree-item-loading::before {
	/* Use steps to throttle FPS to reduce CPU usage */
	animation: codicon-spin 1.25s steps(30) infinite;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

/* -- zone widget */
.monaco-editor .zone-widget .zone-widget-container.reference-zone-widget {
	border-top-width: 1px;
	border-bottom-width: 1px;
}

.monaco-editor .reference-zone-widget .inline {
	display: inline-block;
	vertical-align: top;
}

.monaco-editor .reference-zone-widget .messages {
	height: 100%;
	width: 100%;
	text-align: center;
	padding: 3em 0;
}

.monaco-editor .reference-zone-widget .ref-tree {
	line-height: 23px;
	background-color: var(--vscode-peekViewResult-background);
	color: var(--vscode-peekViewResult-lineForeground);
}

.monaco-editor .reference-zone-widget .ref-tree .reference {
	text-overflow: ellipsis;
	overflow: hidden;
}

.monaco-editor .reference-zone-widget .ref-tree .reference-file {
	display: inline-flex;
	width: 100%;
	height: 100%;
	color: var(--vscode-peekViewResult-fileForeground);
}

.monaco-editor .reference-zone-widget .ref-tree .monaco-list:focus .selected .reference-file {
	color: inherit !important;
}

.monaco-editor .reference-zone-widget .ref-tree .monaco-list:focus .monaco-list-rows > .monaco-list-row.selected:not(.highlighted) {
	background-color: var(--vscode-peekViewResult-selectionBackground);
	color: var(--vscode-peekViewResult-selectionForeground) !important;
}

.monaco-editor .reference-zone-widget .ref-tree .reference-file .count {
	margin-right: 12px;
	margin-left: auto;
}

.monaco-editor .reference-zone-widget .ref-tree .referenceMatch .highlight {
	background-color: var(--vscode-peekViewResult-matchHighlightBackground);
}

.monaco-editor .reference-zone-widget .preview .reference-decoration {
	background-color: var(--vscode-peekViewEditor-matchHighlightBackground);
	border: 2px solid var(--vscode-peekViewEditor-matchHighlightBorder);
	box-sizing: border-box;
}

.monaco-editor .reference-zone-widget .preview .monaco-editor .monaco-editor-background,
.monaco-editor .reference-zone-widget .preview .monaco-editor .inputarea.ime-input {
	background-color: var(--vscode-peekViewEditor-background);
}

.monaco-editor .reference-zone-widget .preview .monaco-editor .margin {
	background-color: var(--vscode-peekViewEditorGutter-background);
}

/* High Contrast Theming */

.monaco-editor.hc-black .reference-zone-widget .ref-tree .reference-file {
	font-weight: bold;
}

.monaco-editor.hc-black .reference-zone-widget .ref-tree .referenceMatch .highlight {
	border: 1px dotted var(--vscode-contrastActiveBorder, transparent);
	box-sizing: border-box;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-count-badge {
	padding: 3px 6px;
	border-radius: 11px;
	font-size: 11px;
	min-width: 18px;
	min-height: 18px;
	line-height: 11px;
	font-weight: normal;
	text-align: center;
	display: inline-block;
	box-sizing: border-box;
}

.monaco-count-badge.long {
	padding: 2px 3px;
	border-radius: 2px;
	min-height: auto;
	line-height: normal;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

/* ---------- Icon label ---------- */

.monaco-icon-label {
	display: flex; /* required for icons support :before rule */
	overflow: hidden;
	text-overflow: ellipsis;
}

.monaco-icon-label::before {

	/* svg icons rendered as background image */
	background-size: 16px;
	background-position: left center;
	background-repeat: no-repeat;
	padding-right: 6px;
	width: 16px;
	height: 22px;
	line-height: inherit !important;
	display: inline-block;

	/* fonts icons */
	-webkit-font-smoothing: antialiased;
	-moz-osx-font-smoothing: grayscale;
	vertical-align: top;

	flex-shrink: 0; /* fix for https://github.com/microsoft/vscode/issues/13787 */
}

.monaco-icon-label > .monaco-icon-label-container {
	min-width: 0;
	overflow: hidden;
	text-overflow: ellipsis;
	flex: 1;
}

.monaco-icon-label > .monaco-icon-label-container > .monaco-icon-name-container > .label-name {
	color: inherit;
	white-space: pre; /* enable to show labels that include multiple whitespaces */
}

.monaco-icon-label > .monaco-icon-label-container > .monaco-icon-name-container > .label-name > .label-separator {
	margin: 0 2px;
	opacity: 0.5;
}

.monaco-icon-label > .monaco-icon-label-container > .monaco-icon-description-container > .label-description {
	opacity: .7;
	margin-left: 0.5em;
	font-size: 0.9em;
	white-space: pre; /* enable to show labels that include multiple whitespaces */
}

.monaco-icon-label.nowrap > .monaco-icon-label-container > .monaco-icon-description-container > .label-description{
	white-space: nowrap
}

.vs .monaco-icon-label > .monaco-icon-label-container > .monaco-icon-description-container > .label-description {
	opacity: .95;
}

.monaco-icon-label.italic > .monaco-icon-label-container > .monaco-icon-name-container > .label-name,
.monaco-icon-label.italic > .monaco-icon-label-container > .monaco-icon-description-container > .label-description {
	font-style: italic;
}

.monaco-icon-label.deprecated {
	text-decoration: line-through;
	opacity: 0.66;
}

/* make sure apply italic font style to decorations as well */
.monaco-icon-label.italic::after {
	font-style: italic;
}

.monaco-icon-label.strikethrough > .monaco-icon-label-container > .monaco-icon-name-container > .label-name,
.monaco-icon-label.strikethrough > .monaco-icon-label-container > .monaco-icon-description-container > .label-description {
	text-decoration: line-through;
}

.monaco-icon-label::after {
	opacity: 0.75;
	font-size: 90%;
	font-weight: 600;
	margin: auto 16px 0 5px; /* https://github.com/microsoft/vscode/issues/113223 */
	text-align: center;
}

/* make sure selection color wins when a label is being selected */
.monaco-list:focus .selected .monaco-icon-label, /* list */
.monaco-list:focus .selected .monaco-icon-label::after
{
	color: inherit !important;
}

.monaco-list-row.focused.selected .label-description,
.monaco-list-row.selected .label-description {
	opacity: .8;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-editor .monaco-editor-overlaymessage {
	padding-bottom: 8px;
	z-index: 10000;
}

.monaco-editor .monaco-editor-overlaymessage.below {
	padding-bottom: 0;
	padding-top: 8px;
	z-index: 10000;
}

@keyframes fadeIn {
	from { opacity: 0; }
	to { opacity: 1; }
}
.monaco-editor .monaco-editor-overlaymessage.fadeIn {
	animation: fadeIn 150ms ease-out;
}

@keyframes fadeOut {
	from { opacity: 1; }
	to { opacity: 0; }
}
.monaco-editor .monaco-editor-overlaymessage.fadeOut {
	animation: fadeOut 100ms ease-out;
}

.monaco-editor .monaco-editor-overlaymessage .message {
	padding: 1px 4px;
	color: var(--vscode-inputValidation-infoForeground);
	background-color: var(--vscode-inputValidation-infoBackground);
	border: 1px solid var(--vscode-inputValidation-infoBorder);
}

.monaco-editor.hc-black .monaco-editor-overlaymessage .message {
	border-width: 2px;
}

.monaco-editor .monaco-editor-overlaymessage .anchor {
	width: 0 !important;
	height: 0 !important;
	border-color: transparent;
	border-style: solid;
	z-index: 1000;
	border-width: 8px;
	position: absolute;
}

.monaco-editor .monaco-editor-overlaymessage .anchor.top {
	border-bottom-color: var(--vscode-inputValidation-infoBorder);
}

.monaco-editor .monaco-editor-overlaymessage .anchor.below {
	border-top-color: var(--vscode-inputValidation-infoBorder);
}

.monaco-editor .monaco-editor-overlaymessage:not(.below) .anchor.top,
.monaco-editor .monaco-editor-overlaymessage.below .anchor.below {
	display: none;
}

.monaco-editor .monaco-editor-overlaymessage.below .anchor.top {
	display: inherit;
	top: -8px;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-hover {
	cursor: default;
	position: absolute;
	overflow: hidden;
	z-index: 50;
	user-select: text;
	-webkit-user-select: text;
	-ms-user-select: text;
	box-sizing: initial;
	animation: fadein 100ms linear;
	line-height: 1.5em;
}

.monaco-hover.hidden {
	display: none;
}

.monaco-hover a:hover {
	cursor: pointer;
}

.monaco-hover .hover-contents:not(.html-hover-contents) {
	padding: 4px 8px;
}

.monaco-hover .markdown-hover > .hover-contents:not(.code-hover-contents) {
	max-width: 500px;
	word-wrap: break-word;
}

.monaco-hover .markdown-hover > .hover-contents:not(.code-hover-contents) hr {
	min-width: 100%;
}

.monaco-hover p,
.monaco-hover .code,
.monaco-hover ul {
	margin: 8px 0;
}

.monaco-hover code {
	font-family: var(--monaco-monospace-font);
}

.monaco-hover hr {
	box-sizing: border-box;
	border-left: 0px;
	border-right: 0px;
	margin-top: 4px;
	margin-bottom: -4px;
	margin-left: -8px;
	margin-right: -8px;
	height: 1px;
}

.monaco-hover p:first-child,
.monaco-hover .code:first-child,
.monaco-hover ul:first-child {
	margin-top: 0;
}

.monaco-hover p:last-child,
.monaco-hover .code:last-child,
.monaco-hover ul:last-child {
	margin-bottom: 0;
}

/* MarkupContent Layout */
.monaco-hover ul {
	padding-left: 20px;
}
.monaco-hover ol {
	padding-left: 20px;
}

.monaco-hover li > p {
	margin-bottom: 0;
}

.monaco-hover li > ul {
	margin-top: 0;
}

.monaco-hover code {
	border-radius: 3px;
	padding: 0 0.4em;
}

.monaco-hover .monaco-tokenized-source {
	white-space: pre-wrap;
}

.monaco-hover .hover-row.status-bar {
	font-size: 12px;
	line-height: 22px;
}

.monaco-hover .hover-row.status-bar .actions {
	display: flex;
	padding: 0px 8px;
}

.monaco-hover .hover-row.status-bar .actions .action-container {
	margin-right: 16px;
	cursor: pointer;
}

.monaco-hover .hover-row.status-bar .actions .action-container .action .icon {
	padding-right: 4px;
}

.monaco-hover .markdown-hover .hover-contents .codicon {
	color: inherit;
	font-size: inherit;
	vertical-align: middle;
}

.monaco-hover .hover-contents a.code-link:hover,
.monaco-hover .hover-contents a.code-link {
	color: inherit;
}

.monaco-hover .hover-contents a.code-link:before {
	content: '(';
}

.monaco-hover .hover-contents a.code-link:after {
	content: ')';
}

.monaco-hover .hover-contents a.code-link > span {
	text-decoration: underline;
	/** Hack to force underline to show **/
	border-bottom: 1px solid transparent;
	text-underline-position: under;
}

/** Spans in markdown hovers need a margin-bottom to avoid looking cramped: https://github.com/microsoft/vscode/issues/101496 **/
.monaco-hover .markdown-hover .hover-contents:not(.code-hover-contents):not(.html-hover-contents) span {
	margin-bottom: 4px;
	display: inline-block;
}

.monaco-hover-content .action-container a {
	-webkit-user-select: none;
	user-select: none;
}

.monaco-hover-content .action-container.disabled {
	pointer-events: none;
	opacity: 0.4;
	cursor: default;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-editor .contentWidgets .codicon-light-bulb,
.monaco-editor .contentWidgets .codicon-lightbulb-autofix {
	display: flex;
	align-items: center;
	justify-content: center;
}

.monaco-editor .contentWidgets .codicon-light-bulb:hover,
.monaco-editor .contentWidgets .codicon-lightbulb-autofix:hover {
	cursor: pointer;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

/* marker zone */

.monaco-editor .peekview-widget .head .peekview-title .severity-icon {
	display: inline-block;
	vertical-align: text-top;
	margin-right: 4px;
}

.monaco-editor .marker-widget {
	text-overflow: ellipsis;
	white-space: nowrap;
}

.monaco-editor .marker-widget > .stale {
	opacity: 0.6;
	font-style: italic;
}

.monaco-editor .marker-widget .title {
	display: inline-block;
	padding-right: 5px;
}

.monaco-editor .marker-widget .descriptioncontainer {
	position: absolute;
	white-space: pre;
	user-select: text;
	-webkit-user-select: text;
	-ms-user-select: text;
	padding: 8px 12px 0 20px;
}

.monaco-editor .marker-widget .descriptioncontainer .message {
	display: flex;
	flex-direction: column;
}

.monaco-editor .marker-widget .descriptioncontainer .message .details {
	padding-left: 6px;
}

.monaco-editor .marker-widget .descriptioncontainer .message .source,
.monaco-editor .marker-widget .descriptioncontainer .message span.code {
	opacity: 0.6;
}

.monaco-editor .marker-widget .descriptioncontainer .message a.code-link {
	opacity: 0.6;
	color: inherit;
}

.monaco-editor .marker-widget .descriptioncontainer .message a.code-link:before {
	content: '(';
}

.monaco-editor .marker-widget .descriptioncontainer .message a.code-link:after {
	content: ')';
}

.monaco-editor .marker-widget .descriptioncontainer .message a.code-link > span {
	text-decoration: underline;
	/** Hack to force underline to show **/
	border-bottom: 1px solid transparent;
	text-underline-position: under;
	color: var(--vscode-textLink-foreground);
}

.monaco-editor .marker-widget .descriptioncontainer .message a.code-link > span {
	color: var(--vscode-textLink-activeForeground);
}

.monaco-editor .marker-widget .descriptioncontainer .filename {
	cursor: pointer;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/
.monaco-editor .detected-link,
.monaco-editor .detected-link-active {
	text-decoration: underline;
	text-underline-position: under;
}

.monaco-editor .detected-link-active {
	cursor: pointer;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-editor .parameter-hints-widget {
	/* Must be higher than the sash's z-index and terminal canvases but lower than the suggest widget */
	z-index: 39;
	display: flex;
	flex-direction: column;
	line-height: 1.5em;
}

.monaco-editor .parameter-hints-widget > .phwrapper {
	max-width: 440px;
	display: flex;
	flex-direction: row;
}

.monaco-editor .parameter-hints-widget.multiple {
	min-height: 3.3em;
	padding: 0;
}

.monaco-editor .parameter-hints-widget.visible {
	transition: left .05s ease-in-out;
}

.monaco-editor .parameter-hints-widget p,
.monaco-editor .parameter-hints-widget ul {
	margin: 8px 0;
}

.monaco-editor .parameter-hints-widget .monaco-scrollable-element,
.monaco-editor .parameter-hints-widget .body {
	display: flex;
	flex: 1;
	flex-direction: column;
	min-height: 100%;
}

.monaco-editor .parameter-hints-widget .signature {
	padding: 4px 5px;
}

.monaco-editor .parameter-hints-widget .docs {
	padding: 0 10px 0 5px;
	white-space: pre-wrap;
}

.monaco-editor .parameter-hints-widget .docs.empty {
	display: none;
}

.monaco-editor .parameter-hints-widget .docs .markdown-docs {
	white-space: initial;
}

.monaco-editor .parameter-hints-widget .docs .markdown-docs code {
	font-family: var(--monaco-monospace-font);
}

.monaco-editor .parameter-hints-widget .docs  .monaco-tokenized-source,
.monaco-editor .parameter-hints-widget .docs .code {
	white-space: pre-wrap;
}

.monaco-editor .parameter-hints-widget .docs code {
	border-radius: 3px;
	padding: 0 0.4em;
}

.monaco-editor .parameter-hints-widget .controls {
	display: none;
	flex-direction: column;
	align-items: center;
	min-width: 22px;
	justify-content: flex-end;
}

.monaco-editor .parameter-hints-widget.multiple .controls {
	display: flex;
	padding: 0 2px;
}

.monaco-editor .parameter-hints-widget.multiple .button {
	width: 16px;
	height: 16px;
	background-repeat: no-repeat;
	cursor: pointer;
}

.monaco-editor .parameter-hints-widget .button.previous {
	bottom: 24px;
}

.monaco-editor .parameter-hints-widget .overloads {
	text-align: center;
	height: 12px;
	line-height: 12px;
	font-family: var(--monaco-monospace-font);
}

.monaco-editor .parameter-hints-widget .signature .parameter.active {
	font-weight: bold;
}

.monaco-editor .parameter-hints-widget .documentation-parameter > .parameter {
	font-weight: bold;
	margin-right: 0.5em;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-editor .snippet-placeholder {
	min-width: 2px;
	outline-style: solid;
	outline-width: 1px;
	background-color: var(--vscode-editor-snippetTabstopHighlightBackground, transparent);
	outline-color: var(--vscode-editor-snippetTabstopHighlightBorder, transparent);
}

.monaco-editor .finish-snippet-placeholder {
	outline-style: solid;
	outline-width: 1px;
	background-color: var(--vscode-editor-snippetFinalTabstopHighlightBackground, transparent);
	outline-color: var(--vscode-editor-snippetFinalTabstopHighlightBorder, transparent);
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

@font-face {
	font-family: "codicon";
	font-display: block;
	src: url(https://static.leetcode-cn.com/lc-monaco/ade705761eb7e702770d.ttf) format("truetype");
}

.codicon[class*='codicon-'] {
	font: normal normal normal 16px/1 codicon;
	display: inline-block;
	text-decoration: none;
	text-rendering: auto;
	text-align: center;
	text-transform: none;
	-webkit-font-smoothing: antialiased;
	-moz-osx-font-smoothing: grayscale;
	user-select: none;
	-webkit-user-select: none;
	-ms-user-select: none;
}

/* icon rules are dynamically created by the platform theme service (see iconsStyleSheet.ts) */
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.codicon-wrench-subaction {
	opacity: 0.5;
}

@keyframes codicon-spin {
	100% {
		transform:rotate(360deg);
	}
}

.codicon-sync.codicon-modifier-spin,
.codicon-loading.codicon-modifier-spin,
.codicon-gear.codicon-modifier-spin,
.codicon-notebook-state-executing.codicon-modifier-spin {
	/* Use steps to throttle FPS to reduce CPU usage */
	animation: codicon-spin 1.5s steps(30) infinite;
}

.codicon-modifier-disabled {
	opacity: 0.4;
}

/* custom speed & easing for loading icon */
.codicon-loading,
.codicon-tree-item-loading::before {
	animation-duration: 1s !important;
	animation-timing-function: cubic-bezier(0.53, 0.21, 0.29, 0.67) !important;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

/* Suggest widget*/

.monaco-editor .suggest-widget {
	width: 430px;
	z-index: 40;
	display: flex;
	flex-direction: column;
}

.monaco-editor .suggest-widget.message {
	flex-direction: row;
	align-items: center;
}

.monaco-editor .suggest-widget,
.monaco-editor .suggest-details {
	flex: 0 1 auto;
	width: 100%;
	border-style: solid;
	border-width: 1px;
	border-color: var(--vscode-editorSuggestWidget-border);
	background-color: var(--vscode-editorSuggestWidget-background);
}

.monaco-editor.hc-black .suggest-widget,
.monaco-editor.hc-black .suggest-details {
	border-width: 2px;
}

/* Styles for status bar part */


.monaco-editor .suggest-widget .suggest-status-bar {
	box-sizing: border-box;
	display: none;
	flex-flow: row nowrap;
	justify-content: space-between;
	width: 100%;
	font-size: 80%;
	padding: 0 4px 0 4px;
	border-top: 1px solid var(--vscode-editorSuggestWidget-border);
	overflow: hidden;
}

.monaco-editor .suggest-widget.with-status-bar .suggest-status-bar {
	display: flex;
}

.monaco-editor .suggest-widget .suggest-status-bar .left {
	padding-right: 8px;
}

.monaco-editor .suggest-widget.with-status-bar .suggest-status-bar .action-label {
	color: var(--vscode-editorSuggestWidgetStatus-foreground);
}

.monaco-editor .suggest-widget.with-status-bar .suggest-status-bar .action-item:not(:last-of-type) .action-label {
	margin-right: 0;
}

.monaco-editor .suggest-widget.with-status-bar .suggest-status-bar .action-item:not(:last-of-type) .action-label::after {
	content: ', ';
	margin-right: 0.3em;
}

.monaco-editor .suggest-widget.with-status-bar .monaco-list .monaco-list-row>.contents>.main>.right>.readMore,
.monaco-editor .suggest-widget.with-status-bar .monaco-list .monaco-list-row.focused.string-label>.contents>.main>.right>.readMore {
	display: none;
}

.monaco-editor .suggest-widget.with-status-bar:not(.docs-side) .monaco-list .monaco-list-row:hover>.contents>.main>.right.can-expand-details>.details-label {
	width: 100%;
}

/* Styles for Message element for when widget is loading or is empty */

.monaco-editor .suggest-widget>.message {
	padding-left: 22px;
}

/** Styles for the list element **/

.monaco-editor .suggest-widget>.tree {
	height: 100%;
	width: 100%;
}

.monaco-editor .suggest-widget .monaco-list {
	user-select: none;
	-webkit-user-select: none;
	-ms-user-select: none;
}

/** Styles for each row in the list element **/

.monaco-editor .suggest-widget .monaco-list .monaco-list-row {
	display: flex;
	-mox-box-sizing: border-box;
	box-sizing: border-box;
	padding-right: 10px;
	background-repeat: no-repeat;
	background-position: 2px 2px;
	white-space: nowrap;
	cursor: pointer;
	touch-action: none;
}

.monaco-editor .suggest-widget .monaco-list .monaco-list-row.focused {
	color: var(--vscode-editorSuggestWidget-selectedForeground);
}

.monaco-editor .suggest-widget .monaco-list .monaco-list-row.focused .codicon {
	color: var(--vscode-editorSuggestWidget-selectedIconForeground);
}

.monaco-editor .suggest-widget .monaco-list .monaco-list-row>.contents {
	flex: 1;
	height: 100%;
	overflow: hidden;
	padding-left: 2px;
}

.monaco-editor .suggest-widget .monaco-list .monaco-list-row>.contents>.main {
	display: flex;
	overflow: hidden;
	text-overflow: ellipsis;
	white-space: pre;
	justify-content: space-between;
}

.monaco-editor .suggest-widget .monaco-list .monaco-list-row>.contents>.main>.left, .monaco-editor .suggest-widget .monaco-list .monaco-list-row>.contents>.main>.right {
	display: flex;
}

.monaco-editor .suggest-widget .monaco-list .monaco-list-row:not(.focused)>.contents>.main .monaco-icon-label {
	color: var(--vscode-editorSuggestWidget-foreground);
}

.monaco-editor .suggest-widget:not(.frozen) .monaco-highlighted-label .highlight {
	font-weight: bold;
}

.monaco-editor .suggest-widget .monaco-list .monaco-list-row>.contents>.main .monaco-highlighted-label .highlight {
	color: var(--vscode-editorSuggestWidget-highlightForeground);
}

.monaco-editor .suggest-widget .monaco-list .monaco-list-row.focused>.contents>.main .monaco-highlighted-label .highlight {
	color: var(--vscode-editorSuggestWidget-focusHighlightForeground);
}

/** ReadMore Icon styles **/

.monaco-editor .suggest-details>.monaco-scrollable-element>.body>.header>.codicon-close,
.monaco-editor .suggest-widget .monaco-list .monaco-list-row>.contents>.main>.right>.readMore::before {
	color: inherit;
	opacity: 1;
	font-size: 14px;
	cursor: pointer;
}

.monaco-editor .suggest-details>.monaco-scrollable-element>.body>.header>.codicon-close {
	position: absolute;
	top: 6px;
	right: 2px;
}

.monaco-editor .suggest-details>.monaco-scrollable-element>.body>.header>.codicon-close:hover,
.monaco-editor .suggest-widget .monaco-list .monaco-list-row>.contents>.main>.right>.readMore:hover {
	opacity: 1;
}

/** signature, qualifier, type/details opacity **/

.monaco-editor .suggest-widget .monaco-list .monaco-list-row>.contents>.main>.right>.details-label {
	opacity: 0.7;
}

.monaco-editor .suggest-widget .monaco-list .monaco-list-row>.contents>.main>.left>.signature-label {
	overflow: hidden;
	text-overflow: ellipsis;
	opacity: 0.6;
}

.monaco-editor .suggest-widget .monaco-list .monaco-list-row>.contents>.main>.left>.qualifier-label {
	margin-left: 12px;
	opacity: 0.4;
	font-size: 85%;
	line-height: initial;
	text-overflow: ellipsis;
	overflow: hidden;
	align-self: center;
}

/** Type Info and icon next to the label in the focused completion item **/

.monaco-editor .suggest-widget .monaco-list .monaco-list-row>.contents>.main>.right>.details-label {
	font-size: 85%;
	margin-left: 1.1em;
	overflow: hidden;
	text-overflow: ellipsis;
	white-space: nowrap;
}

.monaco-editor .suggest-widget .monaco-list .monaco-list-row>.contents>.main>.right>.details-label>.monaco-tokenized-source {
	display: inline;
}

/** Details: if using CompletionItem#details, show on focus **/

.monaco-editor .suggest-widget .monaco-list .monaco-list-row>.contents>.main>.right>.details-label {
	display: none;
}

.monaco-editor .suggest-widget:not(.shows-details) .monaco-list .monaco-list-row.focused>.contents>.main>.right>.details-label {
	display: inline;
}

/** Details: if using CompletionItemLabel#details, always show **/

.monaco-editor .suggest-widget .monaco-list .monaco-list-row:not(.string-label)>.contents>.main>.right>.details-label,
.monaco-editor .suggest-widget.docs-side .monaco-list .monaco-list-row.focused:not(.string-label)>.contents>.main>.right>.details-label {
	display: inline;
}

/** Ellipsis on hover **/

.monaco-editor .suggest-widget:not(.docs-side) .monaco-list .monaco-list-row.focused:hover>.contents>.main>.right.can-expand-details>.details-label {
	width: calc(100% - 26px);
}

.monaco-editor .suggest-widget .monaco-list .monaco-list-row>.contents>.main>.left {
	flex-shrink: 1;
	flex-grow: 1;
	overflow: hidden;
}

.monaco-editor .suggest-widget .monaco-list .monaco-list-row>.contents>.main>.left>.monaco-icon-label {
	flex-shrink: 0;
}

.monaco-editor .suggest-widget .monaco-list .monaco-list-row:not(.string-label)>.contents>.main>.left>.monaco-icon-label {
	max-width: 100%;
}

.monaco-editor .suggest-widget .monaco-list .monaco-list-row.string-label>.contents>.main>.left>.monaco-icon-label {
	flex-shrink: 1;
}

.monaco-editor .suggest-widget .monaco-list .monaco-list-row>.contents>.main>.right {
	overflow: hidden;
	flex-shrink: 4;
	max-width: 70%;
}

.monaco-editor .suggest-widget .monaco-list .monaco-list-row>.contents>.main>.right>.readMore {
	display: inline-block;
	position: absolute;
	right: 10px;
	width: 18px;
	height: 18px;
	visibility: hidden;
}

/** Do NOT display ReadMore when docs is side/below **/

.monaco-editor .suggest-widget.docs-side .monaco-list .monaco-list-row>.contents>.main>.right>.readMore {
	display: none !important;
}

/** Do NOT display ReadMore when using plain CompletionItemLabel (details/documentation might not be resolved) **/

.monaco-editor .suggest-widget .monaco-list .monaco-list-row.string-label>.contents>.main>.right>.readMore {
	display: none;
}

/** Focused item can show ReadMore, but can't when docs is side/below **/

.monaco-editor .suggest-widget .monaco-list .monaco-list-row.focused.string-label>.contents>.main>.right>.readMore {
	display: inline-block;
}

.monaco-editor .suggest-widget .monaco-list .monaco-list-row.focused:hover>.contents>.main>.right>.readMore {
	visibility: visible;
}

/** Styles for each row in the list **/

.monaco-editor .suggest-widget .monaco-list .monaco-list-row .monaco-icon-label.deprecated {
	opacity: 0.66;
	text-decoration: unset;
}

.monaco-editor .suggest-widget .monaco-list .monaco-list-row .monaco-icon-label.deprecated>.monaco-icon-label-container>.monaco-icon-name-container {
	text-decoration: line-through;
}

.monaco-editor .suggest-widget .monaco-list .monaco-list-row .monaco-icon-label::before {
	height: 100%;
}

.monaco-editor .suggest-widget .monaco-list .monaco-list-row .icon {
	display: block;
	height: 16px;
	width: 16px;
	margin-left: 2px;
	background-repeat: no-repeat;
	background-size: 80%;
	background-position: center;
}

.monaco-editor .suggest-widget .monaco-list .monaco-list-row .icon.hide {
	display: none;
}

.monaco-editor .suggest-widget .monaco-list .monaco-list-row .suggest-icon {
	display: flex;
	align-items: center;
	margin-right: 4px;
}

.monaco-editor .suggest-widget.no-icons .monaco-list .monaco-list-row .icon, .monaco-editor .suggest-widget.no-icons .monaco-list .monaco-list-row .suggest-icon::before {
	display: none;
}

.monaco-editor .suggest-widget .monaco-list .monaco-list-row .icon.customcolor .colorspan {
	margin: 0 0 0 0.3em;
	border: 0.1em solid #000;
	width: 0.7em;
	height: 0.7em;
	display: inline-block;
}

/** Styles for the docs of the completion item in focus **/

.monaco-editor .suggest-details-container {
	z-index: 41;
}

.monaco-editor .suggest-details {
	display: flex;
	flex-direction: column;
	cursor: default;
	color: var(--vscode-editorSuggestWidget-foreground);
}

.monaco-editor .suggest-details.focused {
	border-color: var(--vscode-focusBorder);
}

.monaco-editor .suggest-details a {
	color: var(--vscode-textLink-foreground);
}

.monaco-editor .suggest-details a:hover {
	color: var(--vscode-textLink-activeForeground);
}

.monaco-editor .suggest-details code {
	background-color: var(--vscode-textCodeBlock-background);
}

.monaco-editor .suggest-details.no-docs {
	display: none;
}

.monaco-editor .suggest-details>.monaco-scrollable-element {
	flex: 1;
}

.monaco-editor .suggest-details>.monaco-scrollable-element>.body {
	box-sizing: border-box;
	height: 100%;
	width: 100%;
}

.monaco-editor .suggest-details>.monaco-scrollable-element>.body>.header>.type {
	flex: 2;
	overflow: hidden;
	text-overflow: ellipsis;
	opacity: 0.7;
	white-space: pre;
	margin: 0 24px 0 0;
	padding: 4px 0 12px 5px;
}

.monaco-editor .suggest-details>.monaco-scrollable-element>.body>.header>.type.auto-wrap {
	white-space: normal;
	word-break: break-all;
}

.monaco-editor .suggest-details>.monaco-scrollable-element>.body>.docs {
	margin: 0;
	padding: 4px 5px;
	white-space: pre-wrap;
}

.monaco-editor .suggest-details.no-type>.monaco-scrollable-element>.body>.docs {
	margin-right: 24px;
	overflow: hidden;
}

.monaco-editor .suggest-details>.monaco-scrollable-element>.body>.docs.markdown-docs {
	padding: 0;
	white-space: initial;
	min-height: calc(1rem + 8px);
}

.monaco-editor .suggest-details>.monaco-scrollable-element>.body>.docs.markdown-docs>div,
.monaco-editor .suggest-details>.monaco-scrollable-element>.body>.docs.markdown-docs>span:not(:empty) {
	padding: 4px 5px;
}

.monaco-editor .suggest-details>.monaco-scrollable-element>.body>.docs.markdown-docs>div>p:first-child {
	margin-top: 0;
}

.monaco-editor .suggest-details>.monaco-scrollable-element>.body>.docs.markdown-docs>div>p:last-child {
	margin-bottom: 0;
}

.monaco-editor .suggest-details>.monaco-scrollable-element>.body>.docs.markdown-docs .monaco-tokenized-source {
	white-space: pre;
}

.monaco-editor .suggest-details>.monaco-scrollable-element>.body>.docs .code {
	white-space: pre-wrap;
	word-wrap: break-word;
}

.monaco-editor .suggest-details>.monaco-scrollable-element>.body>.docs.markdown-docs .codicon {
	vertical-align: sub;
}

.monaco-editor .suggest-details>.monaco-scrollable-element>.body>p:empty {
	display: none;
}

.monaco-editor .suggest-details code {
	border-radius: 3px;
	padding: 0 0.4em;
}

.monaco-editor .suggest-details ul {
	padding-left: 20px;
}

.monaco-editor .suggest-details ol {
	padding-left: 20px;
}

.monaco-editor .suggest-details p code {
	font-family: var(--monaco-monospace-font);
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-editor .accessibilityHelpWidget {
	padding: 10px;
	vertical-align: middle;
	overflow: scroll;
}</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-editor .tokens-inspect-widget {
	z-index: 50;
	user-select: text;
	-webkit-user-select: text;
	-ms-user-select: text;
	padding: 10px;
}

.tokens-inspect-separator {
	height: 1px;
	border: 0;
}

.monaco-editor .tokens-inspect-widget .tm-token {
	font-family: var(--monaco-monospace-font);
}

.monaco-editor .tokens-inspect-widget .tm-token-length {
	font-weight: normal;
	font-size: 60%;
	float: right;
}

.monaco-editor .tokens-inspect-widget .tm-metadata-table {
	width: 100%;
}

.monaco-editor .tokens-inspect-widget .tm-metadata-value {
	font-family: var(--monaco-monospace-font);
	text-align: right;
}

.monaco-editor .tokens-inspect-widget .tm-token-type {
	font-family: var(--monaco-monospace-font);
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/


/* Default standalone editor fonts */
.monaco-editor {
	font-family: -apple-system, BlinkMacSystemFont, "Segoe WPC", "Segoe UI", "HelveticaNeue-Light", system-ui, "Ubuntu", "Droid Sans", sans-serif;
	--monaco-monospace-font: "SF Mono", Monaco, Menlo, Consolas, "Ubuntu Mono", "Liberation Mono", "DejaVu Sans Mono", "Courier New", monospace;
}

.monaco-menu .monaco-action-bar.vertical .action-item .action-menu-item:focus .action-label {
	stroke-width: 1.2px;
}

.monaco-editor.vs-dark .monaco-menu .monaco-action-bar.vertical .action-menu-item:focus .action-label,
.monaco-editor.hc-black .monaco-menu .monaco-action-bar.vertical .action-menu-item:focus .action-label {
	stroke-width: 1.2px;
}

.monaco-hover p {
	margin: 0;
}

/* See https://github.com/microsoft/monaco-editor/issues/2168#issuecomment-780078600 */
.monaco-aria-container {
	position: absolute !important;
	top: 0; /* avoid being placed underneath a sibling element */
	height: 1px;
	width: 1px;
	margin: -1px;
	overflow: hidden;
	padding: 0;
	clip: rect(1px, 1px, 1px, 1px);
	clip-path: inset(50%);
}

/* The hc-black theme is already high contrast optimized */
.monaco-editor.hc-black {
	-ms-high-contrast-adjust: none;
}
/* In case the browser goes into high contrast mode and the editor is not configured with the hc-black theme */
@media screen and (-ms-high-contrast:active) {

	/* current line highlight */
	.monaco-editor.vs .view-overlays .current-line,
	.monaco-editor.vs-dark .view-overlays .current-line {
		border-color: windowtext !important;
		border-left: 0;
		border-right: 0;
	}

	/* view cursors */
	.monaco-editor.vs .cursor,
	.monaco-editor.vs-dark .cursor {
		background-color: windowtext !important;
	}
	/* dnd target */
	.monaco-editor.vs .dnd-target,
	.monaco-editor.vs-dark .dnd-target {
		border-color: windowtext !important;
	}

	/* selected text background */
	.monaco-editor.vs .selected-text,
	.monaco-editor.vs-dark .selected-text {
		background-color: highlight !important;
	}

	/* allow the text to have a transparent background. */
	.monaco-editor.vs .view-line,
	.monaco-editor.vs-dark .view-line {
		-ms-high-contrast-adjust: none;
	}

	/* text color */
	.monaco-editor.vs .view-line span,
	.monaco-editor.vs-dark .view-line span {
		color: windowtext !important;
	}
	/* selected text color */
	.monaco-editor.vs .view-line span.inline-selected-text,
	.monaco-editor.vs-dark .view-line span.inline-selected-text {
		color: highlighttext !important;
	}

	/* allow decorations */
	.monaco-editor.vs .view-overlays,
	.monaco-editor.vs-dark .view-overlays {
		-ms-high-contrast-adjust: none;
	}

	/* various decorations */
	.monaco-editor.vs .selectionHighlight,
	.monaco-editor.vs-dark .selectionHighlight,
	.monaco-editor.vs .wordHighlight,
	.monaco-editor.vs-dark .wordHighlight,
	.monaco-editor.vs .wordHighlightStrong,
	.monaco-editor.vs-dark .wordHighlightStrong,
	.monaco-editor.vs .reference-decoration,
	.monaco-editor.vs-dark .reference-decoration {
		border: 2px dotted highlight !important;
		background: transparent !important;
		box-sizing: border-box;
	}
	.monaco-editor.vs .rangeHighlight,
	.monaco-editor.vs-dark .rangeHighlight {
		background: transparent !important;
		border: 1px dotted activeborder !important;
		box-sizing: border-box;
	}
	.monaco-editor.vs .bracket-match,
	.monaco-editor.vs-dark .bracket-match {
		border-color: windowtext !important;
		background: transparent !important;
	}

	/* find widget */
	.monaco-editor.vs .findMatch,
	.monaco-editor.vs-dark .findMatch,
	.monaco-editor.vs .currentFindMatch,
	.monaco-editor.vs-dark .currentFindMatch {
		border: 2px dotted activeborder !important;
		background: transparent !important;
		box-sizing: border-box;
	}
	.monaco-editor.vs .find-widget,
	.monaco-editor.vs-dark .find-widget {
		border: 1px solid windowtext;
	}

	/* list - used by suggest widget */
	.monaco-editor.vs .monaco-list .monaco-list-row,
	.monaco-editor.vs-dark .monaco-list .monaco-list-row {
		-ms-high-contrast-adjust: none;
		color: windowtext !important;
	}
	.monaco-editor.vs .monaco-list .monaco-list-row.focused,
	.monaco-editor.vs-dark .monaco-list .monaco-list-row.focused {
		color: highlighttext !important;
		background-color: highlight !important;
	}
	.monaco-editor.vs .monaco-list .monaco-list-row:hover,
	.monaco-editor.vs-dark .monaco-list .monaco-list-row:hover {
		background: transparent !important;
		border: 1px solid highlight;
		box-sizing: border-box;
	}

	/* scrollbars */
	.monaco-editor.vs .monaco-scrollable-element > .scrollbar,
	.monaco-editor.vs-dark .monaco-scrollable-element > .scrollbar {
		-ms-high-contrast-adjust: none;
		background: background !important;
		border: 1px solid windowtext;
		box-sizing: border-box;
	}
	.monaco-editor.vs .monaco-scrollable-element > .scrollbar > .slider,
	.monaco-editor.vs-dark .monaco-scrollable-element > .scrollbar > .slider {
		background: windowtext !important;
	}
	.monaco-editor.vs .monaco-scrollable-element > .scrollbar > .slider:hover,
	.monaco-editor.vs-dark .monaco-scrollable-element > .scrollbar > .slider:hover {
		background: highlight !important;
	}
	.monaco-editor.vs .monaco-scrollable-element > .scrollbar > .slider.active,
	.monaco-editor.vs-dark .monaco-scrollable-element > .scrollbar > .slider.active {
		background: highlight !important;
	}

	/* overview ruler */
	.monaco-editor.vs .decorationsOverviewRuler,
	.monaco-editor.vs-dark .decorationsOverviewRuler {
		opacity: 0;
	}

	/* minimap */
	.monaco-editor.vs .minimap,
	.monaco-editor.vs-dark .minimap {
		display: none;
	}

	/* squiggles */
	.monaco-editor.vs .squiggly-d-error,
	.monaco-editor.vs-dark .squiggly-d-error {
		background: transparent !important;
		border-bottom: 4px double #E47777;
	}
	.monaco-editor.vs .squiggly-c-warning,
	.monaco-editor.vs-dark .squiggly-c-warning {
		border-bottom: 4px double #71B771;
	}
	.monaco-editor.vs .squiggly-b-info,
	.monaco-editor.vs-dark .squiggly-b-info {
		border-bottom: 4px double #71B771;
	}
	.monaco-editor.vs .squiggly-a-hint,
	.monaco-editor.vs-dark .squiggly-a-hint {
		border-bottom: 4px double #6c6c6c;
	}

	/* contextmenu */
	.monaco-editor.vs .monaco-menu .monaco-action-bar.vertical .action-menu-item:focus .action-label,
	.monaco-editor.vs-dark .monaco-menu .monaco-action-bar.vertical .action-menu-item:focus .action-label {
		-ms-high-contrast-adjust: none;
		color: highlighttext !important;
		background-color: highlight !important;
	}
	.monaco-editor.vs .monaco-menu .monaco-action-bar.vertical .action-menu-item:hover .action-label,
	.monaco-editor.vs-dark .monaco-menu .monaco-action-bar.vertical .action-menu-item:hover .action-label {
		-ms-high-contrast-adjust: none;
		background: transparent !important;
		border: 1px solid highlight;
		box-sizing: border-box;
	}

	/* diff editor */
	.monaco-diff-editor.vs .diffOverviewRuler,
	.monaco-diff-editor.vs-dark .diffOverviewRuler {
		display: none;
	}
	.monaco-editor.vs .line-insert,
	.monaco-editor.vs-dark .line-insert,
	.monaco-editor.vs .line-delete,
	.monaco-editor.vs-dark .line-delete {
		background: transparent !important;
		border: 1px solid highlight !important;
		box-sizing: border-box;
	}
	.monaco-editor.vs .char-insert,
	.monaco-editor.vs-dark .char-insert,
	.monaco-editor.vs .char-delete,
	.monaco-editor.vs-dark .char-delete {
		background: transparent !important;
	}
}

/*.monaco-editor.vs [tabindex="0"]:focus {
	outline: 1px solid rgba(0, 122, 204, 0.4);
	outline-offset: -1px;
	opacity: 1 !important;
}

.monaco-editor.vs-dark [tabindex="0"]:focus {
	outline: 1px solid rgba(14, 99, 156, 0.6);
	outline-offset: -1px;
	opacity: 1 !important;
}*/
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/
/* ---------- DiffEditor ---------- */

.monaco-diff-editor .diffOverview {
	z-index: 9;
}

.monaco-diff-editor .diffOverview .diffViewport {
	z-index: 10;
}

/* colors not externalized: using transparancy on background */
.monaco-diff-editor.vs			.diffOverview { background: rgba(0, 0, 0, 0.03); }
.monaco-diff-editor.vs-dark		.diffOverview { background: rgba(255, 255, 255, 0.01); }

.monaco-scrollable-element.modified-in-monaco-diff-editor.vs		.scrollbar { background: rgba(0,0,0,0); }
.monaco-scrollable-element.modified-in-monaco-diff-editor.vs-dark	.scrollbar { background: rgba(0,0,0,0); }
.monaco-scrollable-element.modified-in-monaco-diff-editor.hc-black	.scrollbar { background: none; }

.monaco-scrollable-element.modified-in-monaco-diff-editor .slider {
	z-index: 10;
}
.modified-in-monaco-diff-editor				.slider.active { background: rgba(171, 171, 171, .4); }
.modified-in-monaco-diff-editor.hc-black	.slider.active { background: none; }

/* ---------- Diff ---------- */

.monaco-editor .insert-sign,
.monaco-diff-editor .insert-sign,
.monaco-editor .delete-sign,
.monaco-diff-editor .delete-sign {
	font-size: 11px !important;
	opacity: 0.7 !important;
	display: flex !important;
	align-items: center;
}
.monaco-editor.hc-black .insert-sign,
.monaco-diff-editor.hc-black .insert-sign,
.monaco-editor.hc-black .delete-sign,
.monaco-diff-editor.hc-black .delete-sign {
	opacity: 1;
}

.monaco-editor .inline-deleted-margin-view-zone {
	text-align: right;
}
.monaco-editor .inline-added-margin-view-zone {
	text-align: right;
}

/* ---------- Inline Diff ---------- */

.monaco-editor .view-zones .view-lines .view-line span {
	display: inline-block;
}

.monaco-editor .margin-view-zones .lightbulb-glyph:hover {
	cursor: pointer;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-diff-editor .diff-review-line-number {
	text-align: right;
	display: inline-block;
}

.monaco-diff-editor .diff-review {
	position: absolute;
	user-select: none;
	-webkit-user-select: none;
	-ms-user-select: none;
}

.monaco-diff-editor .diff-review-summary {
	padding-left: 10px;
}

.monaco-diff-editor .diff-review-shadow {
	position: absolute;
}

.monaco-diff-editor .diff-review-row {
	white-space: pre;
}

.monaco-diff-editor .diff-review-table {
	display: table;
	min-width: 100%;
}

.monaco-diff-editor .diff-review-row {
	display: table-row;
	width: 100%;
}

.monaco-diff-editor .diff-review-spacer {
	display: inline-block;
	width: 10px;
	vertical-align: middle;
}

.monaco-diff-editor .diff-review-spacer > .codicon {
	font-size: 9px !important;
}

.monaco-diff-editor .diff-review-actions {
	display: inline-block;
	position: absolute;
	right: 10px;
	top: 2px;
}

.monaco-diff-editor .diff-review-actions .action-label {
	width: 16px;
	height: 16px;
	margin: 2px 0;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.context-view {
	position: absolute;
	z-index: 2500;
}

.context-view.fixed {
	all: initial;
	font-family: inherit;
	font-size: 13px;
	position: fixed;
	z-index: 2500;
	color: inherit;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.context-view .monaco-menu {
	min-width: 130px;
}

</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.quick-input-widget {
	font-size: 13px;
}

.quick-input-widget .monaco-highlighted-label .highlight,
.quick-input-widget .monaco-highlighted-label .highlight {
	color: #0066BF;
}

.vs .quick-input-widget .monaco-list-row.focused .monaco-highlighted-label .highlight,
.vs .quick-input-widget .monaco-list-row.focused .monaco-highlighted-label .highlight {
	color: #9DDDFF;
}

.vs-dark .quick-input-widget .monaco-highlighted-label .highlight,
.vs-dark .quick-input-widget .monaco-highlighted-label .highlight {
	color: #0097fb;
}

.hc-black .quick-input-widget .monaco-highlighted-label .highlight,
.hc-black .quick-input-widget .monaco-highlighted-label .highlight {
	color: #F38518;
}

.monaco-keybinding > .monaco-keybinding-key {
	background-color: rgba(221, 221, 221, 0.4);
	border: solid 1px rgba(204, 204, 204, 0.4);
	border-bottom-color: rgba(187, 187, 187, 0.4);
	box-shadow: inset 0 -1px 0 rgba(187, 187, 187, 0.4);
	color: #555;
}

.hc-black .monaco-keybinding > .monaco-keybinding-key {
	background-color: transparent;
	border: solid 1px rgb(111, 195, 223);
	box-shadow: none;
	color: #fff;
}

.vs-dark .monaco-keybinding > .monaco-keybinding-key {
	background-color: rgba(128, 128, 128, 0.17);
	border: solid 1px rgba(51, 51, 51, 0.6);
	border-bottom-color: rgba(68, 68, 68, 0.6);
	box-shadow: inset 0 -1px 0 rgba(68, 68, 68, 0.6);
	color: #ccc;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-text-button {
	box-sizing: border-box;
	display: flex;
	width: 100%;
	padding: 4px;
	text-align: center;
	cursor: pointer;
	justify-content: center;
	align-items: center;
}

.monaco-text-button:focus {
	outline-offset: 2px !important;
}

.monaco-text-button:hover {
	text-decoration: none !important;
}

.monaco-button.disabled:focus,
.monaco-button.disabled {
	opacity: 0.4 !important;
	cursor: default;
}

.monaco-text-button > .codicon {
	margin: 0 0.2em;
	color: inherit !important;
}

.monaco-button-dropdown {
	display: flex;
	cursor: pointer;
}

.monaco-button-dropdown > .monaco-dropdown-button {
	margin-left: 1px;
}

.monaco-description-button {
	flex-direction: column;
}

.monaco-description-button .monaco-button-label {
	font-weight: 500;
}

.monaco-description-button .monaco-button-description {
	font-style: italic;
}

.monaco-description-button .monaco-button-label,
.monaco-description-button .monaco-button-description
{
	display: flex;
	justify-content: center;
	align-items: center;
}

.monaco-description-button .monaco-button-label > .codicon,
.monaco-description-button .monaco-button-description > .codicon
{
	margin: 0 0.2em;
	color: inherit !important;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-progress-container {
	width: 100%;
	height: 5px;
	overflow: hidden; /* keep progress bit in bounds */
}

.monaco-progress-container .progress-bit {
	width: 2%;
	height: 5px;
	position: absolute;
	left: 0;
	display: none;
}

.monaco-progress-container.active .progress-bit {
	display: inherit;
}

.monaco-progress-container.discrete .progress-bit {
	left: 0;
	transition: width 100ms linear;
}

.monaco-progress-container.discrete.done .progress-bit {
	width: 100%;
}

.monaco-progress-container.infinite .progress-bit {
	animation-name: progress;
	animation-duration: 4s;
	animation-iteration-count: infinite;
	transform: translate3d(0px, 0px, 0px);
	animation-timing-function: linear;
}

.monaco-progress-container.infinite.infinite-long-running .progress-bit {
	/*
		The more smooth `linear` timing function can cause
		higher GPU consumption as indicated in
		https://github.com/microsoft/vscode/issues/97900 &
		https://github.com/microsoft/vscode/issues/138396
	*/
	animation-timing-function: steps(100);
}

/**
 * The progress bit has a width: 2% (1/50) of the parent container. The animation moves it from 0% to 100% of
 * that container. Since translateX is relative to the progress bit size, we have to multiple it with
 * its relative size to the parent container:
 * parent width: 5000%
 *    bit width: 100%
 * translateX should be as follow:
 *  50%: 5000% * 50% - 50% (set to center) = 2450%
 * 100%: 5000% * 100% - 100% (do not overflow) = 4900%
 */
@keyframes progress { from { transform: translateX(0%) scaleX(1) } 50% { transform: translateX(2500%) scaleX(3) } to { transform: translateX(4900%) scaleX(1) } }
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.quick-input-widget {
	position: absolute;
	width: 600px;
	z-index: 2000;
	padding: 0 1px 1px 1px;
	left: 50%;
	margin-left: -300px;
}

.quick-input-titlebar {
	display: flex;
	align-items: center;
}

.quick-input-left-action-bar {
	display: flex;
	margin-left: 4px;
	flex: 1;
}

.quick-input-title {
	padding: 3px 0px;
	text-align: center;
	text-overflow: ellipsis;
	overflow: hidden;
}

.quick-input-right-action-bar {
	display: flex;
	margin-right: 4px;
	flex: 1;
}

.quick-input-right-action-bar > .actions-container {
	justify-content: flex-end;
}

.quick-input-titlebar .monaco-action-bar .action-label.codicon {
	background-position: center;
	background-repeat: no-repeat;
	padding: 2px;
}

.quick-input-description {
	margin: 6px;
}

.quick-input-header .quick-input-description {
	margin: 4px 2px;
}

.quick-input-header {
	display: flex;
	padding: 6px 6px 0px 6px;
	margin-bottom: -2px;
}

.quick-input-widget.hidden-input .quick-input-header {
	/* reduce margins and paddings when input box hidden */
	padding: 0;
	margin-bottom: 0;
}

.quick-input-and-message {
	display: flex;
	flex-direction: column;
	flex-grow: 1;
	min-width: 0;
	position: relative;
}

.quick-input-check-all {
	align-self: center;
	margin: 0;
}

.quick-input-filter {
	flex-grow: 1;
	display: flex;
	position: relative;
}

.quick-input-box {
	flex-grow: 1;
}

.quick-input-widget.show-checkboxes .quick-input-box,
.quick-input-widget.show-checkboxes .quick-input-message {
	margin-left: 5px;
}

.quick-input-visible-count {
	position: absolute;
	left: -10000px;
}

.quick-input-count {
	align-self: center;
	position: absolute;
	right: 4px;
	display: flex;
	align-items: center;
}

.quick-input-count .monaco-count-badge {
	vertical-align: middle;
	padding: 2px 4px;
	border-radius: 2px;
	min-height: auto;
	line-height: normal;
}

.quick-input-action {
	margin-left: 6px;
}

.quick-input-action .monaco-text-button {
	font-size: 11px;
	padding: 0 6px;
	display: flex;
	height: 27.5px;
	align-items: center;
}

.quick-input-message {
	margin-top: -1px;
	padding: 5px;
	overflow-wrap: break-word;
}

.quick-input-message > .codicon {
	margin: 0 0.2em;
	vertical-align: text-bottom;
}

.quick-input-progress.monaco-progress-container {
	position: relative;
}

.quick-input-progress.monaco-progress-container,
.quick-input-progress.monaco-progress-container .progress-bit {
	height: 2px;
}

.quick-input-list {
	line-height: 22px;
	margin-top: 6px;
}

.quick-input-widget.hidden-input .quick-input-list {
	margin-top: 0; /* reduce margins when input box hidden */
}

.quick-input-list .monaco-list {
	overflow: hidden;
	max-height: calc(20 * 22px);
}

.quick-input-list .quick-input-list-entry {
	box-sizing: border-box;
	overflow: hidden;
	display: flex;
	height: 100%;
	padding: 0 6px;
}

.quick-input-list .quick-input-list-entry.quick-input-list-separator-border {
	border-top-width: 1px;
	border-top-style: solid;
}

.quick-input-list .monaco-list-row[data-index="0"] .quick-input-list-entry.quick-input-list-separator-border {
	border-top-style: none;
}

.quick-input-list .quick-input-list-label {
	overflow: hidden;
	display: flex;
	height: 100%;
	flex: 1;
}

.quick-input-list .quick-input-list-checkbox {
	align-self: center;
	margin: 0;
}

.quick-input-list .quick-input-list-rows {
	overflow: hidden;
	text-overflow: ellipsis;
	display: flex;
	flex-direction: column;
	height: 100%;
	flex: 1;
	margin-left: 5px;
}

.quick-input-widget.show-checkboxes .quick-input-list .quick-input-list-rows {
	margin-left: 10px;
}

.quick-input-widget .quick-input-list .quick-input-list-checkbox {
	display: none;
}
.quick-input-widget.show-checkboxes .quick-input-list .quick-input-list-checkbox {
	display: inline;
}

.quick-input-list .quick-input-list-rows > .quick-input-list-row {
	display: flex;
	align-items: center;
}

.quick-input-list .quick-input-list-rows > .quick-input-list-row .monaco-icon-label,
.quick-input-list .quick-input-list-rows > .quick-input-list-row .monaco-icon-label .monaco-icon-label-container > .monaco-icon-name-container {
	flex: 1; /* make sure the icon label grows within the row */
}

.quick-input-list .quick-input-list-rows > .quick-input-list-row .codicon[class*='codicon-'] {
	vertical-align: text-bottom;
}

.quick-input-list .quick-input-list-rows .monaco-highlighted-label span {
	opacity: 1;
}

.quick-input-list .quick-input-list-entry .quick-input-list-entry-keybinding {
	margin-right: 8px; /* separate from the separator label or scrollbar if any */
}

.quick-input-list .quick-input-list-label-meta {
	opacity: 0.7;
	line-height: normal;
	text-overflow: ellipsis;
	overflow: hidden;
}

.quick-input-list .monaco-highlighted-label .highlight {
	font-weight: bold;
}

.quick-input-list .quick-input-list-entry .quick-input-list-separator {
	margin-right: 8px; /* separate from keybindings or actions */
}

.quick-input-list .quick-input-list-entry-action-bar {
	display: flex;
	flex: 0;
	overflow: visible;
}

.quick-input-list .quick-input-list-entry-action-bar .action-label {
	/*
	 * By default, actions in the quick input action bar are hidden
	 * until hovered over them or selected.
	 */
	display: none;
}

.quick-input-list .quick-input-list-entry-action-bar .action-label.codicon {
	margin-right: 4px;
	padding: 0px 2px 2px 2px;
}

.quick-input-list .quick-input-list-entry-action-bar {
	margin-top: 1px;
}

.quick-input-list .quick-input-list-entry-action-bar {
	margin-right: 4px; /* separate from scrollbar */
}

.quick-input-list .quick-input-list-entry .quick-input-list-entry-action-bar .action-label.always-visible,
.quick-input-list .quick-input-list-entry:hover .quick-input-list-entry-action-bar .action-label,
.quick-input-list .monaco-list-row.focused .quick-input-list-entry-action-bar .action-label {
	display: flex;
}

/* focused items in quick pick */
.quick-input-list .monaco-list-row.focused .monaco-keybinding-key,
.quick-input-list .monaco-list-row.focused .quick-input-list-entry .quick-input-list-separator {
	color: inherit
}
.quick-input-list .monaco-list-row.focused .monaco-keybinding-key {
	background: none;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-keybinding {
	display: flex;
	align-items: center;
	line-height: 10px;
}

.monaco-keybinding > .monaco-keybinding-key {
	display: inline-block;
	border-style: solid;
	border-width: 1px;
	border-radius: 3px;
	vertical-align: middle;
	font-size: 11px;
	padding: 3px 5px;
	margin: 0 2px;
}

.monaco-keybinding > .monaco-keybinding-key:first-child {
	margin-left: 0;
}

.monaco-keybinding > .monaco-keybinding-key:last-child {
	margin-right: 0;
}

.monaco-keybinding > .monaco-keybinding-key-separator {
	display: inline-block;
}

.monaco-keybinding > .monaco-keybinding-key-chord-separator {
	width: 6px;
}
</style><style data-emotion="css-global" data-s=""></style><style data-emotion="css" data-s=""></style><style id="__monaco_theme_color__">
.mtk1 { color: #d4d4d4; }
.mtk2 { color: #282828; }
.mtk3 { color: #6a9955; }
.mtk4 { color: #569cd6; }
.mtk5 { color: #d16969; }
.mtk6 { color: #d7ba7d; }
.mtk7 { color: #b5cea8; }
.mtk8 { color: #ce9178; }
.mtk9 { color: #646695; }
.mtk10 { color: #4ec9b0; }
.mtk11 { color: #dcdcaa; }
.mtk12 { color: #c8c8c8; }
.mtk13 { color: #c586c0; }
.mtk14 { color: #9cdcfe; }
.mtk15 { color: #000080; }
.mtk16 { color: #f44747; }
.mtk17 { color: #6796e6; }
.mtk18 { color: #808080; }
.mtk19 { color: #4fc1ff; }
.mtki { font-style: italic; }
.mtkb { font-weight: bold; }
.mtku { text-decoration: underline; text-underline-position: under; }
.mtks { text-decoration: line-through; }
.mtks.mtku { text-decoration: underline line-through; text-underline-position: under; }</style><style type="text/css" media="screen" class="monaco-colors">.codicon-add:before { content: '\ea60'; }
.codicon-plus:before { content: '\ea60'; }
.codicon-gist-new:before { content: '\ea60'; }
.codicon-repo-create:before { content: '\ea60'; }
.codicon-lightbulb:before { content: '\ea61'; }
.codicon-light-bulb:before { content: '\ea61'; }
.codicon-repo:before { content: '\ea62'; }
.codicon-repo-delete:before { content: '\ea62'; }
.codicon-gist-fork:before { content: '\ea63'; }
.codicon-repo-forked:before { content: '\ea63'; }
.codicon-git-pull-request:before { content: '\ea64'; }
.codicon-git-pull-request-abandoned:before { content: '\ea64'; }
.codicon-record-keys:before { content: '\ea65'; }
.codicon-keyboard:before { content: '\ea65'; }
.codicon-tag:before { content: '\ea66'; }
.codicon-tag-add:before { content: '\ea66'; }
.codicon-tag-remove:before { content: '\ea66'; }
.codicon-person:before { content: '\ea67'; }
.codicon-person-follow:before { content: '\ea67'; }
.codicon-person-outline:before { content: '\ea67'; }
.codicon-person-filled:before { content: '\ea67'; }
.codicon-git-branch:before { content: '\ea68'; }
.codicon-git-branch-create:before { content: '\ea68'; }
.codicon-git-branch-delete:before { content: '\ea68'; }
.codicon-source-control:before { content: '\ea68'; }
.codicon-mirror:before { content: '\ea69'; }
.codicon-mirror-public:before { content: '\ea69'; }
.codicon-star:before { content: '\ea6a'; }
.codicon-star-add:before { content: '\ea6a'; }
.codicon-star-delete:before { content: '\ea6a'; }
.codicon-star-empty:before { content: '\ea6a'; }
.codicon-comment:before { content: '\ea6b'; }
.codicon-comment-add:before { content: '\ea6b'; }
.codicon-alert:before { content: '\ea6c'; }
.codicon-warning:before { content: '\ea6c'; }
.codicon-search:before { content: '\ea6d'; }
.codicon-search-save:before { content: '\ea6d'; }
.codicon-log-out:before { content: '\ea6e'; }
.codicon-sign-out:before { content: '\ea6e'; }
.codicon-log-in:before { content: '\ea6f'; }
.codicon-sign-in:before { content: '\ea6f'; }
.codicon-eye:before { content: '\ea70'; }
.codicon-eye-unwatch:before { content: '\ea70'; }
.codicon-eye-watch:before { content: '\ea70'; }
.codicon-circle-filled:before { content: '\ea71'; }
.codicon-primitive-dot:before { content: '\ea71'; }
.codicon-close-dirty:before { content: '\ea71'; }
.codicon-debug-breakpoint:before { content: '\ea71'; }
.codicon-debug-breakpoint-disabled:before { content: '\ea71'; }
.codicon-debug-hint:before { content: '\ea71'; }
.codicon-primitive-square:before { content: '\ea72'; }
.codicon-edit:before { content: '\ea73'; }
.codicon-pencil:before { content: '\ea73'; }
.codicon-info:before { content: '\ea74'; }
.codicon-issue-opened:before { content: '\ea74'; }
.codicon-gist-private:before { content: '\ea75'; }
.codicon-git-fork-private:before { content: '\ea75'; }
.codicon-lock:before { content: '\ea75'; }
.codicon-mirror-private:before { content: '\ea75'; }
.codicon-close:before { content: '\ea76'; }
.codicon-remove-close:before { content: '\ea76'; }
.codicon-x:before { content: '\ea76'; }
.codicon-repo-sync:before { content: '\ea77'; }
.codicon-sync:before { content: '\ea77'; }
.codicon-clone:before { content: '\ea78'; }
.codicon-desktop-download:before { content: '\ea78'; }
.codicon-beaker:before { content: '\ea79'; }
.codicon-microscope:before { content: '\ea79'; }
.codicon-vm:before { content: '\ea7a'; }
.codicon-device-desktop:before { content: '\ea7a'; }
.codicon-file:before { content: '\ea7b'; }
.codicon-file-text:before { content: '\ea7b'; }
.codicon-more:before { content: '\ea7c'; }
.codicon-ellipsis:before { content: '\ea7c'; }
.codicon-kebab-horizontal:before { content: '\ea7c'; }
.codicon-mail-reply:before { content: '\ea7d'; }
.codicon-reply:before { content: '\ea7d'; }
.codicon-organization:before { content: '\ea7e'; }
.codicon-organization-filled:before { content: '\ea7e'; }
.codicon-organization-outline:before { content: '\ea7e'; }
.codicon-new-file:before { content: '\ea7f'; }
.codicon-file-add:before { content: '\ea7f'; }
.codicon-new-folder:before { content: '\ea80'; }
.codicon-file-directory-create:before { content: '\ea80'; }
.codicon-trash:before { content: '\ea81'; }
.codicon-trashcan:before { content: '\ea81'; }
.codicon-history:before { content: '\ea82'; }
.codicon-clock:before { content: '\ea82'; }
.codicon-folder:before { content: '\ea83'; }
.codicon-file-directory:before { content: '\ea83'; }
.codicon-symbol-folder:before { content: '\ea83'; }
.codicon-logo-github:before { content: '\ea84'; }
.codicon-mark-github:before { content: '\ea84'; }
.codicon-github:before { content: '\ea84'; }
.codicon-terminal:before { content: '\ea85'; }
.codicon-console:before { content: '\ea85'; }
.codicon-repl:before { content: '\ea85'; }
.codicon-zap:before { content: '\ea86'; }
.codicon-symbol-event:before { content: '\ea86'; }
.codicon-error:before { content: '\ea87'; }
.codicon-stop:before { content: '\ea87'; }
.codicon-variable:before { content: '\ea88'; }
.codicon-symbol-variable:before { content: '\ea88'; }
.codicon-array:before { content: '\ea8a'; }
.codicon-symbol-array:before { content: '\ea8a'; }
.codicon-symbol-module:before { content: '\ea8b'; }
.codicon-symbol-package:before { content: '\ea8b'; }
.codicon-symbol-namespace:before { content: '\ea8b'; }
.codicon-symbol-object:before { content: '\ea8b'; }
.codicon-symbol-method:before { content: '\ea8c'; }
.codicon-symbol-function:before { content: '\ea8c'; }
.codicon-symbol-constructor:before { content: '\ea8c'; }
.codicon-symbol-boolean:before { content: '\ea8f'; }
.codicon-symbol-null:before { content: '\ea8f'; }
.codicon-symbol-numeric:before { content: '\ea90'; }
.codicon-symbol-number:before { content: '\ea90'; }
.codicon-symbol-structure:before { content: '\ea91'; }
.codicon-symbol-struct:before { content: '\ea91'; }
.codicon-symbol-parameter:before { content: '\ea92'; }
.codicon-symbol-type-parameter:before { content: '\ea92'; }
.codicon-symbol-key:before { content: '\ea93'; }
.codicon-symbol-text:before { content: '\ea93'; }
.codicon-symbol-reference:before { content: '\ea94'; }
.codicon-go-to-file:before { content: '\ea94'; }
.codicon-symbol-enum:before { content: '\ea95'; }
.codicon-symbol-value:before { content: '\ea95'; }
.codicon-symbol-ruler:before { content: '\ea96'; }
.codicon-symbol-unit:before { content: '\ea96'; }
.codicon-activate-breakpoints:before { content: '\ea97'; }
.codicon-archive:before { content: '\ea98'; }
.codicon-arrow-both:before { content: '\ea99'; }
.codicon-arrow-down:before { content: '\ea9a'; }
.codicon-arrow-left:before { content: '\ea9b'; }
.codicon-arrow-right:before { content: '\ea9c'; }
.codicon-arrow-small-down:before { content: '\ea9d'; }
.codicon-arrow-small-left:before { content: '\ea9e'; }
.codicon-arrow-small-right:before { content: '\ea9f'; }
.codicon-arrow-small-up:before { content: '\eaa0'; }
.codicon-arrow-up:before { content: '\eaa1'; }
.codicon-bell:before { content: '\eaa2'; }
.codicon-bold:before { content: '\eaa3'; }
.codicon-book:before { content: '\eaa4'; }
.codicon-bookmark:before { content: '\eaa5'; }
.codicon-debug-breakpoint-conditional-unverified:before { content: '\eaa6'; }
.codicon-debug-breakpoint-conditional:before { content: '\eaa7'; }
.codicon-debug-breakpoint-conditional-disabled:before { content: '\eaa7'; }
.codicon-debug-breakpoint-data-unverified:before { content: '\eaa8'; }
.codicon-debug-breakpoint-data:before { content: '\eaa9'; }
.codicon-debug-breakpoint-data-disabled:before { content: '\eaa9'; }
.codicon-debug-breakpoint-log-unverified:before { content: '\eaaa'; }
.codicon-debug-breakpoint-log:before { content: '\eaab'; }
.codicon-debug-breakpoint-log-disabled:before { content: '\eaab'; }
.codicon-briefcase:before { content: '\eaac'; }
.codicon-broadcast:before { content: '\eaad'; }
.codicon-browser:before { content: '\eaae'; }
.codicon-bug:before { content: '\eaaf'; }
.codicon-calendar:before { content: '\eab0'; }
.codicon-case-sensitive:before { content: '\eab1'; }
.codicon-check:before { content: '\eab2'; }
.codicon-checklist:before { content: '\eab3'; }
.codicon-chevron-down:before { content: '\eab4'; }
.codicon-drop-down-button:before { content: '\eab4'; }
.codicon-chevron-left:before { content: '\eab5'; }
.codicon-chevron-right:before { content: '\eab6'; }
.codicon-chevron-up:before { content: '\eab7'; }
.codicon-chrome-close:before { content: '\eab8'; }
.codicon-chrome-maximize:before { content: '\eab9'; }
.codicon-chrome-minimize:before { content: '\eaba'; }
.codicon-chrome-restore:before { content: '\eabb'; }
.codicon-circle-outline:before { content: '\eabc'; }
.codicon-debug-breakpoint-unverified:before { content: '\eabc'; }
.codicon-circle-slash:before { content: '\eabd'; }
.codicon-circuit-board:before { content: '\eabe'; }
.codicon-clear-all:before { content: '\eabf'; }
.codicon-clippy:before { content: '\eac0'; }
.codicon-close-all:before { content: '\eac1'; }
.codicon-cloud-download:before { content: '\eac2'; }
.codicon-cloud-upload:before { content: '\eac3'; }
.codicon-code:before { content: '\eac4'; }
.codicon-collapse-all:before { content: '\eac5'; }
.codicon-color-mode:before { content: '\eac6'; }
.codicon-comment-discussion:before { content: '\eac7'; }
.codicon-compare-changes:before { content: '\eafd'; }
.codicon-credit-card:before { content: '\eac9'; }
.codicon-dash:before { content: '\eacc'; }
.codicon-dashboard:before { content: '\eacd'; }
.codicon-database:before { content: '\eace'; }
.codicon-debug-continue:before { content: '\eacf'; }
.codicon-debug-disconnect:before { content: '\ead0'; }
.codicon-debug-pause:before { content: '\ead1'; }
.codicon-debug-restart:before { content: '\ead2'; }
.codicon-debug-start:before { content: '\ead3'; }
.codicon-debug-step-into:before { content: '\ead4'; }
.codicon-debug-step-out:before { content: '\ead5'; }
.codicon-debug-step-over:before { content: '\ead6'; }
.codicon-debug-stop:before { content: '\ead7'; }
.codicon-debug:before { content: '\ead8'; }
.codicon-device-camera-video:before { content: '\ead9'; }
.codicon-device-camera:before { content: '\eada'; }
.codicon-device-mobile:before { content: '\eadb'; }
.codicon-diff-added:before { content: '\eadc'; }
.codicon-diff-ignored:before { content: '\eadd'; }
.codicon-diff-modified:before { content: '\eade'; }
.codicon-diff-removed:before { content: '\eadf'; }
.codicon-diff-renamed:before { content: '\eae0'; }
.codicon-diff:before { content: '\eae1'; }
.codicon-discard:before { content: '\eae2'; }
.codicon-editor-layout:before { content: '\eae3'; }
.codicon-empty-window:before { content: '\eae4'; }
.codicon-exclude:before { content: '\eae5'; }
.codicon-extensions:before { content: '\eae6'; }
.codicon-eye-closed:before { content: '\eae7'; }
.codicon-file-binary:before { content: '\eae8'; }
.codicon-file-code:before { content: '\eae9'; }
.codicon-file-media:before { content: '\eaea'; }
.codicon-file-pdf:before { content: '\eaeb'; }
.codicon-file-submodule:before { content: '\eaec'; }
.codicon-file-symlink-directory:before { content: '\eaed'; }
.codicon-file-symlink-file:before { content: '\eaee'; }
.codicon-file-zip:before { content: '\eaef'; }
.codicon-files:before { content: '\eaf0'; }
.codicon-filter:before { content: '\eaf1'; }
.codicon-flame:before { content: '\eaf2'; }
.codicon-fold-down:before { content: '\eaf3'; }
.codicon-fold-up:before { content: '\eaf4'; }
.codicon-fold:before { content: '\eaf5'; }
.codicon-folder-active:before { content: '\eaf6'; }
.codicon-folder-opened:before { content: '\eaf7'; }
.codicon-gear:before { content: '\eaf8'; }
.codicon-gift:before { content: '\eaf9'; }
.codicon-gist-secret:before { content: '\eafa'; }
.codicon-gist:before { content: '\eafb'; }
.codicon-git-commit:before { content: '\eafc'; }
.codicon-git-compare:before { content: '\eafd'; }
.codicon-git-merge:before { content: '\eafe'; }
.codicon-github-action:before { content: '\eaff'; }
.codicon-github-alt:before { content: '\eb00'; }
.codicon-globe:before { content: '\eb01'; }
.codicon-grabber:before { content: '\eb02'; }
.codicon-graph:before { content: '\eb03'; }
.codicon-gripper:before { content: '\eb04'; }
.codicon-heart:before { content: '\eb05'; }
.codicon-home:before { content: '\eb06'; }
.codicon-horizontal-rule:before { content: '\eb07'; }
.codicon-hubot:before { content: '\eb08'; }
.codicon-inbox:before { content: '\eb09'; }
.codicon-issue-closed:before { content: '\eba4'; }
.codicon-issue-reopened:before { content: '\eb0b'; }
.codicon-issues:before { content: '\eb0c'; }
.codicon-italic:before { content: '\eb0d'; }
.codicon-jersey:before { content: '\eb0e'; }
.codicon-json:before { content: '\eb0f'; }
.codicon-kebab-vertical:before { content: '\eb10'; }
.codicon-key:before { content: '\eb11'; }
.codicon-law:before { content: '\eb12'; }
.codicon-lightbulb-autofix:before { content: '\eb13'; }
.codicon-link-external:before { content: '\eb14'; }
.codicon-link:before { content: '\eb15'; }
.codicon-list-ordered:before { content: '\eb16'; }
.codicon-list-unordered:before { content: '\eb17'; }
.codicon-live-share:before { content: '\eb18'; }
.codicon-loading:before { content: '\eb19'; }
.codicon-location:before { content: '\eb1a'; }
.codicon-mail-read:before { content: '\eb1b'; }
.codicon-mail:before { content: '\eb1c'; }
.codicon-markdown:before { content: '\eb1d'; }
.codicon-megaphone:before { content: '\eb1e'; }
.codicon-mention:before { content: '\eb1f'; }
.codicon-milestone:before { content: '\eb20'; }
.codicon-mortar-board:before { content: '\eb21'; }
.codicon-move:before { content: '\eb22'; }
.codicon-multiple-windows:before { content: '\eb23'; }
.codicon-mute:before { content: '\eb24'; }
.codicon-no-newline:before { content: '\eb25'; }
.codicon-note:before { content: '\eb26'; }
.codicon-octoface:before { content: '\eb27'; }
.codicon-open-preview:before { content: '\eb28'; }
.codicon-package:before { content: '\eb29'; }
.codicon-paintcan:before { content: '\eb2a'; }
.codicon-pin:before { content: '\eb2b'; }
.codicon-play:before { content: '\eb2c'; }
.codicon-run:before { content: '\eb2c'; }
.codicon-plug:before { content: '\eb2d'; }
.codicon-preserve-case:before { content: '\eb2e'; }
.codicon-preview:before { content: '\eb2f'; }
.codicon-project:before { content: '\eb30'; }
.codicon-pulse:before { content: '\eb31'; }
.codicon-question:before { content: '\eb32'; }
.codicon-quote:before { content: '\eb33'; }
.codicon-radio-tower:before { content: '\eb34'; }
.codicon-reactions:before { content: '\eb35'; }
.codicon-references:before { content: '\eb36'; }
.codicon-refresh:before { content: '\eb37'; }
.codicon-regex:before { content: '\eb38'; }
.codicon-remote-explorer:before { content: '\eb39'; }
.codicon-remote:before { content: '\eb3a'; }
.codicon-remove:before { content: '\eb3b'; }
.codicon-replace-all:before { content: '\eb3c'; }
.codicon-replace:before { content: '\eb3d'; }
.codicon-repo-clone:before { content: '\eb3e'; }
.codicon-repo-force-push:before { content: '\eb3f'; }
.codicon-repo-pull:before { content: '\eb40'; }
.codicon-repo-push:before { content: '\eb41'; }
.codicon-report:before { content: '\eb42'; }
.codicon-request-changes:before { content: '\eb43'; }
.codicon-rocket:before { content: '\eb44'; }
.codicon-root-folder-opened:before { content: '\eb45'; }
.codicon-root-folder:before { content: '\eb46'; }
.codicon-rss:before { content: '\eb47'; }
.codicon-ruby:before { content: '\eb48'; }
.codicon-save-all:before { content: '\eb49'; }
.codicon-save-as:before { content: '\eb4a'; }
.codicon-save:before { content: '\eb4b'; }
.codicon-screen-full:before { content: '\eb4c'; }
.codicon-screen-normal:before { content: '\eb4d'; }
.codicon-search-stop:before { content: '\eb4e'; }
.codicon-server:before { content: '\eb50'; }
.codicon-settings-gear:before { content: '\eb51'; }
.codicon-settings:before { content: '\eb52'; }
.codicon-shield:before { content: '\eb53'; }
.codicon-smiley:before { content: '\eb54'; }
.codicon-sort-precedence:before { content: '\eb55'; }
.codicon-split-horizontal:before { content: '\eb56'; }
.codicon-split-vertical:before { content: '\eb57'; }
.codicon-squirrel:before { content: '\eb58'; }
.codicon-star-full:before { content: '\eb59'; }
.codicon-star-half:before { content: '\eb5a'; }
.codicon-symbol-class:before { content: '\eb5b'; }
.codicon-symbol-color:before { content: '\eb5c'; }
.codicon-symbol-customcolor:before { content: '\eb5c'; }
.codicon-symbol-constant:before { content: '\eb5d'; }
.codicon-symbol-enum-member:before { content: '\eb5e'; }
.codicon-symbol-field:before { content: '\eb5f'; }
.codicon-symbol-file:before { content: '\eb60'; }
.codicon-symbol-interface:before { content: '\eb61'; }
.codicon-symbol-keyword:before { content: '\eb62'; }
.codicon-symbol-misc:before { content: '\eb63'; }
.codicon-symbol-operator:before { content: '\eb64'; }
.codicon-symbol-property:before { content: '\eb65'; }
.codicon-wrench:before { content: '\eb65'; }
.codicon-wrench-subaction:before { content: '\eb65'; }
.codicon-symbol-snippet:before { content: '\eb66'; }
.codicon-tasklist:before { content: '\eb67'; }
.codicon-telescope:before { content: '\eb68'; }
.codicon-text-size:before { content: '\eb69'; }
.codicon-three-bars:before { content: '\eb6a'; }
.codicon-thumbsdown:before { content: '\eb6b'; }
.codicon-thumbsup:before { content: '\eb6c'; }
.codicon-tools:before { content: '\eb6d'; }
.codicon-triangle-down:before { content: '\eb6e'; }
.codicon-triangle-left:before { content: '\eb6f'; }
.codicon-triangle-right:before { content: '\eb70'; }
.codicon-triangle-up:before { content: '\eb71'; }
.codicon-twitter:before { content: '\eb72'; }
.codicon-unfold:before { content: '\eb73'; }
.codicon-unlock:before { content: '\eb74'; }
.codicon-unmute:before { content: '\eb75'; }
.codicon-unverified:before { content: '\eb76'; }
.codicon-verified:before { content: '\eb77'; }
.codicon-versions:before { content: '\eb78'; }
.codicon-vm-active:before { content: '\eb79'; }
.codicon-vm-outline:before { content: '\eb7a'; }
.codicon-vm-running:before { content: '\eb7b'; }
.codicon-watch:before { content: '\eb7c'; }
.codicon-whitespace:before { content: '\eb7d'; }
.codicon-whole-word:before { content: '\eb7e'; }
.codicon-window:before { content: '\eb7f'; }
.codicon-word-wrap:before { content: '\eb80'; }
.codicon-zoom-in:before { content: '\eb81'; }
.codicon-zoom-out:before { content: '\eb82'; }
.codicon-list-filter:before { content: '\eb83'; }
.codicon-list-flat:before { content: '\eb84'; }
.codicon-list-selection:before { content: '\eb85'; }
.codicon-selection:before { content: '\eb85'; }
.codicon-list-tree:before { content: '\eb86'; }
.codicon-debug-breakpoint-function-unverified:before { content: '\eb87'; }
.codicon-debug-breakpoint-function:before { content: '\eb88'; }
.codicon-debug-breakpoint-function-disabled:before { content: '\eb88'; }
.codicon-debug-stackframe-active:before { content: '\eb89'; }
.codicon-debug-stackframe-dot:before { content: '\eb8a'; }
.codicon-debug-stackframe:before { content: '\eb8b'; }
.codicon-debug-stackframe-focused:before { content: '\eb8b'; }
.codicon-debug-breakpoint-unsupported:before { content: '\eb8c'; }
.codicon-symbol-string:before { content: '\eb8d'; }
.codicon-debug-reverse-continue:before { content: '\eb8e'; }
.codicon-debug-step-back:before { content: '\eb8f'; }
.codicon-debug-restart-frame:before { content: '\eb90'; }
.codicon-call-incoming:before { content: '\eb92'; }
.codicon-call-outgoing:before { content: '\eb93'; }
.codicon-menu:before { content: '\eb94'; }
.codicon-expand-all:before { content: '\eb95'; }
.codicon-feedback:before { content: '\eb96'; }
.codicon-group-by-ref-type:before { content: '\eb97'; }
.codicon-ungroup-by-ref-type:before { content: '\eb98'; }
.codicon-account:before { content: '\eb99'; }
.codicon-bell-dot:before { content: '\eb9a'; }
.codicon-debug-console:before { content: '\eb9b'; }
.codicon-library:before { content: '\eb9c'; }
.codicon-output:before { content: '\eb9d'; }
.codicon-run-all:before { content: '\eb9e'; }
.codicon-sync-ignored:before { content: '\eb9f'; }
.codicon-pinned:before { content: '\eba0'; }
.codicon-github-inverted:before { content: '\eba1'; }
.codicon-debug-alt:before { content: '\eb91'; }
.codicon-server-process:before { content: '\eba2'; }
.codicon-server-environment:before { content: '\eba3'; }
.codicon-pass:before { content: '\eba4'; }
.codicon-stop-circle:before { content: '\eba5'; }
.codicon-play-circle:before { content: '\eba6'; }
.codicon-record:before { content: '\eba7'; }
.codicon-debug-alt-small:before { content: '\eba8'; }
.codicon-vm-connect:before { content: '\eba9'; }
.codicon-cloud:before { content: '\ebaa'; }
.codicon-merge:before { content: '\ebab'; }
.codicon-export:before { content: '\ebac'; }
.codicon-graph-left:before { content: '\ebad'; }
.codicon-magnet:before { content: '\ebae'; }
.codicon-notebook:before { content: '\ebaf'; }
.codicon-redo:before { content: '\ebb0'; }
.codicon-check-all:before { content: '\ebb1'; }
.codicon-pinned-dirty:before { content: '\ebb2'; }
.codicon-pass-filled:before { content: '\ebb3'; }
.codicon-circle-large-filled:before { content: '\ebb4'; }
.codicon-circle-large-outline:before { content: '\ebb5'; }
.codicon-combine:before { content: '\ebb6'; }
.codicon-gather:before { content: '\ebb6'; }
.codicon-table:before { content: '\ebb7'; }
.codicon-variable-group:before { content: '\ebb8'; }
.codicon-type-hierarchy:before { content: '\ebb9'; }
.codicon-type-hierarchy-sub:before { content: '\ebba'; }
.codicon-type-hierarchy-super:before { content: '\ebbb'; }
.codicon-git-pull-request-create:before { content: '\ebbc'; }
.codicon-run-above:before { content: '\ebbd'; }
.codicon-run-below:before { content: '\ebbe'; }
.codicon-notebook-template:before { content: '\ebbf'; }
.codicon-debug-rerun:before { content: '\ebc0'; }
.codicon-workspace-trusted:before { content: '\ebc1'; }
.codicon-workspace-untrusted:before { content: '\ebc2'; }
.codicon-workspace-unspecified:before { content: '\ebc3'; }
.codicon-terminal-cmd:before { content: '\ebc4'; }
.codicon-terminal-debian:before { content: '\ebc5'; }
.codicon-terminal-linux:before { content: '\ebc6'; }
.codicon-terminal-powershell:before { content: '\ebc7'; }
.codicon-terminal-tmux:before { content: '\ebc8'; }
.codicon-terminal-ubuntu:before { content: '\ebc9'; }
.codicon-terminal-bash:before { content: '\ebca'; }
.codicon-arrow-swap:before { content: '\ebcb'; }
.codicon-copy:before { content: '\ebcc'; }
.codicon-person-add:before { content: '\ebcd'; }
.codicon-filter-filled:before { content: '\ebce'; }
.codicon-wand:before { content: '\ebcf'; }
.codicon-debug-line-by-line:before { content: '\ebd0'; }
.codicon-inspect:before { content: '\ebd1'; }
.codicon-layers:before { content: '\ebd2'; }
.codicon-layers-dot:before { content: '\ebd3'; }
.codicon-layers-active:before { content: '\ebd4'; }
.codicon-compass:before { content: '\ebd5'; }
.codicon-compass-dot:before { content: '\ebd6'; }
.codicon-compass-active:before { content: '\ebd7'; }
.codicon-azure:before { content: '\ebd8'; }
.codicon-issue-draft:before { content: '\ebd9'; }
.codicon-git-pull-request-closed:before { content: '\ebda'; }
.codicon-git-pull-request-draft:before { content: '\ebdb'; }
.codicon-debug-all:before { content: '\ebdc'; }
.codicon-debug-coverage:before { content: '\ebdd'; }
.codicon-run-errors:before { content: '\ebde'; }
.codicon-folder-library:before { content: '\ebdf'; }
.codicon-debug-continue-small:before { content: '\ebe0'; }
.codicon-beaker-stop:before { content: '\ebe1'; }
.codicon-graph-line:before { content: '\ebe2'; }
.codicon-graph-scatter:before { content: '\ebe3'; }
.codicon-pie-chart:before { content: '\ebe4'; }
.codicon-bracket:before { content: '\eb0f'; }
.codicon-bracket-dot:before { content: '\ebe5'; }
.codicon-bracket-error:before { content: '\ebe6'; }
.codicon-lock-small:before { content: '\ebe7'; }
.codicon-azure-devops:before { content: '\ebe8'; }
.codicon-verified-filled:before { content: '\ebe9'; }
.codicon-newline:before { content: '\ebea'; }
.codicon-layout:before { content: '\ebeb'; }
.codicon-layout-activitybar-left:before { content: '\ebec'; }
.codicon-layout-activitybar-right:before { content: '\ebed'; }
.codicon-layout-panel-left:before { content: '\ebee'; }
.codicon-layout-panel-center:before { content: '\ebef'; }
.codicon-layout-panel-justify:before { content: '\ebf0'; }
.codicon-layout-panel-right:before { content: '\ebf1'; }
.codicon-layout-panel:before { content: '\ebf2'; }
.codicon-layout-sidebar-left:before { content: '\ebf3'; }
.codicon-layout-sidebar-right:before { content: '\ebf4'; }
.codicon-layout-statusbar:before { content: '\ebf5'; }
.codicon-layout-menubar:before { content: '\ebf6'; }
.codicon-layout-centered:before { content: '\ebf7'; }
.codicon-target:before { content: '\ebf8'; }
.codicon-indent:before { content: '\ebf9'; }
.codicon-record-small:before { content: '\ebfa'; }
.codicon-error-small:before { content: '\ebfb'; }
.codicon-arrow-circle-down:before { content: '\ebfc'; }
.codicon-arrow-circle-left:before { content: '\ebfd'; }
.codicon-arrow-circle-right:before { content: '\ebfe'; }
.codicon-arrow-circle-up:before { content: '\ebff'; }
.codicon-dialog-error:before { content: '\ea87'; }
.codicon-dialog-warning:before { content: '\ea6c'; }
.codicon-dialog-info:before { content: '\ea74'; }
.codicon-dialog-close:before { content: '\ea76'; }
.codicon-tree-item-expanded:before { content: '\eab4'; }
.codicon-tree-filter-on-type-on:before { content: '\eb83'; }
.codicon-tree-filter-on-type-off:before { content: '\eb85'; }
.codicon-tree-filter-clear:before { content: '\ea76'; }
.codicon-tree-item-loading:before { content: '\eb19'; }
.codicon-menu-selection:before { content: '\eab2'; }
.codicon-menu-submenu:before { content: '\eab6'; }
.codicon-menubar-more:before { content: '\ea7c'; }
.codicon-scrollbar-button-left:before { content: '\eb6f'; }
.codicon-scrollbar-button-right:before { content: '\eb70'; }
.codicon-scrollbar-button-up:before { content: '\eb71'; }
.codicon-scrollbar-button-down:before { content: '\eb6e'; }
.codicon-toolbar-more:before { content: '\ea7c'; }
.codicon-quick-input-back:before { content: '\ea9b'; }
.codicon-widget-close:before { content: '\ea76'; }
.codicon-goto-previous-location:before { content: '\eaa1'; }
.codicon-goto-next-location:before { content: '\ea9a'; }
.codicon-find-selection:before { content: '\eb85'; }
.codicon-find-collapsed:before { content: '\eab6'; }
.codicon-find-expanded:before { content: '\eab4'; }
.codicon-find-replace:before { content: '\eb3d'; }
.codicon-find-replace-all:before { content: '\eb3c'; }
.codicon-find-previous-match:before { content: '\eaa1'; }
.codicon-find-next-match:before { content: '\ea9a'; }
.codicon-marker-navigation-next:before { content: '\ea9a'; }
.codicon-marker-navigation-previous:before { content: '\eaa1'; }
.codicon-parameter-hints-next:before { content: '\eab4'; }
.codicon-parameter-hints-previous:before { content: '\eab7'; }
.codicon-suggest-more-info:before { content: '\eab6'; }
.codicon-diff-review-insert:before { content: '\ea60'; }
.codicon-diff-review-remove:before { content: '\eb3b'; }
.codicon-diff-review-close:before { content: '\ea76'; }
.codicon-diff-insert:before { content: '\ea60'; }
.codicon-diff-remove:before { content: '\eb3b'; }
.monaco-editor, .monaco-editor-background, .monaco-editor .inputarea.ime-input { background-color: #282828; }
.monaco-editor, .monaco-editor .inputarea.ime-input { color: #d4d4d4; }
.monaco-editor .margin { background-color: #282828; }
.monaco-editor .rangeHighlight { background-color: rgba(255, 255, 255, 0.04); }
.monaco-editor .symbolHighlight { background-color: rgba(234, 92, 0, 0.33); }
.monaco-editor .mtkw { color: rgba(227, 228, 226, 0.16) !important; }
.monaco-editor .mtkz { color: rgba(227, 228, 226, 0.16) !important; }
.monaco-editor .line-numbers { color: #858585; }
.monaco-editor .line-numbers.active-line-number { color: #c6c6c6; }
.monaco-editor .view-overlays .current-line { border: 2px solid #282828; }
.monaco-editor .margin-view-overlays .current-line-margin { border: 2px solid #282828; }

			.monaco-scrollable-element > .shadow.top {
				box-shadow: #000000 0 6px 6px -6px inset;
			}

			.monaco-scrollable-element > .shadow.left {
				box-shadow: #000000 6px 0 6px -6px inset;
			}

			.monaco-scrollable-element > .shadow.top.left {
				box-shadow: #000000 6px 6px 6px -6px inset;
			}
		

			.monaco-scrollable-element > .scrollbar > .slider {
				background: rgba(121, 121, 121, 0.4);
			}
		

			.monaco-scrollable-element > .scrollbar > .slider:hover {
				background: rgba(100, 100, 100, 0.7);
			}
		

			.monaco-scrollable-element > .scrollbar > .slider.active {
				background: rgba(191, 191, 191, 0.4);
			}
		
.monaco-editor .lines-content .core-guide-indent { box-shadow: 1px 0 0 0 #404040 inset; }
.monaco-editor .lines-content .core-guide-indent-active { box-shadow: 1px 0 0 0 #707070 inset; }
.monaco-editor .bracket-indent-guide.lvl-0 { --guide-color: rgba(255, 215, 0, 0.3); --guide-color-active: #ffd700; }
.monaco-editor .bracket-indent-guide.lvl-1 { --guide-color: rgba(218, 112, 214, 0.3); --guide-color-active: #da70d6; }
.monaco-editor .bracket-indent-guide.lvl-2 { --guide-color: rgba(23, 159, 255, 0.3); --guide-color-active: #179fff; }
.monaco-editor .bracket-indent-guide.lvl-3 { --guide-color: rgba(255, 215, 0, 0.3); --guide-color-active: #ffd700; }
.monaco-editor .bracket-indent-guide.lvl-4 { --guide-color: rgba(218, 112, 214, 0.3); --guide-color-active: #da70d6; }
.monaco-editor .bracket-indent-guide.lvl-5 { --guide-color: rgba(23, 159, 255, 0.3); --guide-color-active: #179fff; }
.monaco-editor .bracket-indent-guide.lvl-6 { --guide-color: rgba(255, 215, 0, 0.3); --guide-color-active: #ffd700; }
.monaco-editor .bracket-indent-guide.lvl-7 { --guide-color: rgba(218, 112, 214, 0.3); --guide-color-active: #da70d6; }
.monaco-editor .bracket-indent-guide.lvl-8 { --guide-color: rgba(23, 159, 255, 0.3); --guide-color-active: #179fff; }
.monaco-editor .bracket-indent-guide.lvl-9 { --guide-color: rgba(255, 215, 0, 0.3); --guide-color-active: #ffd700; }
.monaco-editor .bracket-indent-guide.lvl-10 { --guide-color: rgba(218, 112, 214, 0.3); --guide-color-active: #da70d6; }
.monaco-editor .bracket-indent-guide.lvl-11 { --guide-color: rgba(23, 159, 255, 0.3); --guide-color-active: #179fff; }
.monaco-editor .bracket-indent-guide.lvl-12 { --guide-color: rgba(255, 215, 0, 0.3); --guide-color-active: #ffd700; }
.monaco-editor .bracket-indent-guide.lvl-13 { --guide-color: rgba(218, 112, 214, 0.3); --guide-color-active: #da70d6; }
.monaco-editor .bracket-indent-guide.lvl-14 { --guide-color: rgba(23, 159, 255, 0.3); --guide-color-active: #179fff; }
.monaco-editor .bracket-indent-guide.lvl-15 { --guide-color: rgba(255, 215, 0, 0.3); --guide-color-active: #ffd700; }
.monaco-editor .bracket-indent-guide.lvl-16 { --guide-color: rgba(218, 112, 214, 0.3); --guide-color-active: #da70d6; }
.monaco-editor .bracket-indent-guide.lvl-17 { --guide-color: rgba(23, 159, 255, 0.3); --guide-color-active: #179fff; }
.monaco-editor .bracket-indent-guide.lvl-18 { --guide-color: rgba(255, 215, 0, 0.3); --guide-color-active: #ffd700; }
.monaco-editor .bracket-indent-guide.lvl-19 { --guide-color: rgba(218, 112, 214, 0.3); --guide-color-active: #da70d6; }
.monaco-editor .bracket-indent-guide.lvl-20 { --guide-color: rgba(23, 159, 255, 0.3); --guide-color-active: #179fff; }
.monaco-editor .bracket-indent-guide.lvl-21 { --guide-color: rgba(255, 215, 0, 0.3); --guide-color-active: #ffd700; }
.monaco-editor .bracket-indent-guide.lvl-22 { --guide-color: rgba(218, 112, 214, 0.3); --guide-color-active: #da70d6; }
.monaco-editor .bracket-indent-guide.lvl-23 { --guide-color: rgba(23, 159, 255, 0.3); --guide-color-active: #179fff; }
.monaco-editor .bracket-indent-guide.lvl-24 { --guide-color: rgba(255, 215, 0, 0.3); --guide-color-active: #ffd700; }
.monaco-editor .bracket-indent-guide.lvl-25 { --guide-color: rgba(218, 112, 214, 0.3); --guide-color-active: #da70d6; }
.monaco-editor .bracket-indent-guide.lvl-26 { --guide-color: rgba(23, 159, 255, 0.3); --guide-color-active: #179fff; }
.monaco-editor .bracket-indent-guide.lvl-27 { --guide-color: rgba(255, 215, 0, 0.3); --guide-color-active: #ffd700; }
.monaco-editor .bracket-indent-guide.lvl-28 { --guide-color: rgba(218, 112, 214, 0.3); --guide-color-active: #da70d6; }
.monaco-editor .bracket-indent-guide.lvl-29 { --guide-color: rgba(23, 159, 255, 0.3); --guide-color-active: #179fff; }
.monaco-editor .vertical { box-shadow: 1px 0 0 0 var(--guide-color) inset; }
.monaco-editor .horizontal-top { border-top: 1px solid var(--guide-color); }
.monaco-editor .horizontal-bottom { border-bottom: 1px solid var(--guide-color); }
.monaco-editor .vertical.indent-active { box-shadow: 1px 0 0 0 var(--guide-color-active) inset; }
.monaco-editor .horizontal-top.indent-active { border-top: 1px solid var(--guide-color-active); }
.monaco-editor .horizontal-bottom.indent-active { border-bottom: 1px solid var(--guide-color-active); }
.monaco-editor .minimap-slider .minimap-slider-horizontal { background: rgba(121, 121, 121, 0.2); }
.monaco-editor .minimap-slider:hover .minimap-slider-horizontal { background: rgba(100, 100, 100, 0.35); }
.monaco-editor .minimap-slider.active .minimap-slider-horizontal { background: rgba(191, 191, 191, 0.2); }
.monaco-editor .minimap-shadow-visible { box-shadow: #000000 -6px 0 6px -6px inset; }
.monaco-editor .view-ruler { box-shadow: 1px 0 0 0 #5a5a5a inset; }
.monaco-editor .scroll-decoration { box-shadow: #000000 0 6px 6px -6px inset; }
.monaco-editor .focused .selected-text { background-color: #264f78; }
.monaco-editor .selected-text { background-color: #3a3d41; }
.monaco-editor .inputarea.ime-input { caret-color: #aeafad; }
.monaco-editor .cursors-layer .cursor { background-color: #aeafad; border-color: #aeafad; color: #515052; }
.monaco-editor .unexpected-closing-bracket { color: rgba(255, 18, 18, 0.8); }
.monaco-editor .bracket-highlighting-0 { color: #ffd700; }
.monaco-editor .bracket-highlighting-1 { color: #da70d6; }
.monaco-editor .bracket-highlighting-2 { color: #179fff; }
.monaco-editor .bracket-highlighting-3 { color: #ffd700; }
.monaco-editor .bracket-highlighting-4 { color: #da70d6; }
.monaco-editor .bracket-highlighting-5 { color: #179fff; }
.monaco-editor .bracket-highlighting-6 { color: #ffd700; }
.monaco-editor .bracket-highlighting-7 { color: #da70d6; }
.monaco-editor .bracket-highlighting-8 { color: #179fff; }
.monaco-editor .bracket-highlighting-9 { color: #ffd700; }
.monaco-editor .bracket-highlighting-10 { color: #da70d6; }
.monaco-editor .bracket-highlighting-11 { color: #179fff; }
.monaco-editor .bracket-highlighting-12 { color: #ffd700; }
.monaco-editor .bracket-highlighting-13 { color: #da70d6; }
.monaco-editor .bracket-highlighting-14 { color: #179fff; }
.monaco-editor .bracket-highlighting-15 { color: #ffd700; }
.monaco-editor .bracket-highlighting-16 { color: #da70d6; }
.monaco-editor .bracket-highlighting-17 { color: #179fff; }
.monaco-editor .bracket-highlighting-18 { color: #ffd700; }
.monaco-editor .bracket-highlighting-19 { color: #da70d6; }
.monaco-editor .bracket-highlighting-20 { color: #179fff; }
.monaco-editor .bracket-highlighting-21 { color: #ffd700; }
.monaco-editor .bracket-highlighting-22 { color: #da70d6; }
.monaco-editor .bracket-highlighting-23 { color: #179fff; }
.monaco-editor .bracket-highlighting-24 { color: #ffd700; }
.monaco-editor .bracket-highlighting-25 { color: #da70d6; }
.monaco-editor .bracket-highlighting-26 { color: #179fff; }
.monaco-editor .bracket-highlighting-27 { color: #ffd700; }
.monaco-editor .bracket-highlighting-28 { color: #da70d6; }
.monaco-editor .bracket-highlighting-29 { color: #179fff; }
.monaco-editor .squiggly-error { background: url("data:image/svg+xml,%3Csvg%20xmlns%3D'http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg'%20viewBox%3D'0%200%206%203'%20enable-background%3D'new%200%200%206%203'%20height%3D'3'%20width%3D'6'%3E%3Cg%20fill%3D'%23f14c4c'%3E%3Cpolygon%20points%3D'5.5%2C0%202.5%2C3%201.1%2C3%204.1%2C0'%2F%3E%3Cpolygon%20points%3D'4%2C0%206%2C2%206%2C0.6%205.4%2C0'%2F%3E%3Cpolygon%20points%3D'0%2C2%201%2C3%202.4%2C3%200%2C0.6'%2F%3E%3C%2Fg%3E%3C%2Fsvg%3E") repeat-x bottom left; }
.monaco-editor .squiggly-warning { background: url("data:image/svg+xml,%3Csvg%20xmlns%3D'http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg'%20viewBox%3D'0%200%206%203'%20enable-background%3D'new%200%200%206%203'%20height%3D'3'%20width%3D'6'%3E%3Cg%20fill%3D'%23cca700'%3E%3Cpolygon%20points%3D'5.5%2C0%202.5%2C3%201.1%2C3%204.1%2C0'%2F%3E%3Cpolygon%20points%3D'4%2C0%206%2C2%206%2C0.6%205.4%2C0'%2F%3E%3Cpolygon%20points%3D'0%2C2%201%2C3%202.4%2C3%200%2C0.6'%2F%3E%3C%2Fg%3E%3C%2Fsvg%3E") repeat-x bottom left; }
.monaco-editor .squiggly-info { background: url("data:image/svg+xml,%3Csvg%20xmlns%3D'http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg'%20viewBox%3D'0%200%206%203'%20enable-background%3D'new%200%200%206%203'%20height%3D'3'%20width%3D'6'%3E%3Cg%20fill%3D'%233794ff'%3E%3Cpolygon%20points%3D'5.5%2C0%202.5%2C3%201.1%2C3%204.1%2C0'%2F%3E%3Cpolygon%20points%3D'4%2C0%206%2C2%206%2C0.6%205.4%2C0'%2F%3E%3Cpolygon%20points%3D'0%2C2%201%2C3%202.4%2C3%200%2C0.6'%2F%3E%3C%2Fg%3E%3C%2Fsvg%3E") repeat-x bottom left; }
.monaco-editor .squiggly-hint { background: url("data:image/svg+xml,%3Csvg%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20height%3D%223%22%20width%3D%2212%22%3E%3Cg%20fill%3D%22rgba(238%2C%20238%2C%20238%2C%200.7)%22%3E%3Ccircle%20cx%3D%221%22%20cy%3D%221%22%20r%3D%221%22%2F%3E%3Ccircle%20cx%3D%225%22%20cy%3D%221%22%20r%3D%221%22%2F%3E%3Ccircle%20cx%3D%229%22%20cy%3D%221%22%20r%3D%221%22%2F%3E%3C%2Fg%3E%3C%2Fsvg%3E") no-repeat bottom left; }
.monaco-editor.showUnused .squiggly-inline-unnecessary { opacity: 0.667; }
.monaco-editor.showDeprecated .squiggly-inline-deprecated { text-decoration: line-through; text-decoration-color: #d4d4d4}
.monaco-editor .bracket-match { background-color: rgba(0, 100, 0, 0.1); }
.monaco-editor .bracket-match { border: 1px solid #888888; }
.monaco-editor .findOptionsWidget { background-color: #252526; }
.monaco-editor .findOptionsWidget { color: #cccccc; }
.monaco-editor .findOptionsWidget { box-shadow: 0 0 8px 2px rgba(0, 0, 0, 0.36); }
.monaco-editor .findMatch { background-color: rgba(234, 92, 0, 0.33); }
.monaco-editor .currentFindMatch { background-color: #515c6a; }
.monaco-editor .findScope { background-color: rgba(58, 61, 65, 0.4); }
.monaco-editor .find-widget { background-color: #252526; }
.monaco-editor .find-widget { box-shadow: 0 0 8px 2px rgba(0, 0, 0, 0.36); }
.monaco-editor .find-widget { color: #cccccc; }
.monaco-editor .find-widget.no-results .matchesCount { color: #f48771; }
.monaco-editor .find-widget .monaco-sash { background-color: #454545; }

		.monaco-editor .find-widget .button:not(.disabled):hover,
		.monaco-editor .find-widget .codicon-find-selection:hover {
			background-color: rgba(90, 93, 94, 0.31) !important;
		}
	
.monaco-editor .find-widget .monaco-inputbox.synthetic-focus { outline-color: #007fd4; }
.monaco-editor .goto-definition-link { color: #4e94ce !important; }

		.monaco-editor .contentWidgets .codicon.codicon-light-bulb {
			color: #ffcc00;
			background-color: rgba(40, 40, 40, 0.7);
		}

		.monaco-editor .contentWidgets .codicon.codicon-lightbulb-autofix {
			color: #75beff;
			background-color: rgba(40, 40, 40, 0.7);
		}

			.monaco-editor .zone-widget .codicon.codicon-error,
			.markers-panel .marker-icon.codicon.codicon-error,
			.text-search-provider-messages .providerMessage .codicon.codicon-error,
			.extensions-viewlet > .extensions .codicon.codicon-error {
				color: #f14c4c;
			}
		

			.monaco-editor .zone-widget .codicon.codicon-warning,
			.markers-panel .marker-icon.codicon.codicon-warning,
			.extensions-viewlet > .extensions .codicon.codicon-warning,
			.extension-editor .codicon.codicon-warning,
			.text-search-provider-messages .providerMessage .codicon.codicon-warning,
			.preferences-editor .codicon.codicon-warning {
				color: #cca700;
			}
		

			.monaco-editor .zone-widget .codicon.codicon-info,
			.markers-panel .marker-icon.codicon.codicon-info,
			.extensions-viewlet > .extensions .codicon.codicon-info,
			.text-search-provider-messages .providerMessage .codicon.codicon-info,
			.extension-editor .codicon.codicon-info {
				color: #3794ff;
			}
		
.monaco-hover .hover-contents a.code-link span { color: #3794ff; }
.monaco-hover .hover-contents a.code-link span:hover { color: #3794ff; }
.monaco-editor .hoverHighlight { background-color: rgba(38, 79, 120, 0.25); }
.monaco-editor .monaco-hover { background-color: #252526; }
.monaco-editor .monaco-hover { border: 1px solid #454545; }
.monaco-editor .monaco-hover .hover-row:not(:first-child):not(:empty) { border-top: 1px solid rgba(69, 69, 69, 0.5); }
.monaco-editor .monaco-hover hr { border-top: 1px solid rgba(69, 69, 69, 0.5); }
.monaco-editor .monaco-hover hr { border-bottom: 0px solid rgba(69, 69, 69, 0.5); }
.monaco-editor .monaco-hover a { color: #3794ff; }
.monaco-editor .monaco-hover a:hover { color: #3794ff; }
.monaco-editor .monaco-hover { color: #cccccc; }
.monaco-editor .monaco-hover .hover-row .actions { background-color: #2c2c2d; }
.monaco-editor .monaco-hover code { background-color: rgba(10, 10, 10, 0.4); }
.monaco-editor.vs .valueSetReplacement { outline: solid 2px #888888; }
.monaco-editor .detected-link-active { color: #4e94ce !important; }
.monaco-editor .parameter-hints-widget { border: 1px solid #454545; }
.monaco-editor .parameter-hints-widget.multiple .body { border-left: 1px solid rgba(69, 69, 69, 0.5); }
.monaco-editor .parameter-hints-widget .signature.has-docs { border-bottom: 1px solid rgba(69, 69, 69, 0.5); }
.monaco-editor .parameter-hints-widget { background-color: #252526; }
.monaco-editor .parameter-hints-widget a { color: #3794ff; }
.monaco-editor .parameter-hints-widget a:hover { color: #3794ff; }
.monaco-editor .parameter-hints-widget { color: #cccccc; }
.monaco-editor .parameter-hints-widget code { background-color: rgba(10, 10, 10, 0.4); }
.monaco-editor .parameter-hints-widget .parameter.active { color: #18a3ff}
.codicon.codicon-symbol-array { color: #cccccc; }
.codicon.codicon-symbol-boolean { color: #cccccc; }
.codicon.codicon-symbol-class { color: #ee9d28; }
.codicon.codicon-symbol-method { color: #b180d7; }
.codicon.codicon-symbol-color { color: #cccccc; }
.codicon.codicon-symbol-constant { color: #cccccc; }
.codicon.codicon-symbol-constructor { color: #b180d7; }

			.codicon.codicon-symbol-value,.codicon.codicon-symbol-enum { color: #ee9d28; }
.codicon.codicon-symbol-enum-member { color: #75beff; }
.codicon.codicon-symbol-event { color: #ee9d28; }
.codicon.codicon-symbol-field { color: #75beff; }
.codicon.codicon-symbol-file { color: #cccccc; }
.codicon.codicon-symbol-folder { color: #cccccc; }
.codicon.codicon-symbol-function { color: #b180d7; }
.codicon.codicon-symbol-interface { color: #75beff; }
.codicon.codicon-symbol-key { color: #cccccc; }
.codicon.codicon-symbol-keyword { color: #cccccc; }
.codicon.codicon-symbol-module { color: #cccccc; }
.codicon.codicon-symbol-namespace { color: #cccccc; }
.codicon.codicon-symbol-null { color: #cccccc; }
.codicon.codicon-symbol-number { color: #cccccc; }
.codicon.codicon-symbol-object { color: #cccccc; }
.codicon.codicon-symbol-operator { color: #cccccc; }
.codicon.codicon-symbol-package { color: #cccccc; }
.codicon.codicon-symbol-property { color: #cccccc; }
.codicon.codicon-symbol-reference { color: #cccccc; }
.codicon.codicon-symbol-snippet { color: #cccccc; }
.codicon.codicon-symbol-string { color: #cccccc; }
.codicon.codicon-symbol-struct { color: #cccccc; }
.codicon.codicon-symbol-text { color: #cccccc; }
.codicon.codicon-symbol-type-parameter { color: #cccccc; }
.codicon.codicon-symbol-unit { color: #cccccc; }
.codicon.codicon-symbol-variable { color: #75beff; }
.monaco-editor .focused .selectionHighlight { background-color: rgba(173, 214, 255, 0.15); }
.monaco-editor .selectionHighlight { background-color: rgba(173, 214, 255, 0.07); }
.monaco-editor .wordHighlight { background-color: rgba(87, 87, 87, 0.72); }
.monaco-editor .wordHighlightStrong { background-color: rgba(0, 73, 114, 0.72); }
.monaco-editor .accessibilityHelpWidget { background-color: #252526; }
.monaco-editor .accessibilityHelpWidget { color: #cccccc; }
.monaco-editor .accessibilityHelpWidget { box-shadow: 0 2px 8px rgba(0, 0, 0, 0.36); }
.monaco-editor .tokens-inspect-widget { border: 1px solid #454545; }
.monaco-editor .tokens-inspect-widget .tokens-inspect-separator { background-color: #454545; }
.monaco-editor .tokens-inspect-widget { background-color: #252526; }
.monaco-editor .tokens-inspect-widget { color: #cccccc; }
.monaco-diff-editor .diff-review-line-number { color: #858585; }
.monaco-diff-editor .diff-review-shadow { box-shadow: #000000 0 -6px 6px -6px inset; }
.monaco-editor .char-insert, .monaco-diff-editor .char-insert { background-color: rgba(155, 185, 85, 0.2); }
.monaco-editor .line-insert, .monaco-diff-editor .line-insert { background-color: rgba(155, 185, 85, 0.2); }
.monaco-editor .inline-added-margin-view-zone { background-color: rgba(155, 185, 85, 0.2); }
.monaco-editor .gutter-insert, .monaco-diff-editor .gutter-insert { background-color: rgba(155, 185, 85, 0.2); }
.monaco-editor .char-delete, .monaco-diff-editor .char-delete { background-color: rgba(255, 0, 0, 0.2); }
.monaco-editor .line-delete, .monaco-diff-editor .line-delete { background-color: rgba(255, 0, 0, 0.2); }
.monaco-editor .inline-deleted-margin-view-zone { background-color: rgba(255, 0, 0, 0.2); }
.monaco-editor .gutter-delete, .monaco-diff-editor .gutter-delete { background-color: rgba(255, 0, 0, 0.2); }
.monaco-diff-editor.side-by-side .editor.modified { box-shadow: -6px 0 5px -5px #000000; }

			.monaco-diff-editor .diffViewport {
				background: rgba(121, 121, 121, 0.4);
			}
		

			.monaco-diff-editor .diffViewport:hover {
				background: rgba(100, 100, 100, 0.7);
			}
		

			.monaco-diff-editor .diffViewport:active {
				background: rgba(191, 191, 191, 0.4);
			}
		

	.monaco-editor .diagonal-fill {
		background-image: linear-gradient(
			-45deg,
			rgba(204, 204, 204, 0.2) 12.5%,
			#0000 12.5%, #0000 50%,
			rgba(204, 204, 204, 0.2) 50%, rgba(204, 204, 204, 0.2) 62.5%,
			#0000 62.5%, #0000 100%
		);
		background-size: 8px 8px;
	}
	
.monaco-editor { --vscode-foreground: #cccccc;
--vscode-errorForeground: #f48771;
--vscode-descriptionForeground: rgba(204, 204, 204, 0.7);
--vscode-icon-foreground: #c5c5c5;
--vscode-focusBorder: #007fd4;
--vscode-textSeparator-foreground: rgba(255, 255, 255, 0.18);
--vscode-textLink-foreground: #3794ff;
--vscode-textLink-activeForeground: #3794ff;
--vscode-textPreformat-foreground: #d7ba7d;
--vscode-textBlockQuote-background: rgba(127, 127, 127, 0.1);
--vscode-textBlockQuote-border: rgba(0, 122, 204, 0.5);
--vscode-textCodeBlock-background: rgba(10, 10, 10, 0.4);
--vscode-widget-shadow: rgba(0, 0, 0, 0.36);
--vscode-input-background: #3c3c3c;
--vscode-input-foreground: #cccccc;
--vscode-inputOption-activeBorder: rgba(0, 122, 204, 0);
--vscode-inputOption-hoverBackground: rgba(90, 93, 94, 0.5);
--vscode-inputOption-activeBackground: rgba(0, 127, 212, 0.4);
--vscode-inputOption-activeForeground: #ffffff;
--vscode-input-placeholderForeground: #a6a6a6;
--vscode-inputValidation-infoBackground: #063b49;
--vscode-inputValidation-infoBorder: #007acc;
--vscode-inputValidation-warningBackground: #352a05;
--vscode-inputValidation-warningBorder: #b89500;
--vscode-inputValidation-errorBackground: #5a1d1d;
--vscode-inputValidation-errorBorder: #be1100;
--vscode-dropdown-background: #3c3c3c;
--vscode-dropdown-foreground: #f0f0f0;
--vscode-dropdown-border: #3c3c3c;
--vscode-checkbox-background: #3c3c3c;
--vscode-checkbox-foreground: #f0f0f0;
--vscode-checkbox-border: #3c3c3c;
--vscode-button-foreground: #ffffff;
--vscode-button-background: #0e639c;
--vscode-button-hoverBackground: #1177bb;
--vscode-button-secondaryForeground: #ffffff;
--vscode-button-secondaryBackground: #3a3d41;
--vscode-button-secondaryHoverBackground: #45494e;
--vscode-badge-background: #4d4d4d;
--vscode-badge-foreground: #ffffff;
--vscode-scrollbar-shadow: #000000;
--vscode-scrollbarSlider-background: rgba(121, 121, 121, 0.4);
--vscode-scrollbarSlider-hoverBackground: rgba(100, 100, 100, 0.7);
--vscode-scrollbarSlider-activeBackground: rgba(191, 191, 191, 0.4);
--vscode-progressBar-background: #0e70c0;
--vscode-editorError-foreground: #f14c4c;
--vscode-editorWarning-foreground: #cca700;
--vscode-editorInfo-foreground: #3794ff;
--vscode-editorHint-foreground: rgba(238, 238, 238, 0.7);
--vscode-sash-hoverBorder: #007fd4;
--vscode-editor-background: #282828;
--vscode-editor-foreground: #d4d4d4;
--vscode-editorWidget-background: #252526;
--vscode-editorWidget-foreground: #cccccc;
--vscode-editorWidget-border: #454545;
--vscode-quickInput-background: #252526;
--vscode-quickInput-foreground: #cccccc;
--vscode-quickInputTitle-background: rgba(255, 255, 255, 0.1);
--vscode-pickerGroup-foreground: #3794ff;
--vscode-pickerGroup-border: #3f3f46;
--vscode-keybindingLabel-background: rgba(128, 128, 128, 0.17);
--vscode-keybindingLabel-foreground: #cccccc;
--vscode-keybindingLabel-border: rgba(51, 51, 51, 0.6);
--vscode-keybindingLabel-bottomBorder: rgba(68, 68, 68, 0.6);
--vscode-editor-selectionBackground: #264f78;
--vscode-editor-inactiveSelectionBackground: #3a3d41;
--vscode-editor-selectionHighlightBackground: rgba(173, 214, 255, 0.15);
--vscode-editor-findMatchBackground: #515c6a;
--vscode-editor-findMatchHighlightBackground: rgba(234, 92, 0, 0.33);
--vscode-editor-findRangeHighlightBackground: rgba(58, 61, 65, 0.4);
--vscode-searchEditor-findMatchBackground: rgba(234, 92, 0, 0.22);
--vscode-editor-hoverHighlightBackground: rgba(38, 79, 120, 0.25);
--vscode-editorHoverWidget-background: #252526;
--vscode-editorHoverWidget-foreground: #cccccc;
--vscode-editorHoverWidget-border: #454545;
--vscode-editorHoverWidget-statusBarBackground: #2c2c2d;
--vscode-editorLink-activeForeground: #4e94ce;
--vscode-editorInlayHint-foreground: rgba(255, 255, 255, 0.8);
--vscode-editorInlayHint-background: rgba(77, 77, 77, 0.6);
--vscode-editorInlayHint-typeForeground: rgba(255, 255, 255, 0.8);
--vscode-editorInlayHint-typeBackground: rgba(77, 77, 77, 0.6);
--vscode-editorInlayHint-parameterForeground: rgba(255, 255, 255, 0.8);
--vscode-editorInlayHint-parameterBackground: rgba(77, 77, 77, 0.6);
--vscode-editorLightBulb-foreground: #ffcc00;
--vscode-editorLightBulbAutoFix-foreground: #75beff;
--vscode-diffEditor-insertedTextBackground: rgba(155, 185, 85, 0.2);
--vscode-diffEditor-removedTextBackground: rgba(255, 0, 0, 0.2);
--vscode-diffEditor-diagonalFill: rgba(204, 204, 204, 0.2);
--vscode-list-focusOutline: #007fd4;
--vscode-list-activeSelectionBackground: #094771;
--vscode-list-activeSelectionForeground: #ffffff;
--vscode-list-inactiveSelectionBackground: #37373d;
--vscode-list-hoverBackground: #2a2d2e;
--vscode-list-dropBackground: #383b3d;
--vscode-list-highlightForeground: #18a3ff;
--vscode-list-focusHighlightForeground: #18a3ff;
--vscode-list-invalidItemForeground: #b89500;
--vscode-list-errorForeground: #f88070;
--vscode-list-warningForeground: #cca700;
--vscode-listFilterWidget-background: #653723;
--vscode-listFilterWidget-outline: rgba(0, 0, 0, 0);
--vscode-listFilterWidget-noMatchesOutline: #be1100;
--vscode-list-filterMatchBackground: rgba(234, 92, 0, 0.33);
--vscode-tree-indentGuidesStroke: #585858;
--vscode-tree-tableColumnsBorder: rgba(204, 204, 204, 0.13);
--vscode-tree-tableOddRowsBackground: rgba(204, 204, 204, 0.04);
--vscode-list-deemphasizedForeground: #8c8c8c;
--vscode-quickInputList-focusForeground: #ffffff;
--vscode-quickInputList-focusBackground: #094771;
--vscode-menu-foreground: #cccccc;
--vscode-menu-background: #252526;
--vscode-menu-selectionForeground: #ffffff;
--vscode-menu-selectionBackground: #094771;
--vscode-menu-separatorBackground: #bbbbbb;
--vscode-toolbar-hoverBackground: rgba(90, 93, 94, 0.31);
--vscode-toolbar-activeBackground: rgba(99, 102, 103, 0.31);
--vscode-editor-snippetTabstopHighlightBackground: rgba(124, 124, 124, 0.3);
--vscode-editor-snippetFinalTabstopHighlightBorder: #525252;
--vscode-breadcrumb-foreground: rgba(204, 204, 204, 0.8);
--vscode-breadcrumb-background: #282828;
--vscode-breadcrumb-focusForeground: #e0e0e0;
--vscode-breadcrumb-activeSelectionForeground: #e0e0e0;
--vscode-breadcrumbPicker-background: #252526;
--vscode-merge-currentHeaderBackground: rgba(64, 200, 174, 0.5);
--vscode-merge-currentContentBackground: rgba(64, 200, 174, 0.2);
--vscode-merge-incomingHeaderBackground: rgba(64, 166, 255, 0.5);
--vscode-merge-incomingContentBackground: rgba(64, 166, 255, 0.2);
--vscode-merge-commonHeaderBackground: rgba(96, 96, 96, 0.4);
--vscode-merge-commonContentBackground: rgba(96, 96, 96, 0.16);
--vscode-editorOverviewRuler-currentContentForeground: rgba(64, 200, 174, 0.5);
--vscode-editorOverviewRuler-incomingContentForeground: rgba(64, 166, 255, 0.5);
--vscode-editorOverviewRuler-commonContentForeground: rgba(96, 96, 96, 0.4);
--vscode-editorOverviewRuler-findMatchForeground: rgba(209, 134, 22, 0.49);
--vscode-editorOverviewRuler-selectionHighlightForeground: rgba(160, 160, 160, 0.8);
--vscode-minimap-findMatchHighlight: #d18616;
--vscode-minimap-selectionOccurrenceHighlight: #676767;
--vscode-minimap-selectionHighlight: #264f78;
--vscode-minimap-errorHighlight: rgba(255, 18, 18, 0.7);
--vscode-minimap-warningHighlight: #cca700;
--vscode-minimap-foregroundOpacity: #000000;
--vscode-minimapSlider-background: rgba(121, 121, 121, 0.2);
--vscode-minimapSlider-hoverBackground: rgba(100, 100, 100, 0.35);
--vscode-minimapSlider-activeBackground: rgba(191, 191, 191, 0.2);
--vscode-problemsErrorIcon-foreground: #f14c4c;
--vscode-problemsWarningIcon-foreground: #cca700;
--vscode-problemsInfoIcon-foreground: #3794ff;
--vscode-charts-foreground: #cccccc;
--vscode-charts-lines: rgba(204, 204, 204, 0.5);
--vscode-charts-red: #f14c4c;
--vscode-charts-blue: #3794ff;
--vscode-charts-yellow: #cca700;
--vscode-charts-orange: #d18616;
--vscode-charts-green: #89d185;
--vscode-charts-purple: #b180d7;
--vscode-editor-lineHighlightBorder: #282828;
--vscode-editor-rangeHighlightBackground: rgba(255, 255, 255, 0.04);
--vscode-editor-symbolHighlightBackground: rgba(234, 92, 0, 0.33);
--vscode-editorCursor-foreground: #aeafad;
--vscode-editorWhitespace-foreground: rgba(227, 228, 226, 0.16);
--vscode-editorIndentGuide-background: #404040;
--vscode-editorIndentGuide-activeBackground: #707070;
--vscode-editorLineNumber-foreground: #858585;
--vscode-editorActiveLineNumber-foreground: #c6c6c6;
--vscode-editorLineNumber-activeForeground: #c6c6c6;
--vscode-editorRuler-foreground: #5a5a5a;
--vscode-editorCodeLens-foreground: #999999;
--vscode-editorBracketMatch-background: rgba(0, 100, 0, 0.1);
--vscode-editorBracketMatch-border: #888888;
--vscode-editorOverviewRuler-border: rgba(127, 127, 127, 0.3);
--vscode-editorGutter-background: #282828;
--vscode-editorUnnecessaryCode-opacity: rgba(0, 0, 0, 0.67);
--vscode-editorGhostText-foreground: rgba(255, 255, 255, 0.34);
--vscode-editorOverviewRuler-rangeHighlightForeground: rgba(0, 122, 204, 0.6);
--vscode-editorOverviewRuler-errorForeground: rgba(255, 18, 18, 0.7);
--vscode-editorOverviewRuler-warningForeground: #cca700;
--vscode-editorOverviewRuler-infoForeground: #3794ff;
--vscode-editorBracketHighlight-foreground1: #ffd700;
--vscode-editorBracketHighlight-foreground2: #da70d6;
--vscode-editorBracketHighlight-foreground3: #179fff;
--vscode-editorBracketHighlight-foreground4: rgba(0, 0, 0, 0);
--vscode-editorBracketHighlight-foreground5: rgba(0, 0, 0, 0);
--vscode-editorBracketHighlight-foreground6: rgba(0, 0, 0, 0);
--vscode-editorBracketHighlight-unexpectedBracket-foreground: rgba(255, 18, 18, 0.8);
--vscode-editorBracketPairGuide-background1: rgba(0, 0, 0, 0);
--vscode-editorBracketPairGuide-background2: rgba(0, 0, 0, 0);
--vscode-editorBracketPairGuide-background3: rgba(0, 0, 0, 0);
--vscode-editorBracketPairGuide-background4: rgba(0, 0, 0, 0);
--vscode-editorBracketPairGuide-background5: rgba(0, 0, 0, 0);
--vscode-editorBracketPairGuide-background6: rgba(0, 0, 0, 0);
--vscode-editorBracketPairGuide-activeBackground1: rgba(0, 0, 0, 0);
--vscode-editorBracketPairGuide-activeBackground2: rgba(0, 0, 0, 0);
--vscode-editorBracketPairGuide-activeBackground3: rgba(0, 0, 0, 0);
--vscode-editorBracketPairGuide-activeBackground4: rgba(0, 0, 0, 0);
--vscode-editorBracketPairGuide-activeBackground5: rgba(0, 0, 0, 0);
--vscode-editorBracketPairGuide-activeBackground6: rgba(0, 0, 0, 0);
--vscode-editorUnicodeHighlight-border: #bd9b03;
--vscode-editorOverviewRuler-bracketMatchForeground: #a0a0a0;
--vscode-peekViewTitle-background: rgba(55, 148, 255, 0.1);
--vscode-peekViewTitleLabel-foreground: #ffffff;
--vscode-peekViewTitleDescription-foreground: rgba(204, 204, 204, 0.7);
--vscode-peekView-border: #3794ff;
--vscode-peekViewResult-background: #252526;
--vscode-peekViewResult-lineForeground: #bbbbbb;
--vscode-peekViewResult-fileForeground: #ffffff;
--vscode-peekViewResult-selectionBackground: rgba(51, 153, 255, 0.2);
--vscode-peekViewResult-selectionForeground: #ffffff;
--vscode-peekViewEditor-background: #001f33;
--vscode-peekViewEditorGutter-background: #001f33;
--vscode-peekViewResult-matchHighlightBackground: rgba(234, 92, 0, 0.3);
--vscode-peekViewEditor-matchHighlightBackground: rgba(255, 143, 0, 0.6);
--vscode-editorMarkerNavigationError-background: #f14c4c;
--vscode-editorMarkerNavigationError-headerBackground: rgba(241, 76, 76, 0.1);
--vscode-editorMarkerNavigationWarning-background: #cca700;
--vscode-editorMarkerNavigationWarning-headerBackground: rgba(204, 167, 0, 0.1);
--vscode-editorMarkerNavigationInfo-background: #3794ff;
--vscode-editorMarkerNavigationInfo-headerBackground: rgba(55, 148, 255, 0.1);
--vscode-editorMarkerNavigation-background: #282828;
--vscode-editorHoverWidget-highlightForeground: #18a3ff;
--vscode-symbolIcon-arrayForeground: #cccccc;
--vscode-symbolIcon-booleanForeground: #cccccc;
--vscode-symbolIcon-classForeground: #ee9d28;
--vscode-symbolIcon-colorForeground: #cccccc;
--vscode-symbolIcon-constantForeground: #cccccc;
--vscode-symbolIcon-constructorForeground: #b180d7;
--vscode-symbolIcon-enumeratorForeground: #ee9d28;
--vscode-symbolIcon-enumeratorMemberForeground: #75beff;
--vscode-symbolIcon-eventForeground: #ee9d28;
--vscode-symbolIcon-fieldForeground: #75beff;
--vscode-symbolIcon-fileForeground: #cccccc;
--vscode-symbolIcon-folderForeground: #cccccc;
--vscode-symbolIcon-functionForeground: #b180d7;
--vscode-symbolIcon-interfaceForeground: #75beff;
--vscode-symbolIcon-keyForeground: #cccccc;
--vscode-symbolIcon-keywordForeground: #cccccc;
--vscode-symbolIcon-methodForeground: #b180d7;
--vscode-symbolIcon-moduleForeground: #cccccc;
--vscode-symbolIcon-namespaceForeground: #cccccc;
--vscode-symbolIcon-nullForeground: #cccccc;
--vscode-symbolIcon-numberForeground: #cccccc;
--vscode-symbolIcon-objectForeground: #cccccc;
--vscode-symbolIcon-operatorForeground: #cccccc;
--vscode-symbolIcon-packageForeground: #cccccc;
--vscode-symbolIcon-propertyForeground: #cccccc;
--vscode-symbolIcon-referenceForeground: #cccccc;
--vscode-symbolIcon-snippetForeground: #cccccc;
--vscode-symbolIcon-stringForeground: #cccccc;
--vscode-symbolIcon-structForeground: #cccccc;
--vscode-symbolIcon-textForeground: #cccccc;
--vscode-symbolIcon-typeParameterForeground: #cccccc;
--vscode-symbolIcon-unitForeground: #cccccc;
--vscode-symbolIcon-variableForeground: #75beff;
--vscode-editorSuggestWidget-background: #252526;
--vscode-editorSuggestWidget-border: #454545;
--vscode-editorSuggestWidget-foreground: #d4d4d4;
--vscode-editorSuggestWidget-selectedForeground: #ffffff;
--vscode-editorSuggestWidget-selectedBackground: #094771;
--vscode-editorSuggestWidget-highlightForeground: #18a3ff;
--vscode-editorSuggestWidget-focusHighlightForeground: #18a3ff;
--vscode-editorSuggestWidgetStatus-foreground: rgba(212, 212, 212, 0.5);
--vscode-editor-wordHighlightBackground: rgba(87, 87, 87, 0.72);
--vscode-editor-wordHighlightStrongBackground: rgba(0, 73, 114, 0.72);
--vscode-editorOverviewRuler-wordHighlightForeground: rgba(160, 160, 160, 0.8);
--vscode-editorOverviewRuler-wordHighlightStrongForeground: rgba(192, 160, 192, 0.8); }

.mtk1 { color: #d4d4d4; }
.mtk2 { color: #282828; }
.mtk3 { color: #6a9955; }
.mtk4 { color: #569cd6; }
.mtk5 { color: #d16969; }
.mtk6 { color: #d7ba7d; }
.mtk7 { color: #b5cea8; }
.mtk8 { color: #ce9178; }
.mtk9 { color: #646695; }
.mtk10 { color: #4ec9b0; }
.mtk11 { color: #dcdcaa; }
.mtk12 { color: #c8c8c8; }
.mtk13 { color: #c586c0; }
.mtk14 { color: #9cdcfe; }
.mtk15 { color: #000080; }
.mtk16 { color: #f44747; }
.mtk17 { color: #6796e6; }
.mtk18 { color: #808080; }
.mtk19 { color: #4fc1ff; }
.mtki { font-style: italic; }
.mtkb { font-weight: bold; }
.mtku { text-decoration: underline; text-underline-position: under; }
.mtks { text-decoration: line-through; }
.mtks.mtku { text-decoration: underline line-through; text-underline-position: under; }</style><link rel="stylesheet" type="text/css" href="./Combinations - LeetCode_files/2e0e4fec32768a7f.css"><style id="2280">._30gKN{content:"";display:inline-block;height:0;position:absolute;width:0}</style><style id="49309">._3B069 ._2hOcC a,._2hOcC a{--tw-text-opacity:1;color:rgb(0 122 255/var(--tw-text-opacity))}</style></head><body class="chakra-ui-dark vsc-initialized" data-new-gr-c-s-check-loaded="14.1098.0" data-gr-ext-installed="" data-new-gr-c-s-loaded="14.1098.0"><script id="chakra-script">!(function(){try{var a=function(c){var v="(prefers-color-scheme: dark)",h=window.matchMedia(v).matches?"dark":"light",r=c==="system"?h:c,o=document.documentElement,s=document.body,l="chakra-ui-light",d="chakra-ui-dark",i=r==="dark";return s.classList.add(i?d:l),s.classList.remove(i?l:d),o.style.colorScheme=r,o.dataset.theme=r,r},n=a,m="system",e="lc-dark-side",t=localStorage.getItem(e);t?a(t):localStorage.setItem(e,a(m))}catch(a){}})();</script><div id="__next"><script>!function(){try{var d=document.documentElement,c=d.classList;c.remove('light','dark');var e=localStorage.getItem('lc-dark-side');if('system'===e||(!e&&true)){var t='(prefers-color-scheme: dark)',m=window.matchMedia(t);if(m.media!==t||m.matches){d.style.colorScheme = 'dark';c.add('dark')}else{d.style.colorScheme = 'light';c.add('light')}}else if(e){c.add(e|| '')}if(e==='light'||e==='dark')d.style.colorScheme=e}catch(e){}}()</script><div class="flex min-w-[360px] flex-col text-label-1 dark:text-dark-label-1 h-[100vh]"><div class="h-[100vh] bg-layer-bg dark:bg-dark-layer-bg"><div class="flex h-full w-full flex-col"><nav class="relative flex h-[50px] w-full shrink-0 items-center px-5 z-nav-1 bg-layer-1 dark:bg-dark-layer-1"><div class="flex w-full justify-between"><div class="flex w-full items-center justify-between"><div class="flex"><ul class="relative flex h-[50px] items-end space-x-5 lc-lg:space-x-7"><a class="self-center" href="https://leetcode.com/"><div class="mb-0.5 pl-1"><div class="hidden h-[22px] dark:flex"><img src="./Combinations - LeetCode_files/logo-large-dark-94099a3702daad8363bf79c3faef5a3f.png" alt="LeetCode Logo"></div><div class="flex h-[22px] dark:hidden"><img src="./Combinations - LeetCode_files/logo-large-748c77d15b8d04e659615ebb5baa7bb6.png" alt="LeetCode Logo"></div></div></a><div class="hidden lc-lg:block"><li class="relative border-opacity-0 dark:border-opacity-0 flex items-center pb-3 text-base leading-[22px]
   cursor-pointer text-label-2 dark:text-dark-label-2 hover:text-label-1 dark:hover:text-dark-label-1"></li><hr class="border-divider-2 dark:border-dark-divider-2 h-0.5 rounded-[1px] border-none bg-gray-8 dark:bg-white shadow-level2 dark:shadow-dark-level2 invisible"></div></ul></div><div class="absolute left-[50%] hidden -translate-x-2/4 items-center space-x-4 lc-md:flex"><div class="flex h-8 w-8 cursor-pointer rounded bg-fill-3 dark:bg-dark-fill-3 hover:bg-fill-2 dark:hover:bg-dark-fill-2 text-gray-7 dark:text-dark-gray-7"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="16" height="16" fill="currentColor" class="m-auto items-center"><path fill-rule="evenodd" d="M16.091 4.929l-7.057 7.078 7.057 7.064a1 1 0 01-1.414 1.414l-7.764-7.77a1 1 0 010-1.415l7.764-7.785a1 1 0 111.415 1.414z" clip-rule="evenodd"></path></svg></div><div class="flex cursor-pointer items-center space-x-2"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="16" height="16" fill="currentColor" class="text-gray-8 dark:text-dark-gray-8"><path fill-rule="evenodd" d="M5 6a1 1 0 011-1h12a1 1 0 110 2H6a1 1 0 01-1-1zm0 6a1 1 0 011-1h12a1 1 0 110 2H6a1 1 0 01-1-1zm1 5a1 1 0 100 2h12a1 1 0 100-2H6z" clip-rule="evenodd"></path></svg><div class="max-w-[170px] truncate font-medium text-gray-8 dark:text-dark-gray-8">Problem List</div></div><div class="flex h-8 w-8 cursor-pointer rounded bg-fill-3 dark:bg-dark-fill-3 hover:bg-fill-2 dark:hover:bg-dark-fill-2 text-gray-7 dark:text-dark-gray-7"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="16" height="16" fill="currentColor" class="m-auto items-center"><path fill-rule="evenodd" d="M7.913 19.071l7.057-7.078-7.057-7.064a1 1 0 011.414-1.414l7.764 7.77a1 1 0 010 1.415l-7.764 7.785a1 1 0 01-1.414-1.414z" clip-rule="evenodd"></path></svg></div></div><div class="relative ml-4 flex items-center space-x-4"><a href="https://leetcode.com/subscribe/?ref=lp_pl&amp;source=nav-premium" class="no-underline hover:text-blue-s dark:hover:text-dark-blue-s truncate"><div class="hidden lg:block bg-fill-3 dark:bg-dark-fill-3 hover:bg-fill-2 dark:hover:bg-dark-fill-2 mr-3 cursor-pointer rounded py-1.5 px-3 transition-colors"><span class="text-brand-orange">Premium</span></div></a><div class="hidden lc-lg:block"><div class="flex cursor-pointer items-center rounded hover:bg-fill-3 dark:hover:bg-dark-fill-3"><div class="css-0"><div class="flex items-center justify-center h-8 p-1 text-gray-6 dark:text-dark-gray-6 hover:text-gray-7 dark:hover:text-dark-gray-7"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor" class="h-6 w-6"><path fill-rule="evenodd" d="M12 4a9 9 0 110 18 9 9 0 010-18zm0 2a7 7 0 100 14 7 7 0 000-14zm0 1.634a1 1 0 01.993.883l.007.117-.001 3.774 2.111 1.162a1 1 0 01.445 1.253l-.05.105a1 1 0 01-1.254.445l-.105-.05-2.628-1.447a1 1 0 01-.51-.756L11 13V8.634a1 1 0 011-1zM16.235 2.4a1 1 0 011.296-.269l.105.07 4 3 .095.08a1 1 0 01-1.19 1.588l-.105-.069-4-3-.096-.081a1 1 0 01-.105-1.319zM7.8 2.4a1 1 0 01-.104 1.319L7.6 3.8l-4 3a1 1 0 01-1.296-1.518L2.4 5.2l4-3a1 1 0 011.4.2z" clip-rule="evenodd"></path></svg></div></div></div></div><a class="group flex items-center hover:bg-fill-3 dark:hover:bg-dark-fill-3 rounded p-1 relative cursor-default"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor" class="h-[24px] w-[24px]"><g filter="url(#hot-filled_svg__filter0_i_289_12318)"><path fill-rule="evenodd" d="M9.588 2.085a1 1 0 01.97.092c2.85 1.966 4.498 4.744 5.31 6.67l.854-.885a1 1 0 011.56.154c2.177 3.38 2.211 7.383.521 10.3C17.039 21.459 13.583 22 11.977 22c-1.569 0-4.905-.27-6.825-3.584-.832-1.435-1.27-3.053-1.125-4.704.146-1.66.876-3.284 2.264-4.721.86-.891 1.505-2.122 1.957-3.322.449-1.193.68-2.278.752-2.806a1 1 0 01.588-.778z" clip-rule="evenodd" fill="url(#hot-filled_svg__paint0_linear_289_12318)"></path></g><defs><lineargradient id="hot-filled_svg__paint0_linear_289_12318" x1="12" x2="12" y1="2" y2="22" gradientUnits="userSpaceOnUse"><stop stop-color="#FFA116"></stop><stop offset="1" stop-color="#F9772E"></stop></lineargradient><filter id="hot-filled_svg__filter0_i_289_12318" width="17.2" height="21.2" x="4" y="2" color-interpolation-filters="sRGB" filterUnits="userSpaceOnUse"><feflood flood-opacity="0" result="BackgroundImageFix"></feflood><feblend in="SourceGraphic" in2="BackgroundImageFix" result="shape"></feblend><fecolormatrix in="SourceAlpha" result="hardAlpha" values="0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 127 0"></fecolormatrix><feoffset dx="1.2" dy="1.2"></feoffset><fegaussianblur stdDeviation="0.6"></fegaussianblur><fecomposite in2="hardAlpha" k2="-1" k3="1" operator="arithmetic"></fecomposite><fecolormatrix values="0 0 0 0 0.970833 0 0 0 0 0.05825 0 0 0 0 0 0 0 0 0.16 0"></fecolormatrix><feblend in2="shape" result="effect1_innerShadow_289_12318"></feblend></filter></defs></svg><span class="mx-1 text-sm font-medium text-brand-orange dark:text-dark-brand-orange">17</span></a><div class="relative" data-headlessui-state=""><button class="flex items-center focus:outline-none" id="headlessui-popover-button-:r1t6:" type="button" aria-expanded="false" data-headlessui-state=""><div id="navbar_user_avatar" class="relative ml-1"><div class="h-6 w-6"><img src="./Combinations - LeetCode_files/avatar_1665307948.png" alt="avatar" class="h-6 w-6 rounded-full object-cover"></div></div></button></div></div></div></div></nav><div class="flex w-full flex-grow overflow-y-hidden"><div id="qd-content" class="h-full w-full bg-layer-bg dark:bg-dark-layer-bg flex min-w-[770px]"><div class="h-full flex-col ssg__qd-splitter-primary-w" style="width: calc(39.0467% - 4px);"><div class="relative flex h-full flex-col"><div class="min-h-0 flex-grow" style="height: 100%;"><div class="flex h-full flex-col"><div><div class="flex h-11 w-full items-center pt-2"><div class="flex flex-row space-x-2 overflow-x-auto overflow-y-hidden" style="overflow-x: hidden;"><a href="https://leetcode.com/problems/combinations/description"><div class="flex flex-1 select-none justify-center whitespace-nowrap rounded-t-[5px] py-[10px] text-xs cursor-pointer text-label-2 dark:text-dark-label-2 px-5">Description</div></a><a href="https://leetcode.com/problems/combinations/editorial"><div class="flex flex-1 select-none justify-center whitespace-nowrap rounded-t-[5px] py-[10px] text-xs cursor-pointer text-label-2 dark:text-dark-label-2 px-5"><div class="flex items-center gap-1.5"><div class="h-3 w-3 text-brand-orange dark:text-dark-brand-orange"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor" class="h-full w-full"><path fill-rule="evenodd" d="M7 8v2H6a3 3 0 00-3 3v6a3 3 0 003 3h12a3 3 0 003-3v-6a3 3 0 00-3-3h-1V8A5 5 0 007 8zm8 0v2H9V8a3 3 0 116 0zm-3 6a2 2 0 100 4 2 2 0 000-4z" clip-rule="evenodd"></path></svg></div>Editorial</div></div></a><a href="https://leetcode.com/problems/combinations/solutions"><div class="flex flex-1 select-none justify-center whitespace-nowrap rounded-t-[5px] py-[10px] text-xs bg-layer-1 dark:bg-dark-layer-1 text-label-1 dark:text-dark-label-1 px-5">Solutions (2.9K)</div></a><a href="https://leetcode.com/problems/combinations/submissions"><div class="flex flex-1 select-none justify-center whitespace-nowrap rounded-t-[5px] py-[10px] text-xs cursor-pointer text-label-2 dark:text-dark-label-2 px-5">Submissions</div></a></div></div></div><div class="flex h-full w-full overflow-y-auto"><div class="flex h-full w-full flex-col overflow-auto bg-layer-1 dark:bg-dark-layer-1"><div class="flex h-full w-full flex-col overflow-auto"><div class="w-full"></div><div class="flex flex-col gap-4 px-5 pt-5 pb-2"><div class="flex items-center justify-between gap-2.5"><div class="flex w-full items-center gap-2.5"><div class="relative rounded-md input_input-container__SZzNg w-full"><input class="block w-full leading-5 outline-none placeholder:text-label-4 dark:placeholder:text-dark-label-4 border-none py-1.5 text-label-2 dark:text-dark-label-2 bg-fill-3 dark:bg-dark-fill-3 focus:bg-fill-2 dark:focus:bg-dark-fill-2 pl-3 pr-12 rounded-lg" autocomplete="off" type="text" placeholder="Search" value=""><div class="absolute inset-y-0 flex items-center pl-3 pointer-events-none right-4"><span class="text-gray-6 dark:text-dark-gray-6"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor" class="w-4 h-4"><path fill-rule="evenodd" d="M5.527 5.527a7.5 7.5 0 0111.268 9.852l3.581 3.583a1 1 0 01-1.414 1.415l-3.582-3.583A7.501 7.501 0 015.527 5.527zm1.414 1.414a5.5 5.5 0 107.779 7.779A5.5 5.5 0 006.94 6.94z" clip-rule="evenodd"></path></svg></span></div></div></div><div class="flex items-center gap-2.5"><div class="relative" data-headlessui-state=""><button class="flex items-center px-3 py-1.5 text-left cursor-pointer focus:outline-none whitespace-nowrap leading-5 bg-fill-3 dark:bg-dark-fill-3 text-label-2 dark:text-dark-label-2 hover:bg-fill-2 dark:hover:bg-dark-fill-2 active:bg-fill-3 dark:active:bg-dark-fill-3 rounded-lg" id="headlessui-popover-button-:r1t9:" type="button" data-headlessui-state="" aria-expanded="false"><div class="text- flex items-center gap-1.5">Tags</div><div class="w-4.5 h-4.5 flex items-center ml-3 pointer-events-none transition duration-300 text-label-3 dark:text-dark-label-3 text-base" aria-hidden="true"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor"><path fill-rule="evenodd" d="M4.929 7.913l7.078 7.057 7.064-7.057a1 1 0 111.414 1.414l-7.77 7.764a1 1 0 01-1.415 0L3.515 9.328a1 1 0 011.414-1.414z" clip-rule="evenodd"></path></svg></div></button></div><div class="relative" data-headlessui-state=""><button class="flex items-center px-3 py-1.5 text-left cursor-pointer focus:outline-none whitespace-nowrap leading-5 bg-fill-3 dark:bg-dark-fill-3 text-label-2 dark:text-dark-label-2 hover:bg-fill-2 dark:hover:bg-dark-fill-2 active:bg-fill-3 dark:active:bg-dark-fill-3 rounded-lg" id="headlessui-menu-button-:r1tc:" type="button" aria-haspopup="true" data-headlessui-state="" aria-expanded="false">Sort by<div class="w-4.5 h-4.5 flex items-center ml-3 pointer-events-none transition duration-300 text-label-3 dark:text-dark-label-3 text-base" aria-hidden="true"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor"><path fill-rule="evenodd" d="M4.929 7.913l7.078 7.057 7.064-7.057a1 1 0 111.414 1.414l-7.77 7.764a1 1 0 01-1.415 0L3.515 9.328a1 1 0 011.414-1.414z" clip-rule="evenodd"></path></svg></div></button></div><a><button class="whitespace-nowrap transition-all focus:outline-none cursor-not-allowed opacity-50 text-label-r bg-green-s dark:bg-dark-green-s hover:bg-green-3 dark:hover:bg-dark-green-3 flex items-center justify-center gap-1 rounded-lg py-[5px] px-3 text-sm font-medium leading-[22px]"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor" class="h-4 w-4"><path fill-rule="evenodd" d="M13 11h7a1 1 0 110 2h-7v7a1 1 0 11-2 0v-7H4a1 1 0 110-2h7V4a1 1 0 112 0v7z" clip-rule="evenodd"></path></svg>Solution</button></a></div></div></div><div class="relative transition-opacity"><div class="absolute h-full w-full hidden"></div><div class="flex w-full flex-col py-3"><div class="relative flex w-full gap-4 px-5 py-3 transition-[background] duration-500"><a target="_blank" rel="noopener noreferrer" class="no-underline hover:text-blue-s dark:hover:text-dark-blue-s truncate h-8 min-h-[32px] w-8 min-w-[32px]" href="https://leetcode.com/uselessstooge/"><img src="./Combinations - LeetCode_files/avatar_1668342586.png" alt="" class="rounded-1/2 object-cover h-full w-full rounded-full"></a><div class="flex w-full flex-col gap-1 overflow-hidden"><div class="flex min-w-0 max-w-full items-center gap-2"><div class="overflow-hidden text-ellipsis"><a class="no-underline hover:text-blue-s dark:hover:text-dark-blue-s truncate w-full" href="https://leetcode.com/problems/combinations/solutions/2918583/elegant-unbeaten-backtracking-solution-beats-84-38-typescript/"><div class="truncate text-label-1 dark:text-dark-label-1 hover:text-blue-s dark:hover:text-dark-blue-s text-[16px] font-medium leading-[22px]"><span>Elegant Unbeaten Backtracking Solution | Beats 84.38% | TypeScript</span></div></a></div></div><div class="flex items-center gap-5"><div class="flex items-center gap-1 truncate"><a target="_blank" rel="noopener noreferrer" class="no-underline text-label-2 dark:text-dark-label-2 text-xs font-medium overflow-hidden max-w-[100px] md:max-w-[200px] hover:text-blue-s dark:hover:text-dark-blue-s truncate" href="https://leetcode.com/uselessstooge/">uselessstooge</a></div><div class="flex items-center gap-1.5"><div class="text-label-3 dark:text-dark-label-3 min-w-max text-xs"><span>Dec 16, 2022</span></div></div><div class="flex flex-grow flex-nowrap items-center gap-2 overflow-hidden"><div class="text-label-2 dark:text-dark-label-2 bg-fill-3 dark:bg-dark-fill-3 whitespace-nowrap rounded-[20px] py-[1px] px-2 text-xs">TypeScript</div><div class="text-label-2 dark:text-dark-label-2 bg-fill-3 dark:bg-dark-fill-3 whitespace-nowrap rounded-[20px] py-[1px] px-2 text-xs">Backtracking</div><div class="text-label-2 dark:text-dark-label-2 bg-fill-3 dark:bg-dark-fill-3 whitespace-nowrap rounded-[20px] py-[1px] px-2 text-xs">Greedy</div><div class="text-label-2 dark:text-dark-label-2 bg-fill-3 dark:bg-dark-fill-3 whitespace-nowrap rounded-[20px] py-[1px] px-2 text-xs">Recursion</div><div class="popover-wrapper inline-block" data-headlessui-state=""><div><div id="headlessui-popover-button-:r1tj:" aria-expanded="false" data-headlessui-state=""><span><div class="text-label-2 dark:text-dark-label-2 bg-fill-3 dark:bg-dark-fill-3 whitespace-nowrap rounded-[20px] py-[1px] px-2 text-xs">1+</div></span></div></div></div></div></div><div class="mt-1 flex items-center gap-6"><div class="flex items-center gap-1"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16" width="1em" height="1em" fill="currentColor" class="h-4.5 w-4.5 text-gray-7 dark:text-dark-gray-7"><path fill-rule="evenodd" d="M7.333 8.667v4h1.334v-4h4.288L8 3.299 3.045 8.667h4.288zm-1.333 4C6 13.403 6.597 14 7.333 14h1.334C9.403 14 10 13.403 10 12.667V10h3.716c.872 0 1.326-1.038.735-1.678L8.735 2.129a1 1 0 00-1.47 0L1.55 8.322C.958 8.962 1.412 10 2.284 10H6v2.667z" clip-rule="evenodd"></path></svg><div class="text-label-2 dark:text-dark-label-2 text-xs">1</div></div><div class="flex items-center gap-1"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor" class="h-4.5 w-4.5 text-gray-7 dark:text-dark-gray-7"><path fill-rule="evenodd" d="M1.104 12.444a1 1 0 010-.888c.13-.26.37-.693.722-1.241A18.85 18.85 0 013.88 7.652C6.184 5.176 8.896 3.667 12 3.667s5.816 1.509 8.119 3.985c.79.85 1.475 1.756 2.055 2.663.352.548.593.98.722 1.24a1 1 0 010 .89c-.13.26-.37.692-.722 1.24a18.848 18.848 0 01-2.055 2.663c-2.303 2.476-5.015 3.985-8.119 3.985s-5.816-1.509-8.119-3.985a18.846 18.846 0 01-2.055-2.663c-.352-.548-.593-.98-.722-1.24zm2.406.162a16.87 16.87 0 001.836 2.38c1.959 2.106 4.19 3.347 6.654 3.347 2.465 0 4.695-1.24 6.654-3.347A16.87 16.87 0 0020.86 12a16.871 16.871 0 00-2.206-2.986C16.695 6.908 14.464 5.667 12 5.667c-2.465 0-4.695 1.24-6.654 3.347A16.87 16.87 0 003.14 12c.108.188.232.391.37.607zM12 15.75c-2.06 0-3.727-1.68-3.727-3.75 0-2.07 1.667-3.75 3.727-3.75 2.06 0 3.727 1.68 3.727 3.75 0 2.07-1.667 3.75-3.727 3.75zm0-2c.952 0 1.727-.782 1.727-1.75s-.775-1.75-1.727-1.75c-.952 0-1.727.782-1.727 1.75s.775 1.75 1.727 1.75z" clip-rule="evenodd"></path></svg><div class="text-label-2 dark:text-dark-label-2 text-xs">926</div></div><div class="flex items-center gap-1"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor" class="h-4.5 w-4.5 text-gray-7 dark:text-dark-gray-7"><path fill-rule="evenodd" d="M11.997 21.5a9.5 9.5 0 01-8.49-5.251A9.38 9.38 0 012.5 11.997V11.5c.267-4.88 4.12-8.733 8.945-8.999L12 2.5a9.378 9.378 0 014.25 1.007A9.498 9.498 0 0121.5 12a9.378 9.378 0 01-.856 3.937l.838 4.376a1 1 0 01-1.17 1.17l-4.376-.838a9.381 9.381 0 01-3.939.856zm3.99-2.882l3.254.623-.623-3.253a1 1 0 01.09-.64 7.381 7.381 0 00.792-3.346 7.5 7.5 0 00-4.147-6.708 7.385 7.385 0 00-3.35-.794H11.5c-3.752.208-6.792 3.248-7.002 7.055L4.5 12a7.387 7.387 0 00.794 3.353A7.5 7.5 0 0012 19.5a7.384 7.384 0 003.349-.793 1 1 0 01.639-.09z" clip-rule="evenodd"></path></svg><div class="text-label-2 dark:text-dark-label-2 text-xs">1</div></div></div></div></div><div class="relative flex w-full gap-4 px-5 py-3 transition-[background] duration-500"><a target="_blank" rel="noopener noreferrer" class="no-underline hover:text-blue-s dark:hover:text-dark-blue-s truncate h-8 min-h-[32px] w-8 min-w-[32px]" href="https://leetcode.com/its_vishal_7575/"><img src="./Combinations - LeetCode_files/avatar_1677051910.png" alt="" class="rounded-1/2 object-cover h-full w-full rounded-full"></a><div class="flex w-full flex-col gap-1 overflow-hidden"><div class="flex min-w-0 max-w-full items-center gap-2"><div class="overflow-hidden text-ellipsis"><a class="no-underline hover:text-blue-s dark:hover:text-dark-blue-s truncate w-full" href="https://leetcode.com/problems/combinations/solutions/3214276/best-c-solution-ever-easy-solution-backtracking-one-stop-solution/"><div class="truncate text-label-1 dark:text-dark-label-1 hover:text-blue-s dark:hover:text-dark-blue-s text-[16px] font-medium leading-[22px]"><span>✅☑️ Best C++ Solution Ever || Easy Solution || Backtracking || One Stop Solution.</span></div></a></div></div><div class="flex items-center gap-5"><div class="flex items-center gap-1 truncate"><a target="_blank" rel="noopener noreferrer" class="no-underline text-label-2 dark:text-dark-label-2 text-xs font-medium overflow-hidden max-w-[100px] md:max-w-[200px] hover:text-blue-s dark:hover:text-dark-blue-s truncate" href="https://leetcode.com/its_vishal_7575/">its_vishal_7575</a><div class="h-3 w-3"><img src="./Combinations - LeetCode_files/2022-annual-50.png" alt="50 Days Badge 2022" class="h-full w-full"></div></div><div class="flex items-center gap-1.5"><div class="text-label-3 dark:text-dark-label-3 min-w-max text-xs"><span>Feb 21, 2023</span></div></div><div class="flex flex-grow flex-nowrap items-center gap-2 overflow-hidden"><div class="text-label-2 dark:text-dark-label-2 bg-fill-3 dark:bg-dark-fill-3 whitespace-nowrap rounded-[20px] py-[1px] px-2 text-xs">C++</div><div class="text-label-2 dark:text-dark-label-2 bg-fill-3 dark:bg-dark-fill-3 whitespace-nowrap rounded-[20px] py-[1px] px-2 text-xs">Array</div><div class="text-label-2 dark:text-dark-label-2 bg-fill-3 dark:bg-dark-fill-3 whitespace-nowrap rounded-[20px] py-[1px] px-2 text-xs">Backtracking</div></div></div><div class="mt-1 flex items-center gap-6"><div class="flex items-center gap-1"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16" width="1em" height="1em" fill="currentColor" class="h-4.5 w-4.5 text-gray-7 dark:text-dark-gray-7"><path fill-rule="evenodd" d="M7.333 8.667v4h1.334v-4h4.288L8 3.299 3.045 8.667h4.288zm-1.333 4C6 13.403 6.597 14 7.333 14h1.334C9.403 14 10 13.403 10 12.667V10h3.716c.872 0 1.326-1.038.735-1.678L8.735 2.129a1 1 0 00-1.47 0L1.55 8.322C.958 8.962 1.412 10 2.284 10H6v2.667z" clip-rule="evenodd"></path></svg><div class="text-label-2 dark:text-dark-label-2 text-xs">9</div></div><div class="flex items-center gap-1"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor" class="h-4.5 w-4.5 text-gray-7 dark:text-dark-gray-7"><path fill-rule="evenodd" d="M1.104 12.444a1 1 0 010-.888c.13-.26.37-.693.722-1.241A18.85 18.85 0 013.88 7.652C6.184 5.176 8.896 3.667 12 3.667s5.816 1.509 8.119 3.985c.79.85 1.475 1.756 2.055 2.663.352.548.593.98.722 1.24a1 1 0 010 .89c-.13.26-.37.692-.722 1.24a18.848 18.848 0 01-2.055 2.663c-2.303 2.476-5.015 3.985-8.119 3.985s-5.816-1.509-8.119-3.985a18.846 18.846 0 01-2.055-2.663c-.352-.548-.593-.98-.722-1.24zm2.406.162a16.87 16.87 0 001.836 2.38c1.959 2.106 4.19 3.347 6.654 3.347 2.465 0 4.695-1.24 6.654-3.347A16.87 16.87 0 0020.86 12a16.871 16.871 0 00-2.206-2.986C16.695 6.908 14.464 5.667 12 5.667c-2.465 0-4.695 1.24-6.654 3.347A16.87 16.87 0 003.14 12c.108.188.232.391.37.607zM12 15.75c-2.06 0-3.727-1.68-3.727-3.75 0-2.07 1.667-3.75 3.727-3.75 2.06 0 3.727 1.68 3.727 3.75 0 2.07-1.667 3.75-3.727 3.75zm0-2c.952 0 1.727-.782 1.727-1.75s-.775-1.75-1.727-1.75c-.952 0-1.727.782-1.727 1.75s.775 1.75 1.727 1.75z" clip-rule="evenodd"></path></svg><div class="text-label-2 dark:text-dark-label-2 text-xs">490</div></div><div class="flex items-center gap-1"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor" class="h-4.5 w-4.5 text-gray-7 dark:text-dark-gray-7"><path fill-rule="evenodd" d="M11.997 21.5a9.5 9.5 0 01-8.49-5.251A9.38 9.38 0 012.5 11.997V11.5c.267-4.88 4.12-8.733 8.945-8.999L12 2.5a9.378 9.378 0 014.25 1.007A9.498 9.498 0 0121.5 12a9.378 9.378 0 01-.856 3.937l.838 4.376a1 1 0 01-1.17 1.17l-4.376-.838a9.381 9.381 0 01-3.939.856zm3.99-2.882l3.254.623-.623-3.253a1 1 0 01.09-.64 7.381 7.381 0 00.792-3.346 7.5 7.5 0 00-4.147-6.708 7.385 7.385 0 00-3.35-.794H11.5c-3.752.208-6.792 3.248-7.002 7.055L4.5 12a7.387 7.387 0 00.794 3.353A7.5 7.5 0 0012 19.5a7.384 7.384 0 003.349-.793 1 1 0 01.639-.09z" clip-rule="evenodd"></path></svg><div class="text-label-2 dark:text-dark-label-2 text-xs">0</div></div></div></div></div><div class="relative flex w-full gap-4 px-5 py-3 transition-[background] duration-500"><a target="_blank" rel="noopener noreferrer" class="no-underline hover:text-blue-s dark:hover:text-dark-blue-s truncate h-8 min-h-[32px] w-8 min-w-[32px]" href="https://leetcode.com/tbekpro/"><img src="./Combinations - LeetCode_files/avatar_1673852841.png" alt="" class="rounded-1/2 object-cover h-full w-full rounded-full"></a><div class="flex w-full flex-col gap-1 overflow-hidden"><div class="flex min-w-0 max-w-full items-center gap-2"><div class="overflow-hidden text-ellipsis"><a class="no-underline hover:text-blue-s dark:hover:text-dark-blue-s truncate w-full" href="https://leetcode.com/problems/combinations/solutions/3139162/java-backtracking-solution/"><div class="truncate text-label-1 dark:text-dark-label-1 hover:text-blue-s dark:hover:text-dark-blue-s text-[16px] font-medium leading-[22px]"><span>✔️ Java Backtracking Solution</span></div></a></div></div><div class="flex items-center gap-5"><div class="flex items-center gap-1 truncate"><a target="_blank" rel="noopener noreferrer" class="no-underline text-label-2 dark:text-dark-label-2 text-xs font-medium overflow-hidden max-w-[100px] md:max-w-[200px] hover:text-blue-s dark:hover:text-dark-blue-s truncate" href="https://leetcode.com/tbekpro/">tbekpro</a><div class="h-3 w-3"><img src="./Combinations - LeetCode_files/入门.png" alt="Level 1" class="h-full w-full"></div></div><div class="flex items-center gap-1.5"><div class="text-label-3 dark:text-dark-label-3 min-w-max text-xs"><span>Feb 04, 2023</span></div></div><div class="flex flex-grow flex-nowrap items-center gap-2 overflow-hidden"><div class="text-label-2 dark:text-dark-label-2 bg-fill-3 dark:bg-dark-fill-3 whitespace-nowrap rounded-[20px] py-[1px] px-2 text-xs">Java</div></div></div><div class="mt-1 flex items-center gap-6"><div class="flex items-center gap-1"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16" width="1em" height="1em" fill="currentColor" class="h-4.5 w-4.5 text-gray-7 dark:text-dark-gray-7"><path fill-rule="evenodd" d="M7.333 8.667v4h1.334v-4h4.288L8 3.299 3.045 8.667h4.288zm-1.333 4C6 13.403 6.597 14 7.333 14h1.334C9.403 14 10 13.403 10 12.667V10h3.716c.872 0 1.326-1.038.735-1.678L8.735 2.129a1 1 0 00-1.47 0L1.55 8.322C.958 8.962 1.412 10 2.284 10H6v2.667z" clip-rule="evenodd"></path></svg><div class="text-label-2 dark:text-dark-label-2 text-xs">1</div></div><div class="flex items-center gap-1"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor" class="h-4.5 w-4.5 text-gray-7 dark:text-dark-gray-7"><path fill-rule="evenodd" d="M1.104 12.444a1 1 0 010-.888c.13-.26.37-.693.722-1.241A18.85 18.85 0 013.88 7.652C6.184 5.176 8.896 3.667 12 3.667s5.816 1.509 8.119 3.985c.79.85 1.475 1.756 2.055 2.663.352.548.593.98.722 1.24a1 1 0 010 .89c-.13.26-.37.692-.722 1.24a18.848 18.848 0 01-2.055 2.663c-2.303 2.476-5.015 3.985-8.119 3.985s-5.816-1.509-8.119-3.985a18.846 18.846 0 01-2.055-2.663c-.352-.548-.593-.98-.722-1.24zm2.406.162a16.87 16.87 0 001.836 2.38c1.959 2.106 4.19 3.347 6.654 3.347 2.465 0 4.695-1.24 6.654-3.347A16.87 16.87 0 0020.86 12a16.871 16.871 0 00-2.206-2.986C16.695 6.908 14.464 5.667 12 5.667c-2.465 0-4.695 1.24-6.654 3.347A16.87 16.87 0 003.14 12c.108.188.232.391.37.607zM12 15.75c-2.06 0-3.727-1.68-3.727-3.75 0-2.07 1.667-3.75 3.727-3.75 2.06 0 3.727 1.68 3.727 3.75 0 2.07-1.667 3.75-3.727 3.75zm0-2c.952 0 1.727-.782 1.727-1.75s-.775-1.75-1.727-1.75c-.952 0-1.727.782-1.727 1.75s.775 1.75 1.727 1.75z" clip-rule="evenodd"></path></svg><div class="text-label-2 dark:text-dark-label-2 text-xs">388</div></div><div class="flex items-center gap-1"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor" class="h-4.5 w-4.5 text-gray-7 dark:text-dark-gray-7"><path fill-rule="evenodd" d="M11.997 21.5a9.5 9.5 0 01-8.49-5.251A9.38 9.38 0 012.5 11.997V11.5c.267-4.88 4.12-8.733 8.945-8.999L12 2.5a9.378 9.378 0 014.25 1.007A9.498 9.498 0 0121.5 12a9.378 9.378 0 01-.856 3.937l.838 4.376a1 1 0 01-1.17 1.17l-4.376-.838a9.381 9.381 0 01-3.939.856zm3.99-2.882l3.254.623-.623-3.253a1 1 0 01.09-.64 7.381 7.381 0 00.792-3.346 7.5 7.5 0 00-4.147-6.708 7.385 7.385 0 00-3.35-.794H11.5c-3.752.208-6.792 3.248-7.002 7.055L4.5 12a7.387 7.387 0 00.794 3.353A7.5 7.5 0 0012 19.5a7.384 7.384 0 003.349-.793 1 1 0 01.639-.09z" clip-rule="evenodd"></path></svg><div class="text-label-2 dark:text-dark-label-2 text-xs">0</div></div></div></div></div><div class="relative flex w-full gap-4 px-5 py-3 transition-[background] duration-500"><a target="_blank" rel="noopener noreferrer" class="no-underline hover:text-blue-s dark:hover:text-dark-blue-s truncate h-8 min-h-[32px] w-8 min-w-[32px]" href="https://leetcode.com/CEOSRICHARAN/"><img src="./Combinations - LeetCode_files/avatar_1652461563.png" alt="" class="rounded-1/2 object-cover h-full w-full rounded-full"></a><div class="flex w-full flex-col gap-1 overflow-hidden"><div class="flex min-w-0 max-w-full items-center gap-2"><div class="overflow-hidden text-ellipsis"><a class="no-underline hover:text-blue-s dark:hover:text-dark-blue-s truncate w-full" href="https://leetcode.com/problems/combinations/solutions/3086884/java-solution/"><div class="truncate text-label-1 dark:text-dark-label-1 hover:text-blue-s dark:hover:text-dark-blue-s text-[16px] font-medium leading-[22px]"><span>Java Solution</span></div></a></div></div><div class="flex items-center gap-5"><div class="flex items-center gap-1 truncate"><a target="_blank" rel="noopener noreferrer" class="no-underline text-label-2 dark:text-dark-label-2 text-xs font-medium overflow-hidden max-w-[100px] md:max-w-[200px] hover:text-blue-s dark:hover:text-dark-blue-s truncate" href="https://leetcode.com/CEOSRICHARAN/">CEOSRICHARAN</a><div class="h-3 w-3"><img src="./Combinations - LeetCode_files/2022-annual-100.png" alt="100 Days Badge 2022" class="h-full w-full"></div></div><div class="flex items-center gap-1.5"><div class="text-label-3 dark:text-dark-label-3 min-w-max text-xs"><span>Jan 22, 2023</span></div></div><div class="flex flex-grow flex-nowrap items-center gap-2 overflow-hidden"><div class="text-label-2 dark:text-dark-label-2 bg-fill-3 dark:bg-dark-fill-3 whitespace-nowrap rounded-[20px] py-[1px] px-2 text-xs">Java</div></div></div><div class="mt-1 flex items-center gap-6"><div class="flex items-center gap-1"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16" width="1em" height="1em" fill="currentColor" class="h-4.5 w-4.5 text-gray-7 dark:text-dark-gray-7"><path fill-rule="evenodd" d="M7.333 8.667v4h1.334v-4h4.288L8 3.299 3.045 8.667h4.288zm-1.333 4C6 13.403 6.597 14 7.333 14h1.334C9.403 14 10 13.403 10 12.667V10h3.716c.872 0 1.326-1.038.735-1.678L8.735 2.129a1 1 0 00-1.47 0L1.55 8.322C.958 8.962 1.412 10 2.284 10H6v2.667z" clip-rule="evenodd"></path></svg><div class="text-label-2 dark:text-dark-label-2 text-xs">1</div></div><div class="flex items-center gap-1"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor" class="h-4.5 w-4.5 text-gray-7 dark:text-dark-gray-7"><path fill-rule="evenodd" d="M1.104 12.444a1 1 0 010-.888c.13-.26.37-.693.722-1.241A18.85 18.85 0 013.88 7.652C6.184 5.176 8.896 3.667 12 3.667s5.816 1.509 8.119 3.985c.79.85 1.475 1.756 2.055 2.663.352.548.593.98.722 1.24a1 1 0 010 .89c-.13.26-.37.692-.722 1.24a18.848 18.848 0 01-2.055 2.663c-2.303 2.476-5.015 3.985-8.119 3.985s-5.816-1.509-8.119-3.985a18.846 18.846 0 01-2.055-2.663c-.352-.548-.593-.98-.722-1.24zm2.406.162a16.87 16.87 0 001.836 2.38c1.959 2.106 4.19 3.347 6.654 3.347 2.465 0 4.695-1.24 6.654-3.347A16.87 16.87 0 0020.86 12a16.871 16.871 0 00-2.206-2.986C16.695 6.908 14.464 5.667 12 5.667c-2.465 0-4.695 1.24-6.654 3.347A16.87 16.87 0 003.14 12c.108.188.232.391.37.607zM12 15.75c-2.06 0-3.727-1.68-3.727-3.75 0-2.07 1.667-3.75 3.727-3.75 2.06 0 3.727 1.68 3.727 3.75 0 2.07-1.667 3.75-3.727 3.75zm0-2c.952 0 1.727-.782 1.727-1.75s-.775-1.75-1.727-1.75c-.952 0-1.727.782-1.727 1.75s.775 1.75 1.727 1.75z" clip-rule="evenodd"></path></svg><div class="text-label-2 dark:text-dark-label-2 text-xs">493</div></div><div class="flex items-center gap-1"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor" class="h-4.5 w-4.5 text-gray-7 dark:text-dark-gray-7"><path fill-rule="evenodd" d="M11.997 21.5a9.5 9.5 0 01-8.49-5.251A9.38 9.38 0 012.5 11.997V11.5c.267-4.88 4.12-8.733 8.945-8.999L12 2.5a9.378 9.378 0 014.25 1.007A9.498 9.498 0 0121.5 12a9.378 9.378 0 01-.856 3.937l.838 4.376a1 1 0 01-1.17 1.17l-4.376-.838a9.381 9.381 0 01-3.939.856zm3.99-2.882l3.254.623-.623-3.253a1 1 0 01.09-.64 7.381 7.381 0 00.792-3.346 7.5 7.5 0 00-4.147-6.708 7.385 7.385 0 00-3.35-.794H11.5c-3.752.208-6.792 3.248-7.002 7.055L4.5 12a7.387 7.387 0 00.794 3.353A7.5 7.5 0 0012 19.5a7.384 7.384 0 003.349-.793 1 1 0 01.639-.09z" clip-rule="evenodd"></path></svg><div class="text-label-2 dark:text-dark-label-2 text-xs">1</div></div></div></div></div><div class="relative flex w-full gap-4 px-5 py-3 transition-[background] duration-500"><a target="_blank" rel="noopener noreferrer" class="no-underline hover:text-blue-s dark:hover:text-dark-blue-s truncate h-8 min-h-[32px] w-8 min-w-[32px]" href="https://leetcode.com/Anim3_sh/"><img src="./Combinations - LeetCode_files/default_avatar.jpg" alt="" class="rounded-1/2 object-cover h-full w-full rounded-full"></a><div class="flex w-full flex-col gap-1 overflow-hidden"><div class="flex min-w-0 max-w-full items-center gap-2"><div class="overflow-hidden text-ellipsis"><a class="no-underline hover:text-blue-s dark:hover:text-dark-blue-s truncate w-full" href="https://leetcode.com/problems/combinations/solutions/3112007/simple-java-code-with-the-best-explanation/"><div class="truncate text-label-1 dark:text-dark-label-1 hover:text-blue-s dark:hover:text-dark-blue-s text-[16px] font-medium leading-[22px]"><span>Simple Java Code with the best explanation</span></div></a></div></div><div class="flex items-center gap-5"><div class="flex items-center gap-1 truncate"><a target="_blank" rel="noopener noreferrer" class="no-underline text-label-2 dark:text-dark-label-2 text-xs font-medium overflow-hidden max-w-[100px] md:max-w-[200px] hover:text-blue-s dark:hover:text-dark-blue-s truncate" href="https://leetcode.com/Anim3_sh/">Anim3_sh</a><div class="h-3 w-3"><img src="./Combinations - LeetCode_files/dcc-2022-8.png" alt="Aug LeetCoding Challenge" class="h-full w-full"></div></div><div class="flex items-center gap-1.5"><div class="text-label-3 dark:text-dark-label-3 min-w-max text-xs"><span>Jan 29, 2023</span></div></div><div class="flex flex-grow flex-nowrap items-center gap-2 overflow-hidden"><div class="text-label-2 dark:text-dark-label-2 bg-fill-3 dark:bg-dark-fill-3 whitespace-nowrap rounded-[20px] py-[1px] px-2 text-xs">Java</div><div class="text-label-2 dark:text-dark-label-2 bg-fill-3 dark:bg-dark-fill-3 whitespace-nowrap rounded-[20px] py-[1px] px-2 text-xs">Backtracking</div></div></div><div class="mt-1 flex items-center gap-6"><div class="flex items-center gap-1"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16" width="1em" height="1em" fill="currentColor" class="h-4.5 w-4.5 text-gray-7 dark:text-dark-gray-7"><path fill-rule="evenodd" d="M7.333 8.667v4h1.334v-4h4.288L8 3.299 3.045 8.667h4.288zm-1.333 4C6 13.403 6.597 14 7.333 14h1.334C9.403 14 10 13.403 10 12.667V10h3.716c.872 0 1.326-1.038.735-1.678L8.735 2.129a1 1 0 00-1.47 0L1.55 8.322C.958 8.962 1.412 10 2.284 10H6v2.667z" clip-rule="evenodd"></path></svg><div class="text-label-2 dark:text-dark-label-2 text-xs">8</div></div><div class="flex items-center gap-1"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor" class="h-4.5 w-4.5 text-gray-7 dark:text-dark-gray-7"><path fill-rule="evenodd" d="M1.104 12.444a1 1 0 010-.888c.13-.26.37-.693.722-1.241A18.85 18.85 0 013.88 7.652C6.184 5.176 8.896 3.667 12 3.667s5.816 1.509 8.119 3.985c.79.85 1.475 1.756 2.055 2.663.352.548.593.98.722 1.24a1 1 0 010 .89c-.13.26-.37.692-.722 1.24a18.848 18.848 0 01-2.055 2.663c-2.303 2.476-5.015 3.985-8.119 3.985s-5.816-1.509-8.119-3.985a18.846 18.846 0 01-2.055-2.663c-.352-.548-.593-.98-.722-1.24zm2.406.162a16.87 16.87 0 001.836 2.38c1.959 2.106 4.19 3.347 6.654 3.347 2.465 0 4.695-1.24 6.654-3.347A16.87 16.87 0 0020.86 12a16.871 16.871 0 00-2.206-2.986C16.695 6.908 14.464 5.667 12 5.667c-2.465 0-4.695 1.24-6.654 3.347A16.87 16.87 0 003.14 12c.108.188.232.391.37.607zM12 15.75c-2.06 0-3.727-1.68-3.727-3.75 0-2.07 1.667-3.75 3.727-3.75 2.06 0 3.727 1.68 3.727 3.75 0 2.07-1.667 3.75-3.727 3.75zm0-2c.952 0 1.727-.782 1.727-1.75s-.775-1.75-1.727-1.75c-.952 0-1.727.782-1.727 1.75s.775 1.75 1.727 1.75z" clip-rule="evenodd"></path></svg><div class="text-label-2 dark:text-dark-label-2 text-xs">758</div></div><div class="flex items-center gap-1"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor" class="h-4.5 w-4.5 text-gray-7 dark:text-dark-gray-7"><path fill-rule="evenodd" d="M11.997 21.5a9.5 9.5 0 01-8.49-5.251A9.38 9.38 0 012.5 11.997V11.5c.267-4.88 4.12-8.733 8.945-8.999L12 2.5a9.378 9.378 0 014.25 1.007A9.498 9.498 0 0121.5 12a9.378 9.378 0 01-.856 3.937l.838 4.376a1 1 0 01-1.17 1.17l-4.376-.838a9.381 9.381 0 01-3.939.856zm3.99-2.882l3.254.623-.623-3.253a1 1 0 01.09-.64 7.381 7.381 0 00.792-3.346 7.5 7.5 0 00-4.147-6.708 7.385 7.385 0 00-3.35-.794H11.5c-3.752.208-6.792 3.248-7.002 7.055L4.5 12a7.387 7.387 0 00.794 3.353A7.5 7.5 0 0012 19.5a7.384 7.384 0 003.349-.793 1 1 0 01.639-.09z" clip-rule="evenodd"></path></svg><div class="text-label-2 dark:text-dark-label-2 text-xs">1</div></div></div></div></div><div class="relative flex w-full gap-4 px-5 py-3 transition-[background] duration-500"><a target="_blank" rel="noopener noreferrer" class="no-underline hover:text-blue-s dark:hover:text-dark-blue-s truncate h-8 min-h-[32px] w-8 min-w-[32px]" href="https://leetcode.com/Xahoor72/"><img src="./Combinations - LeetCode_files/avatar_1665334240.png" alt="" class="rounded-1/2 object-cover h-full w-full rounded-full"></a><div class="flex w-full flex-col gap-1 overflow-hidden"><div class="flex min-w-0 max-w-full items-center gap-2"><div class="overflow-hidden text-ellipsis"><a class="no-underline hover:text-blue-s dark:hover:text-dark-blue-s truncate w-full" href="https://leetcode.com/problems/combinations/solutions/3097270/simple-c-backtracking-solution-90/"><div class="truncate text-label-1 dark:text-dark-label-1 hover:text-blue-s dark:hover:text-dark-blue-s text-[16px] font-medium leading-[22px]"><span>✅Simple C++ Backtracking Solution|90%✅</span></div></a></div></div><div class="flex items-center gap-5"><div class="flex items-center gap-1 truncate"><a target="_blank" rel="noopener noreferrer" class="no-underline text-label-2 dark:text-dark-label-2 text-xs font-medium overflow-hidden max-w-[100px] md:max-w-[200px] hover:text-blue-s dark:hover:text-dark-blue-s truncate" href="https://leetcode.com/Xahoor72/">Xahoor72</a><div class="h-3 w-3"><img src="./Combinations - LeetCode_files/2022-annual-50.png" alt="50 Days Badge 2022" class="h-full w-full"></div></div><div class="flex items-center gap-1.5"><div class="text-label-3 dark:text-dark-label-3 min-w-max text-xs"><span>Jan 25, 2023</span></div></div><div class="flex flex-grow flex-nowrap items-center gap-2 overflow-hidden"><div class="text-label-2 dark:text-dark-label-2 bg-fill-3 dark:bg-dark-fill-3 whitespace-nowrap rounded-[20px] py-[1px] px-2 text-xs">C++</div><div class="text-label-2 dark:text-dark-label-2 bg-fill-3 dark:bg-dark-fill-3 whitespace-nowrap rounded-[20px] py-[1px] px-2 text-xs">Backtracking</div><div class="text-label-2 dark:text-dark-label-2 bg-fill-3 dark:bg-dark-fill-3 whitespace-nowrap rounded-[20px] py-[1px] px-2 text-xs">Depth-First Search</div><div class="text-label-2 dark:text-dark-label-2 bg-fill-3 dark:bg-dark-fill-3 whitespace-nowrap rounded-[20px] py-[1px] px-2 text-xs">Recursion</div></div></div><div class="mt-1 flex items-center gap-6"><div class="flex items-center gap-1"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16" width="1em" height="1em" fill="currentColor" class="h-4.5 w-4.5 text-gray-7 dark:text-dark-gray-7"><path fill-rule="evenodd" d="M7.333 8.667v4h1.334v-4h4.288L8 3.299 3.045 8.667h4.288zm-1.333 4C6 13.403 6.597 14 7.333 14h1.334C9.403 14 10 13.403 10 12.667V10h3.716c.872 0 1.326-1.038.735-1.678L8.735 2.129a1 1 0 00-1.47 0L1.55 8.322C.958 8.962 1.412 10 2.284 10H6v2.667z" clip-rule="evenodd"></path></svg><div class="text-label-2 dark:text-dark-label-2 text-xs">10</div></div><div class="flex items-center gap-1"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor" class="h-4.5 w-4.5 text-gray-7 dark:text-dark-gray-7"><path fill-rule="evenodd" d="M1.104 12.444a1 1 0 010-.888c.13-.26.37-.693.722-1.241A18.85 18.85 0 013.88 7.652C6.184 5.176 8.896 3.667 12 3.667s5.816 1.509 8.119 3.985c.79.85 1.475 1.756 2.055 2.663.352.548.593.98.722 1.24a1 1 0 010 .89c-.13.26-.37.692-.722 1.24a18.848 18.848 0 01-2.055 2.663c-2.303 2.476-5.015 3.985-8.119 3.985s-5.816-1.509-8.119-3.985a18.846 18.846 0 01-2.055-2.663c-.352-.548-.593-.98-.722-1.24zm2.406.162a16.87 16.87 0 001.836 2.38c1.959 2.106 4.19 3.347 6.654 3.347 2.465 0 4.695-1.24 6.654-3.347A16.87 16.87 0 0020.86 12a16.871 16.871 0 00-2.206-2.986C16.695 6.908 14.464 5.667 12 5.667c-2.465 0-4.695 1.24-6.654 3.347A16.87 16.87 0 003.14 12c.108.188.232.391.37.607zM12 15.75c-2.06 0-3.727-1.68-3.727-3.75 0-2.07 1.667-3.75 3.727-3.75 2.06 0 3.727 1.68 3.727 3.75 0 2.07-1.667 3.75-3.727 3.75zm0-2c.952 0 1.727-.782 1.727-1.75s-.775-1.75-1.727-1.75c-.952 0-1.727.782-1.727 1.75s.775 1.75 1.727 1.75z" clip-rule="evenodd"></path></svg><div class="text-label-2 dark:text-dark-label-2 text-xs">981</div></div><div class="flex items-center gap-1"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor" class="h-4.5 w-4.5 text-gray-7 dark:text-dark-gray-7"><path fill-rule="evenodd" d="M11.997 21.5a9.5 9.5 0 01-8.49-5.251A9.38 9.38 0 012.5 11.997V11.5c.267-4.88 4.12-8.733 8.945-8.999L12 2.5a9.378 9.378 0 014.25 1.007A9.498 9.498 0 0121.5 12a9.378 9.378 0 01-.856 3.937l.838 4.376a1 1 0 01-1.17 1.17l-4.376-.838a9.381 9.381 0 01-3.939.856zm3.99-2.882l3.254.623-.623-3.253a1 1 0 01.09-.64 7.381 7.381 0 00.792-3.346 7.5 7.5 0 00-4.147-6.708 7.385 7.385 0 00-3.35-.794H11.5c-3.752.208-6.792 3.248-7.002 7.055L4.5 12a7.387 7.387 0 00.794 3.353A7.5 7.5 0 0012 19.5a7.384 7.384 0 003.349-.793 1 1 0 01.639-.09z" clip-rule="evenodd"></path></svg><div class="text-label-2 dark:text-dark-label-2 text-xs">1</div></div></div></div></div><div class="relative flex w-full gap-4 px-5 py-3 transition-[background] duration-500"><a target="_blank" rel="noopener noreferrer" class="no-underline hover:text-blue-s dark:hover:text-dark-blue-s truncate h-8 min-h-[32px] w-8 min-w-[32px]" href="https://leetcode.com/kshzz_24/"><img src="./Combinations - LeetCode_files/avatar_1671033901.png" alt="" class="rounded-1/2 object-cover h-full w-full rounded-full"></a><div class="flex w-full flex-col gap-1 overflow-hidden"><div class="flex min-w-0 max-w-full items-center gap-2"><div class="overflow-hidden text-ellipsis"><a class="no-underline hover:text-blue-s dark:hover:text-dark-blue-s truncate w-full" href="https://leetcode.com/problems/combinations/solutions/3198613/c-2-different-approaches-easy-explanation-clean-code/"><div class="truncate text-label-1 dark:text-dark-label-1 hover:text-blue-s dark:hover:text-dark-blue-s text-[16px] font-medium leading-[22px]"><span>[C++] | 2 Different Approaches | Easy Explanation | Clean Code</span></div></a></div></div><div class="flex items-center gap-5"><div class="flex items-center gap-1 truncate"><a target="_blank" rel="noopener noreferrer" class="no-underline text-label-2 dark:text-dark-label-2 text-xs font-medium overflow-hidden max-w-[100px] md:max-w-[200px] hover:text-blue-s dark:hover:text-dark-blue-s truncate" href="https://leetcode.com/kshzz_24/">kshzz_24</a><div class="h-3 w-3"><img src="./Combinations - LeetCode_files/2022-annual-100.png" alt="100 Days Badge 2022" class="h-full w-full"></div></div><div class="flex items-center gap-1.5"><div class="text-label-3 dark:text-dark-label-3 min-w-max text-xs"><span>Feb 18, 2023</span></div></div><div class="flex flex-grow flex-nowrap items-center gap-2 overflow-hidden"><div class="text-label-2 dark:text-dark-label-2 bg-fill-3 dark:bg-dark-fill-3 whitespace-nowrap rounded-[20px] py-[1px] px-2 text-xs">C++</div><div class="text-label-2 dark:text-dark-label-2 bg-fill-3 dark:bg-dark-fill-3 whitespace-nowrap rounded-[20px] py-[1px] px-2 text-xs">Backtracking</div></div></div><div class="mt-1 flex items-center gap-6"><div class="flex items-center gap-1"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16" width="1em" height="1em" fill="currentColor" class="h-4.5 w-4.5 text-gray-7 dark:text-dark-gray-7"><path fill-rule="evenodd" d="M7.333 8.667v4h1.334v-4h4.288L8 3.299 3.045 8.667h4.288zm-1.333 4C6 13.403 6.597 14 7.333 14h1.334C9.403 14 10 13.403 10 12.667V10h3.716c.872 0 1.326-1.038.735-1.678L8.735 2.129a1 1 0 00-1.47 0L1.55 8.322C.958 8.962 1.412 10 2.284 10H6v2.667z" clip-rule="evenodd"></path></svg><div class="text-label-2 dark:text-dark-label-2 text-xs">4</div></div><div class="flex items-center gap-1"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor" class="h-4.5 w-4.5 text-gray-7 dark:text-dark-gray-7"><path fill-rule="evenodd" d="M1.104 12.444a1 1 0 010-.888c.13-.26.37-.693.722-1.241A18.85 18.85 0 013.88 7.652C6.184 5.176 8.896 3.667 12 3.667s5.816 1.509 8.119 3.985c.79.85 1.475 1.756 2.055 2.663.352.548.593.98.722 1.24a1 1 0 010 .89c-.13.26-.37.692-.722 1.24a18.848 18.848 0 01-2.055 2.663c-2.303 2.476-5.015 3.985-8.119 3.985s-5.816-1.509-8.119-3.985a18.846 18.846 0 01-2.055-2.663c-.352-.548-.593-.98-.722-1.24zm2.406.162a16.87 16.87 0 001.836 2.38c1.959 2.106 4.19 3.347 6.654 3.347 2.465 0 4.695-1.24 6.654-3.347A16.87 16.87 0 0020.86 12a16.871 16.871 0 00-2.206-2.986C16.695 6.908 14.464 5.667 12 5.667c-2.465 0-4.695 1.24-6.654 3.347A16.87 16.87 0 003.14 12c.108.188.232.391.37.607zM12 15.75c-2.06 0-3.727-1.68-3.727-3.75 0-2.07 1.667-3.75 3.727-3.75 2.06 0 3.727 1.68 3.727 3.75 0 2.07-1.667 3.75-3.727 3.75zm0-2c.952 0 1.727-.782 1.727-1.75s-.775-1.75-1.727-1.75c-.952 0-1.727.782-1.727 1.75s.775 1.75 1.727 1.75z" clip-rule="evenodd"></path></svg><div class="text-label-2 dark:text-dark-label-2 text-xs">350</div></div><div class="flex items-center gap-1"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor" class="h-4.5 w-4.5 text-gray-7 dark:text-dark-gray-7"><path fill-rule="evenodd" d="M11.997 21.5a9.5 9.5 0 01-8.49-5.251A9.38 9.38 0 012.5 11.997V11.5c.267-4.88 4.12-8.733 8.945-8.999L12 2.5a9.378 9.378 0 014.25 1.007A9.498 9.498 0 0121.5 12a9.378 9.378 0 01-.856 3.937l.838 4.376a1 1 0 01-1.17 1.17l-4.376-.838a9.381 9.381 0 01-3.939.856zm3.99-2.882l3.254.623-.623-3.253a1 1 0 01.09-.64 7.381 7.381 0 00.792-3.346 7.5 7.5 0 00-4.147-6.708 7.385 7.385 0 00-3.35-.794H11.5c-3.752.208-6.792 3.248-7.002 7.055L4.5 12a7.387 7.387 0 00.794 3.353A7.5 7.5 0 0012 19.5a7.384 7.384 0 003.349-.793 1 1 0 01.639-.09z" clip-rule="evenodd"></path></svg><div class="text-label-2 dark:text-dark-label-2 text-xs">0</div></div></div></div></div><div class="relative flex w-full gap-4 px-5 py-3 transition-[background] duration-500"><a target="_blank" rel="noopener noreferrer" class="no-underline hover:text-blue-s dark:hover:text-dark-blue-s truncate h-8 min-h-[32px] w-8 min-w-[32px]" href="https://leetcode.com/thisisakshat/"><img src="./Combinations - LeetCode_files/default_avatar.jpg" alt="" class="rounded-1/2 object-cover h-full w-full rounded-full"></a><div class="flex w-full flex-col gap-1 overflow-hidden"><div class="flex min-w-0 max-w-full items-center gap-2"><div class="overflow-hidden text-ellipsis"><a class="no-underline hover:text-blue-s dark:hover:text-dark-blue-s truncate w-full" href="https://leetcode.com/problems/combinations/solutions/1141903/clear-and-simple-explanation-with-intuition-100-faster/"><div class="truncate text-label-1 dark:text-dark-label-1 hover:text-blue-s dark:hover:text-dark-blue-s text-[16px] font-medium leading-[22px]"><span>Clear and simple explanation with intuition: 100% faster</span></div></a></div></div><div class="flex items-center gap-5"><div class="flex items-center gap-1 truncate"><a target="_blank" rel="noopener noreferrer" class="no-underline text-label-2 dark:text-dark-label-2 text-xs font-medium overflow-hidden max-w-[100px] md:max-w-[200px] hover:text-blue-s dark:hover:text-dark-blue-s truncate" href="https://leetcode.com/thisisakshat/">thisisakshat</a><div class="h-3 w-3"><img src="./Combinations - LeetCode_files/dcc-2022-2.png" alt="Feb LeetCoding Challenge" class="h-full w-full"></div></div><div class="flex items-center gap-1.5"><div class="text-label-3 dark:text-dark-label-3 min-w-max text-xs"><span>Apr 04, 2021</span></div></div><div class="flex flex-grow flex-nowrap items-center gap-2 overflow-hidden"><div class="text-label-2 dark:text-dark-label-2 bg-fill-3 dark:bg-dark-fill-3 whitespace-nowrap rounded-[20px] py-[1px] px-2 text-xs">C++</div><div class="text-label-2 dark:text-dark-label-2 bg-fill-3 dark:bg-dark-fill-3 whitespace-nowrap rounded-[20px] py-[1px] px-2 text-xs">C</div><div class="text-label-2 dark:text-dark-label-2 bg-fill-3 dark:bg-dark-fill-3 whitespace-nowrap rounded-[20px] py-[1px] px-2 text-xs">Backtracking</div><div class="text-label-2 dark:text-dark-label-2 bg-fill-3 dark:bg-dark-fill-3 whitespace-nowrap rounded-[20px] py-[1px] px-2 text-xs">Recursion</div></div></div><div class="mt-1 flex items-center gap-6"><div class="flex items-center gap-1"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16" width="1em" height="1em" fill="currentColor" class="h-4.5 w-4.5 text-gray-7 dark:text-dark-gray-7"><path fill-rule="evenodd" d="M7.333 8.667v4h1.334v-4h4.288L8 3.299 3.045 8.667h4.288zm-1.333 4C6 13.403 6.597 14 7.333 14h1.334C9.403 14 10 13.403 10 12.667V10h3.716c.872 0 1.326-1.038.735-1.678L8.735 2.129a1 1 0 00-1.47 0L1.55 8.322C.958 8.962 1.412 10 2.284 10H6v2.667z" clip-rule="evenodd"></path></svg><div class="text-label-2 dark:text-dark-label-2 text-xs">143</div></div><div class="flex items-center gap-1"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor" class="h-4.5 w-4.5 text-gray-7 dark:text-dark-gray-7"><path fill-rule="evenodd" d="M1.104 12.444a1 1 0 010-.888c.13-.26.37-.693.722-1.241A18.85 18.85 0 013.88 7.652C6.184 5.176 8.896 3.667 12 3.667s5.816 1.509 8.119 3.985c.79.85 1.475 1.756 2.055 2.663.352.548.593.98.722 1.24a1 1 0 010 .89c-.13.26-.37.692-.722 1.24a18.848 18.848 0 01-2.055 2.663c-2.303 2.476-5.015 3.985-8.119 3.985s-5.816-1.509-8.119-3.985a18.846 18.846 0 01-2.055-2.663c-.352-.548-.593-.98-.722-1.24zm2.406.162a16.87 16.87 0 001.836 2.38c1.959 2.106 4.19 3.347 6.654 3.347 2.465 0 4.695-1.24 6.654-3.347A16.87 16.87 0 0020.86 12a16.871 16.871 0 00-2.206-2.986C16.695 6.908 14.464 5.667 12 5.667c-2.465 0-4.695 1.24-6.654 3.347A16.87 16.87 0 003.14 12c.108.188.232.391.37.607zM12 15.75c-2.06 0-3.727-1.68-3.727-3.75 0-2.07 1.667-3.75 3.727-3.75 2.06 0 3.727 1.68 3.727 3.75 0 2.07-1.667 3.75-3.727 3.75zm0-2c.952 0 1.727-.782 1.727-1.75s-.775-1.75-1.727-1.75c-.952 0-1.727.782-1.727 1.75s.775 1.75 1.727 1.75z" clip-rule="evenodd"></path></svg><div class="text-label-2 dark:text-dark-label-2 text-xs">8K</div></div><div class="flex items-center gap-1"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor" class="h-4.5 w-4.5 text-gray-7 dark:text-dark-gray-7"><path fill-rule="evenodd" d="M11.997 21.5a9.5 9.5 0 01-8.49-5.251A9.38 9.38 0 012.5 11.997V11.5c.267-4.88 4.12-8.733 8.945-8.999L12 2.5a9.378 9.378 0 014.25 1.007A9.498 9.498 0 0121.5 12a9.378 9.378 0 01-.856 3.937l.838 4.376a1 1 0 01-1.17 1.17l-4.376-.838a9.381 9.381 0 01-3.939.856zm3.99-2.882l3.254.623-.623-3.253a1 1 0 01.09-.64 7.381 7.381 0 00.792-3.346 7.5 7.5 0 00-4.147-6.708 7.385 7.385 0 00-3.35-.794H11.5c-3.752.208-6.792 3.248-7.002 7.055L4.5 12a7.387 7.387 0 00.794 3.353A7.5 7.5 0 0012 19.5a7.384 7.384 0 003.349-.793 1 1 0 01.639-.09z" clip-rule="evenodd"></path></svg><div class="text-label-2 dark:text-dark-label-2 text-xs">11</div></div></div></div></div><div class="relative flex w-full gap-4 px-5 py-3 transition-[background] duration-500"><a target="_blank" rel="noopener noreferrer" class="no-underline hover:text-blue-s dark:hover:text-dark-blue-s truncate h-8 min-h-[32px] w-8 min-w-[32px]" href="https://leetcode.com/kdojha115/"><img src="./Combinations - LeetCode_files/avatar_1670656334.png" alt="" class="rounded-1/2 object-cover h-full w-full rounded-full"></a><div class="flex w-full flex-col gap-1 overflow-hidden"><div class="flex min-w-0 max-w-full items-center gap-2"><div class="overflow-hidden text-ellipsis"><a class="no-underline hover:text-blue-s dark:hover:text-dark-blue-s truncate w-full" href="https://leetcode.com/problems/combinations/solutions/2764427/2-approaches-easy-short/"><div class="truncate text-label-1 dark:text-dark-label-1 hover:text-blue-s dark:hover:text-dark-blue-s text-[16px] font-medium leading-[22px]"><span>2 approaches || easy || short</span></div></a></div></div><div class="flex items-center gap-5"><div class="flex items-center gap-1 truncate"><a target="_blank" rel="noopener noreferrer" class="no-underline text-label-2 dark:text-dark-label-2 text-xs font-medium overflow-hidden max-w-[100px] md:max-w-[200px] hover:text-blue-s dark:hover:text-dark-blue-s truncate" href="https://leetcode.com/kdojha115/">kdojha115</a><div class="h-3 w-3"><img src="./Combinations - LeetCode_files/algorithm_I.png" alt="Algorithm I" class="h-full w-full"></div></div><div class="flex items-center gap-1.5"><div class="text-label-3 dark:text-dark-label-3 min-w-max text-xs"><span>Nov 01, 2022</span></div></div><div class="flex flex-grow flex-nowrap items-center gap-2 overflow-hidden"><div class="text-label-2 dark:text-dark-label-2 bg-fill-3 dark:bg-dark-fill-3 whitespace-nowrap rounded-[20px] py-[1px] px-2 text-xs">Recursion</div></div></div><div class="mt-1 flex items-center gap-6"><div class="flex items-center gap-1"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16" width="1em" height="1em" fill="currentColor" class="h-4.5 w-4.5 text-gray-7 dark:text-dark-gray-7"><path fill-rule="evenodd" d="M7.333 8.667v4h1.334v-4h4.288L8 3.299 3.045 8.667h4.288zm-1.333 4C6 13.403 6.597 14 7.333 14h1.334C9.403 14 10 13.403 10 12.667V10h3.716c.872 0 1.326-1.038.735-1.678L8.735 2.129a1 1 0 00-1.47 0L1.55 8.322C.958 8.962 1.412 10 2.284 10H6v2.667z" clip-rule="evenodd"></path></svg><div class="text-label-2 dark:text-dark-label-2 text-xs">5</div></div><div class="flex items-center gap-1"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor" class="h-4.5 w-4.5 text-gray-7 dark:text-dark-gray-7"><path fill-rule="evenodd" d="M1.104 12.444a1 1 0 010-.888c.13-.26.37-.693.722-1.241A18.85 18.85 0 013.88 7.652C6.184 5.176 8.896 3.667 12 3.667s5.816 1.509 8.119 3.985c.79.85 1.475 1.756 2.055 2.663.352.548.593.98.722 1.24a1 1 0 010 .89c-.13.26-.37.692-.722 1.24a18.848 18.848 0 01-2.055 2.663c-2.303 2.476-5.015 3.985-8.119 3.985s-5.816-1.509-8.119-3.985a18.846 18.846 0 01-2.055-2.663c-.352-.548-.593-.98-.722-1.24zm2.406.162a16.87 16.87 0 001.836 2.38c1.959 2.106 4.19 3.347 6.654 3.347 2.465 0 4.695-1.24 6.654-3.347A16.87 16.87 0 0020.86 12a16.871 16.871 0 00-2.206-2.986C16.695 6.908 14.464 5.667 12 5.667c-2.465 0-4.695 1.24-6.654 3.347A16.87 16.87 0 003.14 12c.108.188.232.391.37.607zM12 15.75c-2.06 0-3.727-1.68-3.727-3.75 0-2.07 1.667-3.75 3.727-3.75 2.06 0 3.727 1.68 3.727 3.75 0 2.07-1.667 3.75-3.727 3.75zm0-2c.952 0 1.727-.782 1.727-1.75s-.775-1.75-1.727-1.75c-.952 0-1.727.782-1.727 1.75s.775 1.75 1.727 1.75z" clip-rule="evenodd"></path></svg><div class="text-label-2 dark:text-dark-label-2 text-xs">1K</div></div><div class="flex items-center gap-1"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor" class="h-4.5 w-4.5 text-gray-7 dark:text-dark-gray-7"><path fill-rule="evenodd" d="M11.997 21.5a9.5 9.5 0 01-8.49-5.251A9.38 9.38 0 012.5 11.997V11.5c.267-4.88 4.12-8.733 8.945-8.999L12 2.5a9.378 9.378 0 014.25 1.007A9.498 9.498 0 0121.5 12a9.378 9.378 0 01-.856 3.937l.838 4.376a1 1 0 01-1.17 1.17l-4.376-.838a9.381 9.381 0 01-3.939.856zm3.99-2.882l3.254.623-.623-3.253a1 1 0 01.09-.64 7.381 7.381 0 00.792-3.346 7.5 7.5 0 00-4.147-6.708 7.385 7.385 0 00-3.35-.794H11.5c-3.752.208-6.792 3.248-7.002 7.055L4.5 12a7.387 7.387 0 00.794 3.353A7.5 7.5 0 0012 19.5a7.384 7.384 0 003.349-.793 1 1 0 01.639-.09z" clip-rule="evenodd"></path></svg><div class="text-label-2 dark:text-dark-label-2 text-xs">0</div></div></div></div></div><div class="relative flex w-full gap-4 px-5 py-3 transition-[background] duration-500"><a target="_blank" rel="noopener noreferrer" class="no-underline hover:text-blue-s dark:hover:text-dark-blue-s truncate h-8 min-h-[32px] w-8 min-w-[32px]" href="https://leetcode.com/Shubh_India/"><img src="./Combinations - LeetCode_files/avatar_1668315271.png" alt="" class="rounded-1/2 object-cover h-full w-full rounded-full"></a><div class="flex w-full flex-col gap-1 overflow-hidden"><div class="flex min-w-0 max-w-full items-center gap-2"><div class="overflow-hidden text-ellipsis"><a class="no-underline hover:text-blue-s dark:hover:text-dark-blue-s truncate w-full" href="https://leetcode.com/problems/combinations/solutions/2739590/simplest-c-solution-pick-non-pick-backtracking/"><div class="truncate text-label-1 dark:text-dark-label-1 hover:text-blue-s dark:hover:text-dark-blue-s text-[16px] font-medium leading-[22px]"><span>🚀🚀 Simplest C++ solution ✨🚀🚀 (PIck / Non-Pick) (backtracking)</span></div></a></div></div><div class="flex items-center gap-5"><div class="flex items-center gap-1 truncate"><a target="_blank" rel="noopener noreferrer" class="no-underline text-label-2 dark:text-dark-label-2 text-xs font-medium overflow-hidden max-w-[100px] md:max-w-[200px] hover:text-blue-s dark:hover:text-dark-blue-s truncate" href="https://leetcode.com/Shubh_India/">Shubh_India</a><div class="h-3 w-3"><img src="./Combinations - LeetCode_files/DS_I.png" alt="Data Structure I" class="h-full w-full"></div></div><div class="flex items-center gap-1.5"><div class="text-label-3 dark:text-dark-label-3 min-w-max text-xs"><span>Oct 24, 2022</span></div></div></div><div class="mt-1 flex items-center gap-6"><div class="flex items-center gap-1"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16" width="1em" height="1em" fill="currentColor" class="h-4.5 w-4.5 text-gray-7 dark:text-dark-gray-7"><path fill-rule="evenodd" d="M7.333 8.667v4h1.334v-4h4.288L8 3.299 3.045 8.667h4.288zm-1.333 4C6 13.403 6.597 14 7.333 14h1.334C9.403 14 10 13.403 10 12.667V10h3.716c.872 0 1.326-1.038.735-1.678L8.735 2.129a1 1 0 00-1.47 0L1.55 8.322C.958 8.962 1.412 10 2.284 10H6v2.667z" clip-rule="evenodd"></path></svg><div class="text-label-2 dark:text-dark-label-2 text-xs">2</div></div><div class="flex items-center gap-1"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor" class="h-4.5 w-4.5 text-gray-7 dark:text-dark-gray-7"><path fill-rule="evenodd" d="M1.104 12.444a1 1 0 010-.888c.13-.26.37-.693.722-1.241A18.85 18.85 0 013.88 7.652C6.184 5.176 8.896 3.667 12 3.667s5.816 1.509 8.119 3.985c.79.85 1.475 1.756 2.055 2.663.352.548.593.98.722 1.24a1 1 0 010 .89c-.13.26-.37.692-.722 1.24a18.848 18.848 0 01-2.055 2.663c-2.303 2.476-5.015 3.985-8.119 3.985s-5.816-1.509-8.119-3.985a18.846 18.846 0 01-2.055-2.663c-.352-.548-.593-.98-.722-1.24zm2.406.162a16.87 16.87 0 001.836 2.38c1.959 2.106 4.19 3.347 6.654 3.347 2.465 0 4.695-1.24 6.654-3.347A16.87 16.87 0 0020.86 12a16.871 16.871 0 00-2.206-2.986C16.695 6.908 14.464 5.667 12 5.667c-2.465 0-4.695 1.24-6.654 3.347A16.87 16.87 0 003.14 12c.108.188.232.391.37.607zM12 15.75c-2.06 0-3.727-1.68-3.727-3.75 0-2.07 1.667-3.75 3.727-3.75 2.06 0 3.727 1.68 3.727 3.75 0 2.07-1.667 3.75-3.727 3.75zm0-2c.952 0 1.727-.782 1.727-1.75s-.775-1.75-1.727-1.75c-.952 0-1.727.782-1.727 1.75s.775 1.75 1.727 1.75z" clip-rule="evenodd"></path></svg><div class="text-label-2 dark:text-dark-label-2 text-xs">694</div></div><div class="flex items-center gap-1"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor" class="h-4.5 w-4.5 text-gray-7 dark:text-dark-gray-7"><path fill-rule="evenodd" d="M11.997 21.5a9.5 9.5 0 01-8.49-5.251A9.38 9.38 0 012.5 11.997V11.5c.267-4.88 4.12-8.733 8.945-8.999L12 2.5a9.378 9.378 0 014.25 1.007A9.498 9.498 0 0121.5 12a9.378 9.378 0 01-.856 3.937l.838 4.376a1 1 0 01-1.17 1.17l-4.376-.838a9.381 9.381 0 01-3.939.856zm3.99-2.882l3.254.623-.623-3.253a1 1 0 01.09-.64 7.381 7.381 0 00.792-3.346 7.5 7.5 0 00-4.147-6.708 7.385 7.385 0 00-3.35-.794H11.5c-3.752.208-6.792 3.248-7.002 7.055L4.5 12a7.387 7.387 0 00.794 3.353A7.5 7.5 0 0012 19.5a7.384 7.384 0 003.349-.793 1 1 0 01.639-.09z" clip-rule="evenodd"></path></svg><div class="text-label-2 dark:text-dark-label-2 text-xs">1</div></div></div></div></div><div class="relative flex w-full gap-4 px-5 py-3 transition-[background] duration-500"><a target="_blank" rel="noopener noreferrer" class="no-underline hover:text-blue-s dark:hover:text-dark-blue-s truncate h-8 min-h-[32px] w-8 min-w-[32px]" href="https://leetcode.com/Sahana__63/"><img src="./Combinations - LeetCode_files/default_avatar.jpg" alt="" class="rounded-1/2 object-cover h-full w-full rounded-full"></a><div class="flex w-full flex-col gap-1 overflow-hidden"><div class="flex min-w-0 max-w-full items-center gap-2"><div class="overflow-hidden text-ellipsis"><a class="no-underline hover:text-blue-s dark:hover:text-dark-blue-s truncate w-full" href="https://leetcode.com/problems/combinations/solutions/844096/backtracking-cheatsheet-simple-solution/"><div class="truncate text-label-1 dark:text-dark-label-1 hover:text-blue-s dark:hover:text-dark-blue-s text-[16px] font-medium leading-[22px]"><span>Backtracking cheatsheet + simple solution</span></div></a></div></div><div class="flex items-center gap-5"><div class="flex items-center gap-1 truncate"><a target="_blank" rel="noopener noreferrer" class="no-underline text-label-2 dark:text-dark-label-2 text-xs font-medium overflow-hidden max-w-[100px] md:max-w-[200px] hover:text-blue-s dark:hover:text-dark-blue-s truncate" href="https://leetcode.com/Sahana__63/">Sahana__63</a></div><div class="flex items-center gap-1.5"><div class="text-label-3 dark:text-dark-label-3 min-w-max text-xs"><span>Sep 13, 2020</span></div></div><div class="flex flex-grow flex-nowrap items-center gap-2 overflow-hidden"><div class="text-label-2 dark:text-dark-label-2 bg-fill-3 dark:bg-dark-fill-3 whitespace-nowrap rounded-[20px] py-[1px] px-2 text-xs">Python</div><div class="text-label-2 dark:text-dark-label-2 bg-fill-3 dark:bg-dark-fill-3 whitespace-nowrap rounded-[20px] py-[1px] px-2 text-xs">Python3</div><div class="text-label-2 dark:text-dark-label-2 bg-fill-3 dark:bg-dark-fill-3 whitespace-nowrap rounded-[20px] py-[1px] px-2 text-xs">Backtracking</div></div></div><div class="mt-1 flex items-center gap-6"><div class="flex items-center gap-1"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16" width="1em" height="1em" fill="currentColor" class="h-4.5 w-4.5 text-gray-7 dark:text-dark-gray-7"><path fill-rule="evenodd" d="M7.333 8.667v4h1.334v-4h4.288L8 3.299 3.045 8.667h4.288zm-1.333 4C6 13.403 6.597 14 7.333 14h1.334C9.403 14 10 13.403 10 12.667V10h3.716c.872 0 1.326-1.038.735-1.678L8.735 2.129a1 1 0 00-1.47 0L1.55 8.322C.958 8.962 1.412 10 2.284 10H6v2.667z" clip-rule="evenodd"></path></svg><div class="text-label-2 dark:text-dark-label-2 text-xs">160</div></div><div class="flex items-center gap-1"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor" class="h-4.5 w-4.5 text-gray-7 dark:text-dark-gray-7"><path fill-rule="evenodd" d="M1.104 12.444a1 1 0 010-.888c.13-.26.37-.693.722-1.241A18.85 18.85 0 013.88 7.652C6.184 5.176 8.896 3.667 12 3.667s5.816 1.509 8.119 3.985c.79.85 1.475 1.756 2.055 2.663.352.548.593.98.722 1.24a1 1 0 010 .89c-.13.26-.37.692-.722 1.24a18.848 18.848 0 01-2.055 2.663c-2.303 2.476-5.015 3.985-8.119 3.985s-5.816-1.509-8.119-3.985a18.846 18.846 0 01-2.055-2.663c-.352-.548-.593-.98-.722-1.24zm2.406.162a16.87 16.87 0 001.836 2.38c1.959 2.106 4.19 3.347 6.654 3.347 2.465 0 4.695-1.24 6.654-3.347A16.87 16.87 0 0020.86 12a16.871 16.871 0 00-2.206-2.986C16.695 6.908 14.464 5.667 12 5.667c-2.465 0-4.695 1.24-6.654 3.347A16.87 16.87 0 003.14 12c.108.188.232.391.37.607zM12 15.75c-2.06 0-3.727-1.68-3.727-3.75 0-2.07 1.667-3.75 3.727-3.75 2.06 0 3.727 1.68 3.727 3.75 0 2.07-1.667 3.75-3.727 3.75zm0-2c.952 0 1.727-.782 1.727-1.75s-.775-1.75-1.727-1.75c-.952 0-1.727.782-1.727 1.75s.775 1.75 1.727 1.75z" clip-rule="evenodd"></path></svg><div class="text-label-2 dark:text-dark-label-2 text-xs">18K</div></div><div class="flex items-center gap-1"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor" class="h-4.5 w-4.5 text-gray-7 dark:text-dark-gray-7"><path fill-rule="evenodd" d="M11.997 21.5a9.5 9.5 0 01-8.49-5.251A9.38 9.38 0 012.5 11.997V11.5c.267-4.88 4.12-8.733 8.945-8.999L12 2.5a9.378 9.378 0 014.25 1.007A9.498 9.498 0 0121.5 12a9.378 9.378 0 01-.856 3.937l.838 4.376a1 1 0 01-1.17 1.17l-4.376-.838a9.381 9.381 0 01-3.939.856zm3.99-2.882l3.254.623-.623-3.253a1 1 0 01.09-.64 7.381 7.381 0 00.792-3.346 7.5 7.5 0 00-4.147-6.708 7.385 7.385 0 00-3.35-.794H11.5c-3.752.208-6.792 3.248-7.002 7.055L4.5 12a7.387 7.387 0 00.794 3.353A7.5 7.5 0 0012 19.5a7.384 7.384 0 003.349-.793 1 1 0 01.639-.09z" clip-rule="evenodd"></path></svg><div class="text-label-2 dark:text-dark-label-2 text-xs">7</div></div></div></div></div><div class="relative flex w-full gap-4 px-5 py-3 transition-[background] duration-500"><a target="_blank" rel="noopener noreferrer" class="no-underline hover:text-blue-s dark:hover:text-dark-blue-s truncate h-8 min-h-[32px] w-8 min-w-[32px]" href="https://leetcode.com/ganesh_2023/"><img src="./Combinations - LeetCode_files/default_avatar.jpg" alt="" class="rounded-1/2 object-cover h-full w-full rounded-full"></a><div class="flex w-full flex-col gap-1 overflow-hidden"><div class="flex min-w-0 max-w-full items-center gap-2"><div class="overflow-hidden text-ellipsis"><a class="no-underline hover:text-blue-s dark:hover:text-dark-blue-s truncate w-full" href="https://leetcode.com/problems/combinations/solutions/3176166/time-space-90-beats-backtracking-c/"><div class="truncate text-label-1 dark:text-dark-label-1 hover:text-blue-s dark:hover:text-dark-blue-s text-[16px] font-medium leading-[22px]"><span>TIME &amp; SPACE 90% BEATS || BACKTRACKING || C++</span></div></a></div></div><div class="flex items-center gap-5"><div class="flex items-center gap-1 truncate"><a target="_blank" rel="noopener noreferrer" class="no-underline text-label-2 dark:text-dark-label-2 text-xs font-medium overflow-hidden max-w-[100px] md:max-w-[200px] hover:text-blue-s dark:hover:text-dark-blue-s truncate" href="https://leetcode.com/ganesh_2023/">ganesh_2023</a></div><div class="flex items-center gap-1.5"><div class="text-label-3 dark:text-dark-label-3 min-w-max text-xs"><span>Feb 12, 2023</span></div></div><div class="flex flex-grow flex-nowrap items-center gap-2 overflow-hidden"><div class="text-label-2 dark:text-dark-label-2 bg-fill-3 dark:bg-dark-fill-3 whitespace-nowrap rounded-[20px] py-[1px] px-2 text-xs">C++</div><div class="text-label-2 dark:text-dark-label-2 bg-fill-3 dark:bg-dark-fill-3 whitespace-nowrap rounded-[20px] py-[1px] px-2 text-xs">C</div><div class="text-label-2 dark:text-dark-label-2 bg-fill-3 dark:bg-dark-fill-3 whitespace-nowrap rounded-[20px] py-[1px] px-2 text-xs">Backtracking</div><div class="text-label-2 dark:text-dark-label-2 bg-fill-3 dark:bg-dark-fill-3 whitespace-nowrap rounded-[20px] py-[1px] px-2 text-xs">Depth-First Search</div><div class="popover-wrapper inline-block" data-headlessui-state=""><div><div id="headlessui-popover-button-:r1vk:" aria-expanded="false" data-headlessui-state=""><span><div class="text-label-2 dark:text-dark-label-2 bg-fill-3 dark:bg-dark-fill-3 whitespace-nowrap rounded-[20px] py-[1px] px-2 text-xs">1+</div></span></div></div></div></div></div><div class="mt-1 flex items-center gap-6"><div class="flex items-center gap-1"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16" width="1em" height="1em" fill="currentColor" class="h-4.5 w-4.5 text-gray-7 dark:text-dark-gray-7"><path fill-rule="evenodd" d="M7.333 8.667v4h1.334v-4h4.288L8 3.299 3.045 8.667h4.288zm-1.333 4C6 13.403 6.597 14 7.333 14h1.334C9.403 14 10 13.403 10 12.667V10h3.716c.872 0 1.326-1.038.735-1.678L8.735 2.129a1 1 0 00-1.47 0L1.55 8.322C.958 8.962 1.412 10 2.284 10H6v2.667z" clip-rule="evenodd"></path></svg><div class="text-label-2 dark:text-dark-label-2 text-xs">3</div></div><div class="flex items-center gap-1"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor" class="h-4.5 w-4.5 text-gray-7 dark:text-dark-gray-7"><path fill-rule="evenodd" d="M1.104 12.444a1 1 0 010-.888c.13-.26.37-.693.722-1.241A18.85 18.85 0 013.88 7.652C6.184 5.176 8.896 3.667 12 3.667s5.816 1.509 8.119 3.985c.79.85 1.475 1.756 2.055 2.663.352.548.593.98.722 1.24a1 1 0 010 .89c-.13.26-.37.692-.722 1.24a18.848 18.848 0 01-2.055 2.663c-2.303 2.476-5.015 3.985-8.119 3.985s-5.816-1.509-8.119-3.985a18.846 18.846 0 01-2.055-2.663c-.352-.548-.593-.98-.722-1.24zm2.406.162a16.87 16.87 0 001.836 2.38c1.959 2.106 4.19 3.347 6.654 3.347 2.465 0 4.695-1.24 6.654-3.347A16.87 16.87 0 0020.86 12a16.871 16.871 0 00-2.206-2.986C16.695 6.908 14.464 5.667 12 5.667c-2.465 0-4.695 1.24-6.654 3.347A16.87 16.87 0 003.14 12c.108.188.232.391.37.607zM12 15.75c-2.06 0-3.727-1.68-3.727-3.75 0-2.07 1.667-3.75 3.727-3.75 2.06 0 3.727 1.68 3.727 3.75 0 2.07-1.667 3.75-3.727 3.75zm0-2c.952 0 1.727-.782 1.727-1.75s-.775-1.75-1.727-1.75c-.952 0-1.727.782-1.727 1.75s.775 1.75 1.727 1.75z" clip-rule="evenodd"></path></svg><div class="text-label-2 dark:text-dark-label-2 text-xs">484</div></div><div class="flex items-center gap-1"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor" class="h-4.5 w-4.5 text-gray-7 dark:text-dark-gray-7"><path fill-rule="evenodd" d="M11.997 21.5a9.5 9.5 0 01-8.49-5.251A9.38 9.38 0 012.5 11.997V11.5c.267-4.88 4.12-8.733 8.945-8.999L12 2.5a9.378 9.378 0 014.25 1.007A9.498 9.498 0 0121.5 12a9.378 9.378 0 01-.856 3.937l.838 4.376a1 1 0 01-1.17 1.17l-4.376-.838a9.381 9.381 0 01-3.939.856zm3.99-2.882l3.254.623-.623-3.253a1 1 0 01.09-.64 7.381 7.381 0 00.792-3.346 7.5 7.5 0 00-4.147-6.708 7.385 7.385 0 00-3.35-.794H11.5c-3.752.208-6.792 3.248-7.002 7.055L4.5 12a7.387 7.387 0 00.794 3.353A7.5 7.5 0 0012 19.5a7.384 7.384 0 003.349-.793 1 1 0 01.639-.09z" clip-rule="evenodd"></path></svg><div class="text-label-2 dark:text-dark-label-2 text-xs">0</div></div></div></div></div><div class="relative flex w-full gap-4 px-5 py-3 transition-[background] duration-500"><a target="_blank" rel="noopener noreferrer" class="no-underline hover:text-blue-s dark:hover:text-dark-blue-s truncate h-8 min-h-[32px] w-8 min-w-[32px]" href="https://leetcode.com/hengyi/"><img src="./Combinations - LeetCode_files/default_avatar.jpg" alt="" class="rounded-1/2 object-cover h-full w-full rounded-full"></a><div class="flex w-full flex-col gap-1 overflow-hidden"><div class="flex min-w-0 max-w-full items-center gap-2"><div class="overflow-hidden text-ellipsis"><a class="no-underline hover:text-blue-s dark:hover:text-dark-blue-s truncate w-full" href="https://leetcode.com/problems/combinations/solutions/26992/short-iterative-c-answer-8ms/"><div class="truncate text-label-1 dark:text-dark-label-1 hover:text-blue-s dark:hover:text-dark-blue-s text-[16px] font-medium leading-[22px]"><span>Short Iterative C++ Answer 8ms</span></div></a></div></div><div class="flex items-center gap-5"><div class="flex items-center gap-1 truncate"><a target="_blank" rel="noopener noreferrer" class="no-underline text-label-2 dark:text-dark-label-2 text-xs font-medium overflow-hidden max-w-[100px] md:max-w-[200px] hover:text-blue-s dark:hover:text-dark-blue-s truncate" href="https://leetcode.com/hengyi/">hengyi</a></div><div class="flex items-center gap-1.5"><div class="text-label-3 dark:text-dark-label-3 min-w-max text-xs"><span>Oct 09, 2015</span></div></div></div><div class="mt-1 flex items-center gap-6"><div class="flex items-center gap-1"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16" width="1em" height="1em" fill="currentColor" class="h-4.5 w-4.5 text-gray-7 dark:text-dark-gray-7"><path fill-rule="evenodd" d="M7.333 8.667v4h1.334v-4h4.288L8 3.299 3.045 8.667h4.288zm-1.333 4C6 13.403 6.597 14 7.333 14h1.334C9.403 14 10 13.403 10 12.667V10h3.716c.872 0 1.326-1.038.735-1.678L8.735 2.129a1 1 0 00-1.47 0L1.55 8.322C.958 8.962 1.412 10 2.284 10H6v2.667z" clip-rule="evenodd"></path></svg><div class="text-label-2 dark:text-dark-label-2 text-xs">379</div></div><div class="flex items-center gap-1"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor" class="h-4.5 w-4.5 text-gray-7 dark:text-dark-gray-7"><path fill-rule="evenodd" d="M1.104 12.444a1 1 0 010-.888c.13-.26.37-.693.722-1.241A18.85 18.85 0 013.88 7.652C6.184 5.176 8.896 3.667 12 3.667s5.816 1.509 8.119 3.985c.79.85 1.475 1.756 2.055 2.663.352.548.593.98.722 1.24a1 1 0 010 .89c-.13.26-.37.692-.722 1.24a18.848 18.848 0 01-2.055 2.663c-2.303 2.476-5.015 3.985-8.119 3.985s-5.816-1.509-8.119-3.985a18.846 18.846 0 01-2.055-2.663c-.352-.548-.593-.98-.722-1.24zm2.406.162a16.87 16.87 0 001.836 2.38c1.959 2.106 4.19 3.347 6.654 3.347 2.465 0 4.695-1.24 6.654-3.347A16.87 16.87 0 0020.86 12a16.871 16.871 0 00-2.206-2.986C16.695 6.908 14.464 5.667 12 5.667c-2.465 0-4.695 1.24-6.654 3.347A16.87 16.87 0 003.14 12c.108.188.232.391.37.607zM12 15.75c-2.06 0-3.727-1.68-3.727-3.75 0-2.07 1.667-3.75 3.727-3.75 2.06 0 3.727 1.68 3.727 3.75 0 2.07-1.667 3.75-3.727 3.75zm0-2c.952 0 1.727-.782 1.727-1.75s-.775-1.75-1.727-1.75c-.952 0-1.727.782-1.727 1.75s.775 1.75 1.727 1.75z" clip-rule="evenodd"></path></svg><div class="text-label-2 dark:text-dark-label-2 text-xs">42K</div></div><div class="flex items-center gap-1"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor" class="h-4.5 w-4.5 text-gray-7 dark:text-dark-gray-7"><path fill-rule="evenodd" d="M11.997 21.5a9.5 9.5 0 01-8.49-5.251A9.38 9.38 0 012.5 11.997V11.5c.267-4.88 4.12-8.733 8.945-8.999L12 2.5a9.378 9.378 0 014.25 1.007A9.498 9.498 0 0121.5 12a9.378 9.378 0 01-.856 3.937l.838 4.376a1 1 0 01-1.17 1.17l-4.376-.838a9.381 9.381 0 01-3.939.856zm3.99-2.882l3.254.623-.623-3.253a1 1 0 01.09-.64 7.381 7.381 0 00.792-3.346 7.5 7.5 0 00-4.147-6.708 7.385 7.385 0 00-3.35-.794H11.5c-3.752.208-6.792 3.248-7.002 7.055L4.5 12a7.387 7.387 0 00.794 3.353A7.5 7.5 0 0012 19.5a7.384 7.384 0 003.349-.793 1 1 0 01.639-.09z" clip-rule="evenodd"></path></svg><div class="text-label-2 dark:text-dark-label-2 text-xs">40</div></div></div></div></div><div class="relative flex w-full gap-4 px-5 py-3 transition-[background] duration-500"><a target="_blank" rel="noopener noreferrer" class="no-underline hover:text-blue-s dark:hover:text-dark-blue-s truncate h-8 min-h-[32px] w-8 min-w-[32px]" href="https://leetcode.com/pranto1209/"><img src="./Combinations - LeetCode_files/avatar_1667242227.png" alt="" class="rounded-1/2 object-cover h-full w-full rounded-full"></a><div class="flex w-full flex-col gap-1 overflow-hidden"><div class="flex min-w-0 max-w-full items-center gap-2"><div class="overflow-hidden text-ellipsis"><a class="no-underline hover:text-blue-s dark:hover:text-dark-blue-s truncate w-full" href="https://leetcode.com/problems/combinations/solutions/3051287/combinations-c-solution/"><div class="truncate text-label-1 dark:text-dark-label-1 hover:text-blue-s dark:hover:text-dark-blue-s text-[16px] font-medium leading-[22px]"><span>Combinations (C++ Solution)</span></div></a></div></div><div class="flex items-center gap-5"><div class="flex items-center gap-1 truncate"><a target="_blank" rel="noopener noreferrer" class="no-underline text-label-2 dark:text-dark-label-2 text-xs font-medium overflow-hidden max-w-[100px] md:max-w-[200px] hover:text-blue-s dark:hover:text-dark-blue-s truncate" href="https://leetcode.com/pranto1209/">pranto1209</a><div class="h-3 w-3"><img src="./Combinations - LeetCode_files/dcc-2023-2.png" alt="Feb LeetCoding Challenge" class="h-full w-full"></div></div><div class="flex items-center gap-1.5"><div class="text-label-3 dark:text-dark-label-3 min-w-max text-xs"><span>Jan 14, 2023</span></div></div><div class="flex flex-grow flex-nowrap items-center gap-2 overflow-hidden"><div class="text-label-2 dark:text-dark-label-2 bg-fill-3 dark:bg-dark-fill-3 whitespace-nowrap rounded-[20px] py-[1px] px-2 text-xs">C++</div></div></div><div class="mt-1 flex items-center gap-6"><div class="flex items-center gap-1"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16" width="1em" height="1em" fill="currentColor" class="h-4.5 w-4.5 text-gray-7 dark:text-dark-gray-7"><path fill-rule="evenodd" d="M7.333 8.667v4h1.334v-4h4.288L8 3.299 3.045 8.667h4.288zm-1.333 4C6 13.403 6.597 14 7.333 14h1.334C9.403 14 10 13.403 10 12.667V10h3.716c.872 0 1.326-1.038.735-1.678L8.735 2.129a1 1 0 00-1.47 0L1.55 8.322C.958 8.962 1.412 10 2.284 10H6v2.667z" clip-rule="evenodd"></path></svg><div class="text-label-2 dark:text-dark-label-2 text-xs">5</div></div><div class="flex items-center gap-1"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor" class="h-4.5 w-4.5 text-gray-7 dark:text-dark-gray-7"><path fill-rule="evenodd" d="M1.104 12.444a1 1 0 010-.888c.13-.26.37-.693.722-1.241A18.85 18.85 0 013.88 7.652C6.184 5.176 8.896 3.667 12 3.667s5.816 1.509 8.119 3.985c.79.85 1.475 1.756 2.055 2.663.352.548.593.98.722 1.24a1 1 0 010 .89c-.13.26-.37.692-.722 1.24a18.848 18.848 0 01-2.055 2.663c-2.303 2.476-5.015 3.985-8.119 3.985s-5.816-1.509-8.119-3.985a18.846 18.846 0 01-2.055-2.663c-.352-.548-.593-.98-.722-1.24zm2.406.162a16.87 16.87 0 001.836 2.38c1.959 2.106 4.19 3.347 6.654 3.347 2.465 0 4.695-1.24 6.654-3.347A16.87 16.87 0 0020.86 12a16.871 16.871 0 00-2.206-2.986C16.695 6.908 14.464 5.667 12 5.667c-2.465 0-4.695 1.24-6.654 3.347A16.87 16.87 0 003.14 12c.108.188.232.391.37.607zM12 15.75c-2.06 0-3.727-1.68-3.727-3.75 0-2.07 1.667-3.75 3.727-3.75 2.06 0 3.727 1.68 3.727 3.75 0 2.07-1.667 3.75-3.727 3.75zm0-2c.952 0 1.727-.782 1.727-1.75s-.775-1.75-1.727-1.75c-.952 0-1.727.782-1.727 1.75s.775 1.75 1.727 1.75z" clip-rule="evenodd"></path></svg><div class="text-label-2 dark:text-dark-label-2 text-xs">705</div></div><div class="flex items-center gap-1"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor" class="h-4.5 w-4.5 text-gray-7 dark:text-dark-gray-7"><path fill-rule="evenodd" d="M11.997 21.5a9.5 9.5 0 01-8.49-5.251A9.38 9.38 0 012.5 11.997V11.5c.267-4.88 4.12-8.733 8.945-8.999L12 2.5a9.378 9.378 0 014.25 1.007A9.498 9.498 0 0121.5 12a9.378 9.378 0 01-.856 3.937l.838 4.376a1 1 0 01-1.17 1.17l-4.376-.838a9.381 9.381 0 01-3.939.856zm3.99-2.882l3.254.623-.623-3.253a1 1 0 01.09-.64 7.381 7.381 0 00.792-3.346 7.5 7.5 0 00-4.147-6.708 7.385 7.385 0 00-3.35-.794H11.5c-3.752.208-6.792 3.248-7.002 7.055L4.5 12a7.387 7.387 0 00.794 3.353A7.5 7.5 0 0012 19.5a7.384 7.384 0 003.349-.793 1 1 0 01.639-.09z" clip-rule="evenodd"></path></svg><div class="text-label-2 dark:text-dark-label-2 text-xs">0</div></div></div></div></div><div class="relative flex w-full gap-4 px-5 py-3 transition-[background] duration-500"><a target="_blank" rel="noopener noreferrer" class="no-underline hover:text-blue-s dark:hover:text-dark-blue-s truncate h-8 min-h-[32px] w-8 min-w-[32px]" href="https://leetcode.com/fabrizio3/"><img src="./Combinations - LeetCode_files/avatar_1586248400.png" alt="" class="rounded-1/2 object-cover h-full w-full rounded-full"></a><div class="flex w-full flex-col gap-1 overflow-hidden"><div class="flex min-w-0 max-w-full items-center gap-2"><div class="overflow-hidden text-ellipsis"><a class="no-underline hover:text-blue-s dark:hover:text-dark-blue-s truncate w-full" href="https://leetcode.com/problems/combinations/solutions/27002/backtracking-solution-java/"><div class="truncate text-label-1 dark:text-dark-label-1 hover:text-blue-s dark:hover:text-dark-blue-s text-[16px] font-medium leading-[22px]"><span>Backtracking Solution Java</span></div></a></div></div><div class="flex items-center gap-5"><div class="flex items-center gap-1 truncate"><a target="_blank" rel="noopener noreferrer" class="no-underline text-label-2 dark:text-dark-label-2 text-xs font-medium overflow-hidden max-w-[100px] md:max-w-[200px] hover:text-blue-s dark:hover:text-dark-blue-s truncate" href="https://leetcode.com/fabrizio3/">fabrizio3</a></div><div class="flex items-center gap-1.5"><div class="text-label-3 dark:text-dark-label-3 min-w-max text-xs"><span>Apr 10, 2015</span></div></div><div class="flex flex-grow flex-nowrap items-center gap-2 overflow-hidden"><div class="text-label-2 dark:text-dark-label-2 bg-fill-3 dark:bg-dark-fill-3 whitespace-nowrap rounded-[20px] py-[1px] px-2 text-xs">Java</div><div class="text-label-2 dark:text-dark-label-2 bg-fill-3 dark:bg-dark-fill-3 whitespace-nowrap rounded-[20px] py-[1px] px-2 text-xs">Backtracking</div></div></div><div class="mt-1 flex items-center gap-6"><div class="flex items-center gap-1"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16" width="1em" height="1em" fill="currentColor" class="h-4.5 w-4.5 text-gray-7 dark:text-dark-gray-7"><path fill-rule="evenodd" d="M7.333 8.667v4h1.334v-4h4.288L8 3.299 3.045 8.667h4.288zm-1.333 4C6 13.403 6.597 14 7.333 14h1.334C9.403 14 10 13.403 10 12.667V10h3.716c.872 0 1.326-1.038.735-1.678L8.735 2.129a1 1 0 00-1.47 0L1.55 8.322C.958 8.962 1.412 10 2.284 10H6v2.667z" clip-rule="evenodd"></path></svg><div class="text-label-2 dark:text-dark-label-2 text-xs">341</div></div><div class="flex items-center gap-1"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor" class="h-4.5 w-4.5 text-gray-7 dark:text-dark-gray-7"><path fill-rule="evenodd" d="M1.104 12.444a1 1 0 010-.888c.13-.26.37-.693.722-1.241A18.85 18.85 0 013.88 7.652C6.184 5.176 8.896 3.667 12 3.667s5.816 1.509 8.119 3.985c.79.85 1.475 1.756 2.055 2.663.352.548.593.98.722 1.24a1 1 0 010 .89c-.13.26-.37.692-.722 1.24a18.848 18.848 0 01-2.055 2.663c-2.303 2.476-5.015 3.985-8.119 3.985s-5.816-1.509-8.119-3.985a18.846 18.846 0 01-2.055-2.663c-.352-.548-.593-.98-.722-1.24zm2.406.162a16.87 16.87 0 001.836 2.38c1.959 2.106 4.19 3.347 6.654 3.347 2.465 0 4.695-1.24 6.654-3.347A16.87 16.87 0 0020.86 12a16.871 16.871 0 00-2.206-2.986C16.695 6.908 14.464 5.667 12 5.667c-2.465 0-4.695 1.24-6.654 3.347A16.87 16.87 0 003.14 12c.108.188.232.391.37.607zM12 15.75c-2.06 0-3.727-1.68-3.727-3.75 0-2.07 1.667-3.75 3.727-3.75 2.06 0 3.727 1.68 3.727 3.75 0 2.07-1.667 3.75-3.727 3.75zm0-2c.952 0 1.727-.782 1.727-1.75s-.775-1.75-1.727-1.75c-.952 0-1.727.782-1.727 1.75s.775 1.75 1.727 1.75z" clip-rule="evenodd"></path></svg><div class="text-label-2 dark:text-dark-label-2 text-xs">86K</div></div><div class="flex items-center gap-1"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor" class="h-4.5 w-4.5 text-gray-7 dark:text-dark-gray-7"><path fill-rule="evenodd" d="M11.997 21.5a9.5 9.5 0 01-8.49-5.251A9.38 9.38 0 012.5 11.997V11.5c.267-4.88 4.12-8.733 8.945-8.999L12 2.5a9.378 9.378 0 014.25 1.007A9.498 9.498 0 0121.5 12a9.378 9.378 0 01-.856 3.937l.838 4.376a1 1 0 01-1.17 1.17l-4.376-.838a9.381 9.381 0 01-3.939.856zm3.99-2.882l3.254.623-.623-3.253a1 1 0 01.09-.64 7.381 7.381 0 00.792-3.346 7.5 7.5 0 00-4.147-6.708 7.385 7.385 0 00-3.35-.794H11.5c-3.752.208-6.792 3.248-7.002 7.055L4.5 12a7.387 7.387 0 00.794 3.353A7.5 7.5 0 0012 19.5a7.384 7.384 0 003.349-.793 1 1 0 01.639-.09z" clip-rule="evenodd"></path></svg><div class="text-label-2 dark:text-dark-label-2 text-xs">66</div></div></div></div></div></div><div class="flex justify-center p-5"><nav role="navigation" class="flex flex-nowrap items-center space-x-2"><button class="flex items-center justify-center h-8 rounded select-none focus:outline-none px-2 bg-fill-3 dark:bg-dark-fill-3 text-label-2 dark:text-dark-label-2 hover:bg-fill-2 dark:hover:bg-dark-fill-2 disabled:opacity-40 disabled:pointer-events-none" aria-label="prev" disabled=""><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor" class="text-label-2 dark:text-dark-label-2"><path fill-rule="evenodd" d="M16.091 4.929l-7.057 7.078 7.057 7.064a1 1 0 01-1.414 1.414l-7.764-7.77a1 1 0 010-1.415l7.764-7.785a1 1 0 111.415 1.414z" clip-rule="evenodd"></path></svg></button><button class="flex items-center justify-center px-3 h-8 rounded select-none focus:outline-none pointer-events-none bg-paper dark:bg-dark-gray-5 text-label-1 dark:text-dark-label-1 shadow-level1 dark:shadow-dark-level1">1</button><button class="flex items-center justify-center px-3 h-8 rounded select-none focus:outline-none bg-fill-3 dark:bg-dark-fill-3 text-label-2 dark:text-dark-label-2 hover:bg-fill-2 dark:hover:bg-dark-fill-2">2</button><button class="flex items-center justify-center px-3 h-8 rounded select-none focus:outline-none bg-fill-3 dark:bg-dark-fill-3 text-label-2 dark:text-dark-label-2 hover:bg-fill-2 dark:hover:bg-dark-fill-2">3</button><button class="flex items-center justify-center px-3 h-8 rounded select-none focus:outline-none bg-fill-3 dark:bg-dark-fill-3 text-label-2 dark:text-dark-label-2 hover:bg-fill-2 dark:hover:bg-dark-fill-2">4</button><button class="flex items-center justify-center px-3 h-8 rounded select-none focus:outline-none bg-fill-3 dark:bg-dark-fill-3 text-label-2 dark:text-dark-label-2 hover:bg-fill-2 dark:hover:bg-dark-fill-2">5</button><button class="flex items-center justify-center px-3 h-8 rounded select-none focus:outline-none bg-fill-3 dark:bg-dark-fill-3 text-label-2 dark:text-dark-label-2 hover:bg-fill-2 dark:hover:bg-dark-fill-2">6</button><button class="flex items-center justify-center px-3 h-8 rounded select-none focus:outline-none bg-fill-3 dark:bg-dark-fill-3 text-label-2 dark:text-dark-label-2 hover:bg-fill-2 dark:hover:bg-dark-fill-2 disabled:opacity-40 disabled:pointer-events-none" aria-label="gap" disabled=""><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor" class="text-label-2 dark:text-dark-label-2"><path fill-rule="evenodd" d="M4.4 14a2 2 0 100-4 2 2 0 000 4zm9.6-2a2 2 0 11-4 0 2 2 0 014 0zm7.6 0a2 2 0 11-4 0 2 2 0 014 0z" clip-rule="evenodd"></path></svg></button><button class="flex items-center justify-center px-3 h-8 rounded select-none focus:outline-none bg-fill-3 dark:bg-dark-fill-3 text-label-2 dark:text-dark-label-2 hover:bg-fill-2 dark:hover:bg-dark-fill-2">194</button><button class="flex items-center justify-center h-8 rounded select-none focus:outline-none px-2 bg-fill-3 dark:bg-dark-fill-3 text-label-2 dark:text-dark-label-2 hover:bg-fill-2 dark:hover:bg-dark-fill-2" aria-label="next"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor" class="text-label-2 dark:text-dark-label-2"><path fill-rule="evenodd" d="M7.913 19.071l7.057-7.078-7.057-7.064a1 1 0 011.414-1.414l7.764 7.77a1 1 0 010 1.415l-7.764 7.785a1 1 0 01-1.414-1.414z" clip-rule="evenodd"></path></svg></button></nav></div></div></div></div></div></div></div></div></div><div class="group flex h-full items-center justify-center transition hover:bg-blue-s dark:hover:bg-dark-blue-s w-2 hover:cursor-col-resize"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 2 14" width="2" height="14" fill="currentColor" class="text-gray-3 dark:text-dark-gray-3 transition -translate-y-6 group-hover:text-white dark:group-hover:text-white"><circle r="1" transform="matrix(4.37114e-08 -1 -1 -4.37114e-08 1 1)"></circle><circle r="1" transform="matrix(4.37114e-08 -1 -1 -4.37114e-08 1 7)"></circle><circle r="1" transform="matrix(4.37114e-08 -1 -1 -4.37114e-08 1 13)"></circle></svg></div><div class="h-full flex-col ssg__qd-splitter-secondary-w" style="width: calc(60.9533% - 4px);"><div class="relative flex h-full flex-col"><div class="min-h-0 flex-grow"><div class="flex h-full flex-col"><div class="h-full flex-col flex"><div class="relative flex h-full flex-col" id="editor"><div class="relative z-base-3"></div><div class="text-label-r dark:text-dark-label-r fixed top-[215px] right-0 flex h-10 w-8 cursor-pointer items-center justify-center rounded bg-gray-5 z-base-1 dark:bg-dark-gray-5"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor" class="h-5 w-5"><path fill-rule="evenodd" d="M14 5.592V9h3.314L14 5.592zM18 11h-5a1 1 0 01-1-1V4H6.75c-.408 0-.75.352-.75.8v14.4c0 .448.342.8.75.8h10.5c.408 0 .75-.352.75-.8V11zm-5.125-9a1 1 0 01.717.303l6.125 6.3A1 1 0 0120 9.3v9.9c0 1.54-1.225 2.8-2.75 2.8H6.75C5.225 22 4 20.74 4 19.2V4.8C4 3.26 5.225 2 6.75 2h6.125z" clip-rule="evenodd"></path></svg></div><div class="flex min-h-[44px] flex-shrink-0 flex-wrap items-center pr-5"><div class="mr-auto flex flex-nowrap gap-3"><div><div class="relative"><button class="flex cursor-pointer items-center rounded text-left focus:outline-none whitespace-nowrap bg-fill-3 dark:bg-dark-fill-3 text-label-2 dark:text-dark-label-2 hover:bg-fill-2 dark:hover:bg-dark-fill-2 active:bg-fill-3 dark:active:bg-dark-fill-3 px-2 py-1.5 font-medium" id="headlessui-listbox-button-:r20d:" type="button" aria-haspopup="true" aria-expanded="false" data-headlessui-state=""><div class="flex items-center"><svg xmlns="http://www.w3.org/2000/svg" viewBox="4 4 16 16" width="1em" height="1em" fill="currentColor" class="h-4 w-4 text-gray-5 dark:text-dark-gray-5"><path fill-rule="evenodd" d="M13.741 7.314a.95.95 0 00-.627-.272.95.95 0 00-.627.272.833.833 0 00-.246.614c0 .246.082.45.246.614a.85.85 0 00.627.245.85.85 0 00.627-.245.833.833 0 00.246-.614.832.832 0 00-.246-.614zm-.34 2.919c-.01-.273-.178-.41-.505-.41-.4.092-.914.36-1.541.805-.628.446-.969.696-1.023.75-.055.055-.082.091-.082.11l.082.136c.036.09.063.14.082.15.018.01.054-.004.109-.04l.627-.41c.564-.364.732-.16.505.614-.228.772-.505 1.94-.832 3.505-.055.709.127 1.013.545.913.419-.1.746-.231.982-.395l1.364-.955c.055-.036.073-.072.055-.109l-.11-.19c-.036-.037-.072-.055-.109-.055l-.027.027c-.218.145-.45.29-.695.436-.246.146-.405.146-.478 0-.036-.218.064-.754.3-1.609l.682-2.564c.055-.2.077-.436.068-.71z" clip-rule="evenodd"></path></svg><div class="text-xs text-label-2 dark:text-dark-label-2">Java</div></div><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor" class="pointer-events-none ml-2 w-3 h-3 text-gray-6 dark:text-dark-gray-6" aria-hidden="true"><path fill-rule="evenodd" d="M4.929 7.913l7.078 7.057 7.064-7.057a1 1 0 111.414 1.414l-7.77 7.764a1 1 0 01-1.415 0L3.515 9.328a1 1 0 011.414-1.414z" clip-rule="evenodd"></path></svg></button></div></div><div class="flex items-center"><button class="rounded px-3 py-1.5 font-medium items-center whitespace-nowrap transition-all focus:outline-none inline-flex bg-fill-3 dark:bg-dark-fill-3 text-label-2 dark:text-dark-label-2 group text-xs hover:text-brand-orange dark:hover:text-dark-brand-orange hover:bg-yellow-0 dark:hover:bg-dark-yellow-0"><div class="mr-2 h-1 w-1 rounded-full transition-all bg-gray-5 dark:bg-dark-gray-5 group-hover:bg-brand-orange"></div>Auto</button></div></div><div class="overflow-hidden ml-2 my-2"><div class="flex flex-wrap !flex-nowrap" style="margin: -4px;"><div class="flex items-center" style="margin: 4px;"><button class="rounded px-3 py-1.5 font-medium items-center whitespace-nowrap transition-all focus:outline-none inline-flex hover:bg-fill-3 dark:hover:bg-dark-fill-3 ml-auto !p-1"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor" class="h-4 w-4 text-gray-6 dark:text-dark-gray-6"><path fill-rule="evenodd" d="M12 16.945l-5.331 4.798C6.025 22.323 5 21.866 5 21V5a3 3 0 013-3h8a3 3 0 013 3v16c0 .866-1.025 1.323-1.669.743L12 16.945zm5 1.81V5a1 1 0 00-1-1H8a1 1 0 00-1 1v13.755l4.331-3.898a1 1 0 011.338 0L17 18.755z" clip-rule="evenodd"></path></svg></button></div><div class="flex items-center" style="margin: 4px;"><button class="rounded px-3 py-1.5 font-medium items-center whitespace-nowrap transition-all focus:outline-none inline-flex hover:bg-fill-3 dark:hover:bg-dark-fill-3 ml-auto !p-1"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor" class="h-4 w-4 text-gray-6 dark:text-dark-gray-6"><path fill-rule="evenodd" d="M3.64 10.98c.147 0 .312-.022.495-.066.183-.044.348-.12.495-.23.147-.11.271-.269.374-.474.103-.205.154-.462.154-.77V5.084c0-.499.077-.928.231-1.287.154-.36.363-.66.627-.902s.565-.422.902-.539c.337-.117.69-.176 1.056-.176H9.58v1.848H8.37c-.425 0-.693.14-.803.418-.11.279-.165.58-.165.902v4.136c0 .425-.08.788-.242 1.09-.161.3-.352.545-.572.736-.22.19-.455.337-.704.44-.25.103-.462.161-.638.176v.044c.176.015.389.062.638.143.25.08.484.216.704.407.22.19.41.447.572.77.161.323.242.74.242 1.254v4.004c0 .323.055.623.165.902.11.279.378.418.803.418h1.21v1.848H7.974c-.367 0-.719-.059-1.056-.176a2.573 2.573 0 01-.902-.539 2.586 2.586 0 01-.627-.902c-.154-.36-.231-.788-.231-1.287V14.61c0-.352-.051-.638-.154-.858a1.494 1.494 0 00-.374-.517 1.18 1.18 0 00-.495-.253 2.143 2.143 0 00-.495-.066V10.98zm16.72 2.04c-.161 0-.33.022-.506.066a1.184 1.184 0 00-.484.253 1.494 1.494 0 00-.374.517c-.103.22-.154.506-.154.858v4.202c0 .499-.077.928-.231 1.287-.154.36-.363.66-.627.902a2.573 2.573 0 01-.902.54c-.337.116-.69.175-1.056.175H14.42v-1.848h1.21c.425 0 .693-.14.803-.418.11-.279.165-.58.165-.902v-4.004c0-.513.08-.931.242-1.254.161-.323.352-.58.572-.77.22-.19.455-.326.704-.407.25-.08.462-.128.638-.143v-.044a2.225 2.225 0 01-.638-.176 2.567 2.567 0 01-.704-.44c-.22-.19-.41-.436-.572-.737-.161-.3-.242-.664-.242-1.089V5.452c0-.323-.055-.623-.165-.902-.11-.279-.378-.418-.803-.418h-1.21V2.284h1.606c.367 0 .719.059 1.056.176.337.117.638.297.902.539.264.242.473.543.627.902.154.36.231.788.231 1.287v4.356c0 .308.051.565.154.77.103.205.227.363.374.473.147.11.308.187.484.231.176.044.345.066.506.066v1.936z" clip-rule="evenodd"></path></svg></button></div><div class="flex items-center" style="margin: 4px;"><button class="rounded px-3 py-1.5 font-medium items-center whitespace-nowrap transition-all focus:outline-none inline-flex hover:bg-fill-3 dark:hover:bg-dark-fill-3 ml-auto !p-1"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor" class="h-4 w-4 text-gray-6 dark:text-dark-gray-6"><path fill-rule="evenodd" d="M5.725 9.255h2.843a1 1 0 110 2H3.2a1 1 0 01-1-1V4.887a1 1 0 012 0v3.056l2.445-2.297a9.053 9.053 0 11-2.142 9.415 1 1 0 011.886-.665 7.053 7.053 0 1010.064-8.515 7.063 7.063 0 00-8.417 1.202L5.725 9.255z" clip-rule="evenodd"></path></svg></button></div><div class="flex items-center" style="margin: 4px;"><button class="rounded font-medium items-center whitespace-nowrap transition-all focus:outline-none inline-flex hover:bg-fill-3 dark:hover:bg-dark-fill-3 ml-auto p-1"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor" class="h-4 w-4 text-gray-6 dark:text-dark-gray-6"><path fill-rule="evenodd" d="M15.667 10.333v3.334h1.666a3.667 3.667 0 11-3.666 3.666v-1.666h-3.334v1.666a3.667 3.667 0 11-3.666-3.666h1.666v-3.334H6.667a3.667 3.667 0 113.666-3.666v1.666h3.334V6.667a3.667 3.667 0 113.666 3.666h-1.666zm-5.334 0v3.334h3.334v-3.334h-3.334zm-2-2V6.667a1.667 1.667 0 10-1.666 1.666h1.666zm-1.666 7.334a1.667 1.667 0 101.666 1.666v-1.666H6.667zm9 1.666a1.667 1.667 0 101.666-1.666h-1.666v1.666zm1.666-9a1.667 1.667 0 10-1.666-1.666v1.666h1.666z" clip-rule="evenodd"></path></svg></button></div><div class="flex items-center" style="margin: 4px;"><button class="rounded px-3 py-1.5 font-medium items-center whitespace-nowrap transition-all focus:outline-none inline-flex hover:bg-fill-3 dark:hover:bg-dark-fill-3 ml-auto !p-1"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor" class="h-4 w-4 text-gray-6 dark:text-dark-gray-6"><path fill-rule="evenodd" d="M7.174 5.619a8.064 8.064 0 011.635-.946l.29-1.158A2 2 0 0111.039 2h1.922a2 2 0 011.94 1.515l.29 1.158c.584.252 1.132.57 1.635.946l1.15-.329a2 2 0 012.282.923l.961 1.665a2 2 0 01-.342 2.437l-.86.832a8.151 8.151 0 010 1.888l.86.83a2 2 0 01.342 2.438l-.96 1.665a2 2 0 01-2.283.923l-1.15-.329a8.063 8.063 0 01-1.635.946l-.29 1.158a2 2 0 01-1.94 1.515H11.04a2 2 0 01-1.94-1.515l-.29-1.158a8.064 8.064 0 01-1.635-.946l-1.15.329a2 2 0 01-2.282-.923l-.961-1.665a2 2 0 01.342-2.437l.86-.831a8.158 8.158 0 010-1.889l-.86-.83a2 2 0 01-.342-2.438l.96-1.665a2 2 0 012.283-.923l1.15.329zm-1.7 1.594l-.961 1.665 1.57 1.518-.114.982a6.157 6.157 0 000 1.425l.114.982-1.57 1.518.96 1.665 2.104-.601.794.593c.38.284.793.523 1.23.711l.908.392.53 2.118h1.922l.53-2.118.909-.392a6.07 6.07 0 001.23-.711l.793-.593 2.103.601.961-1.665-1.57-1.518.114-.982a6.172 6.172 0 000-1.425l-.114-.982 1.57-1.518-.96-1.665-2.104.601-.794-.593a6.067 6.067 0 00-1.23-.71l-.908-.392L12.96 4H11.04l-.53 2.119-.909.391a6.064 6.064 0 00-1.23.711l-.793.593-2.103-.601zM12 16a4 4 0 100-8 4 4 0 000 8zm0-2a2 2 0 110-4 2 2 0 010 4z" clip-rule="evenodd"></path></svg></button></div><div class="flex items-center" style="margin: 4px;"><button class="rounded px-3 py-1.5 font-medium items-center whitespace-nowrap transition-all focus:outline-none inline-flex hover:bg-fill-3 dark:hover:bg-dark-fill-3 ml-auto !p-1"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor" class="h-4 w-4 text-gray-6 dark:text-dark-gray-6"><path fill-rule="evenodd" d="M6.414 19H10a1 1 0 110 2H4a1 1 0 01-1-1v-6a1 1 0 112 0v3.586l4.293-4.293a1 1 0 011.414 1.414L6.414 19zM17.586 5H14a1 1 0 110-2h6a1 1 0 011 1v6a1 1 0 11-2 0V6.414l-4.293 4.293a1 1 0 01-1.414-1.414L17.586 5z" clip-rule="evenodd"></path></svg></button></div></div></div></div><div class="flex flex-1 flex-col overflow-hidden"><div class="flex-1 overflow-hidden"><div class="h-full w-full" data-keybinding-context="8" data-mode-id="java"><div class="monaco-editor no-user-select  showUnused showDeprecated vs-dark focused" role="code" data-uri="inmemory://model/8" style="width: 828px; height: 421px;"><div data-mprt="3" class="overflow-guard" style="width: 828px; height: 421px;"><div class="margin" role="presentation" aria-hidden="true" style="position: absolute; transform: translate3d(0px, 0px, 0px); contain: strict; top: -90px; height: 568px; width: 62px;"><div class="glyph-margin" style="left: 0px; width: 20px; height: 568px;"></div><div class="margin-view-zones" role="presentation" aria-hidden="true" style="position: absolute;"></div><div class="margin-view-overlays focused" role="presentation" aria-hidden="true" style="position: absolute; width: 62px; font-family: Consolas, &quot;Courier New&quot;, monospace; font-weight: normal; font-size: 15px; font-feature-settings: &quot;liga&quot; 0, &quot;calt&quot; 0; line-height: 20px; letter-spacing: 0px; height: 568px;"><div style="position:absolute;top:88px;width:100%;height:20px;"><div class="line-numbers" style="left:20px;width:25px;">5</div></div><div style="position:absolute;top:108px;width:100%;height:20px;"><div class="line-numbers" style="left:20px;width:25px;">6</div></div><div style="position:absolute;top:128px;width:100%;height:20px;"><div class="line-numbers" style="left:20px;width:25px;">7</div></div><div style="position:absolute;top:148px;width:100%;height:20px;"><div class="line-numbers" style="left:20px;width:25px;">8</div></div><div style="position:absolute;top:168px;width:100%;height:20px;"><div class="line-numbers" style="left:20px;width:25px;">9</div></div><div style="position:absolute;top:188px;width:100%;height:20px;"><div class="line-numbers" style="left:20px;width:25px;">10</div></div><div style="position:absolute;top:208px;width:100%;height:20px;"><div class="line-numbers" style="left:20px;width:25px;">11</div></div><div style="position:absolute;top:228px;width:100%;height:20px;"></div><div style="position:absolute;top:248px;width:100%;height:20px;"><div class="line-numbers" style="left:20px;width:25px;">12</div></div><div style="position:absolute;top:268px;width:100%;height:20px;"><div class="line-numbers" style="left:20px;width:25px;">13</div></div><div style="position:absolute;top:288px;width:100%;height:20px;"><div class="line-numbers" style="left:20px;width:25px;">14</div></div><div style="position:absolute;top:308px;width:100%;height:20px;"><div class="line-numbers" style="left:20px;width:25px;">15</div></div><div style="position:absolute;top:328px;width:100%;height:20px;"><div class="line-numbers" style="left:20px;width:25px;">16</div></div><div style="position:absolute;top:348px;width:100%;height:20px;"><div class="line-numbers" style="left:20px;width:25px;">17</div></div><div style="position:absolute;top:368px;width:100%;height:20px;"><div class="line-numbers" style="left:20px;width:25px;">18</div></div><div style="position:absolute;top:388px;width:100%;height:20px;"><div class="line-numbers" style="left:20px;width:25px;">19</div></div><div style="position:absolute;top:408px;width:100%;height:20px;"><div class="line-numbers" style="left:20px;width:25px;">20</div></div><div style="position:absolute;top:428px;width:100%;height:20px;"><div class="line-numbers" style="left:20px;width:25px;">21</div></div><div style="position:absolute;top:448px;width:100%;height:20px;"><div class="line-numbers" style="left:20px;width:25px;">22</div></div><div style="position:absolute;top:468px;width:100%;height:20px;"><div class="line-numbers" style="left:20px;width:25px;">23</div></div><div style="position:absolute;top:488px;width:100%;height:20px;"><div class="line-numbers" style="left:20px;width:25px;">24</div></div><div style="position:absolute;top:508px;width:100%;height:20px;"><div class="line-numbers" style="left:20px;width:25px;">25</div></div></div></div><div class="monaco-scrollable-element editor-scrollable vs-dark" role="presentation" data-mprt="5" style="position: absolute; overflow: hidden; left: 62px; height: 421px; width: 766px;"><div class="lines-content monaco-editor-background" style="position: absolute; overflow: hidden; width: 1e+06px; height: 1e+06px; transform: translate3d(0px, 0px, 0px); contain: strict; top: -90px; left: 0px;"><div class="view-overlays focused" role="presentation" aria-hidden="true" style="position: absolute; height: 0px; width: 766px;"><div style="position:absolute;top:88px;width:100%;height:20px;"><div class="core-guide core-guide-indent-active vertical" style="left:0px;height:20px;width:8.24609375px"></div><div class="core-guide core-guide-indent vertical" style="left:32.984375px;height:20px;width:8.24609375px"></div><div class="core-guide core-guide-indent vertical" style="left:65.96875px;height:20px;width:8.24609375px"></div></div><div style="position:absolute;top:108px;width:100%;height:20px;"><div class="core-guide core-guide-indent-active vertical" style="left:0px;height:20px;width:8.24609375px"></div><div class="core-guide core-guide-indent vertical" style="left:32.984375px;height:20px;width:8.24609375px"></div><div class="core-guide core-guide-indent vertical" style="left:65.96875px;height:20px;width:8.24609375px"></div></div><div style="position:absolute;top:128px;width:100%;height:20px;"><div class="core-guide core-guide-indent-active vertical" style="left:0px;height:20px;width:8.24609375px"></div><div class="core-guide core-guide-indent vertical" style="left:32.984375px;height:20px;width:8.24609375px"></div></div><div style="position:absolute;top:148px;width:100%;height:20px;"><div class="core-guide core-guide-indent-active vertical" style="left:0px;height:20px;width:8.24609375px"></div><div class="core-guide core-guide-indent vertical" style="left:32.984375px;height:20px;width:8.24609375px"></div></div><div style="position:absolute;top:168px;width:100%;height:20px;"><div class="core-guide core-guide-indent-active vertical" style="left:0px;height:20px;width:8.24609375px"></div></div><div style="position:absolute;top:188px;width:100%;height:20px;"><div class="core-guide core-guide-indent-active vertical" style="left:0px;height:20px;width:8.24609375px"></div></div><div style="position:absolute;top:208px;width:100%;height:20px;"><div class="core-guide core-guide-indent-active vertical" style="left:0px;height:20px;width:8.24609375px"></div></div><div style="position:absolute;top:228px;width:100%;height:20px;"></div><div style="position:absolute;top:248px;width:100%;height:20px;"><div class="core-guide core-guide-indent-active vertical" style="left:0px;height:20px;width:8.24609375px"></div><div class="core-guide core-guide-indent vertical" style="left:32.984375px;height:20px;width:8.24609375px"></div></div><div style="position:absolute;top:268px;width:100%;height:20px;"><div class="core-guide core-guide-indent-active vertical" style="left:0px;height:20px;width:8.24609375px"></div><div class="core-guide core-guide-indent vertical" style="left:32.984375px;height:20px;width:8.24609375px"></div><div class="core-guide core-guide-indent vertical" style="left:65.96875px;height:20px;width:8.24609375px"></div></div><div style="position:absolute;top:288px;width:100%;height:20px;"><div class="core-guide core-guide-indent-active vertical" style="left:0px;height:20px;width:8.24609375px"></div><div class="core-guide core-guide-indent vertical" style="left:32.984375px;height:20px;width:8.24609375px"></div></div><div style="position:absolute;top:308px;width:100%;height:20px;"><div class="core-guide core-guide-indent-active vertical" style="left:0px;height:20px;width:8.24609375px"></div><div class="core-guide core-guide-indent vertical" style="left:32.984375px;height:20px;width:8.24609375px"></div></div><div style="position:absolute;top:328px;width:100%;height:20px;"><div class="core-guide core-guide-indent-active vertical" style="left:0px;height:20px;width:8.24609375px"></div><div class="core-guide core-guide-indent vertical" style="left:32.984375px;height:20px;width:8.24609375px"></div></div><div style="position:absolute;top:348px;width:100%;height:20px;"><div class="core-guide core-guide-indent-active vertical" style="left:0px;height:20px;width:8.24609375px"></div><div class="core-guide core-guide-indent vertical" style="left:32.984375px;height:20px;width:8.24609375px"></div></div><div style="position:absolute;top:368px;width:100%;height:20px;"><div class="core-guide core-guide-indent-active vertical" style="left:0px;height:20px;width:8.24609375px"></div><div class="core-guide core-guide-indent vertical" style="left:32.984375px;height:20px;width:8.24609375px"></div></div><div style="position:absolute;top:388px;width:100%;height:20px;"><div class="core-guide core-guide-indent-active vertical" style="left:0px;height:20px;width:8.24609375px"></div><div class="core-guide core-guide-indent vertical" style="left:32.984375px;height:20px;width:8.24609375px"></div><div class="core-guide core-guide-indent vertical" style="left:65.96875px;height:20px;width:8.24609375px"></div></div><div style="position:absolute;top:408px;width:100%;height:20px;"><div class="core-guide core-guide-indent-active vertical" style="left:0px;height:20px;width:8.24609375px"></div><div class="core-guide core-guide-indent vertical" style="left:32.984375px;height:20px;width:8.24609375px"></div></div><div style="position:absolute;top:428px;width:100%;height:20px;"><div class="core-guide core-guide-indent-active vertical" style="left:0px;height:20px;width:8.24609375px"></div><div class="core-guide core-guide-indent vertical" style="left:32.984375px;height:20px;width:8.24609375px"></div></div><div style="position:absolute;top:448px;width:100%;height:20px;"><div class="core-guide core-guide-indent-active vertical" style="left:0px;height:20px;width:8.24609375px"></div><div class="core-guide core-guide-indent vertical" style="left:32.984375px;height:20px;width:8.24609375px"></div></div><div style="position:absolute;top:468px;width:100%;height:20px;"><div class="core-guide core-guide-indent-active vertical" style="left:0px;height:20px;width:8.24609375px"></div><div class="core-guide core-guide-indent vertical" style="left:32.984375px;height:20px;width:8.24609375px"></div><div class="core-guide core-guide-indent vertical" style="left:65.96875px;height:20px;width:8.24609375px"></div></div><div style="position:absolute;top:488px;width:100%;height:20px;"><div class="core-guide core-guide-indent-active vertical" style="left:0px;height:20px;width:8.24609375px"></div><div class="core-guide core-guide-indent vertical" style="left:32.984375px;height:20px;width:8.24609375px"></div></div><div style="position:absolute;top:508px;width:100%;height:20px;"><div class="core-guide core-guide-indent-active vertical" style="left:0px;height:20px;width:8.24609375px"></div><div class="core-guide core-guide-indent vertical" style="left:32.984375px;height:20px;width:8.24609375px"></div></div></div><div role="presentation" aria-hidden="true" class="view-rulers"></div><div class="view-zones" role="presentation" aria-hidden="true" style="position: absolute;"></div><div class="view-lines monaco-mouse-cursor-text" role="presentation" aria-hidden="true" data-mprt="7" style="position: absolute; font-family: Consolas, &quot;Courier New&quot;, monospace; font-weight: normal; font-size: 15px; font-feature-settings: &quot;liga&quot; 0, &quot;calt&quot; 0; line-height: 20px; letter-spacing: 0px; width: 766px; height: 568px;"><div style="top:88px;height:20px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="mtk10">List</span><span class="mtk1">&lt;</span><span class="mtk10">Integer</span><span class="mtk1">&gt;&nbsp;</span><span class="mtk14">list</span><span class="mtk1">&nbsp;=&nbsp;</span><span class="mtk13">new</span><span class="mtk1">&nbsp;</span><span class="mtk10">ArrayList</span><span class="mtk1">&lt;&gt;();</span></span></div><div style="top:108px;height:20px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="mtk11">findUsingBackTracking</span><span class="mtk1">(i,&nbsp;k,&nbsp;n,&nbsp;list,&nbsp;set);</span></span></div><div style="top:128px;height:20px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</span></span></div><div style="top:148px;height:20px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="mtk13">return</span><span class="mtk1">&nbsp;</span><span class="mtk13">new</span><span class="mtk1">&nbsp;</span><span class="mtk10">ArrayList</span><span class="mtk1">&lt;&gt;(set);</span></span></div><div style="top:168px;height:20px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;}</span></span></div><div style="top:188px;height:20px;" class="view-line"><span><span></span></span></div><div style="top:208px;height:20px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="mtk4">private</span><span class="mtk1">&nbsp;</span><span class="mtk10">void</span><span class="mtk1">&nbsp;</span><span class="mtk11">findUsingBackTracking</span><span class="mtk1">(</span><span class="mtk10">int</span><span class="mtk1">&nbsp;</span><span class="mtk14">curr</span><span class="mtk1">,&nbsp;</span><span class="mtk10">int</span><span class="mtk1">&nbsp;</span><span class="mtk14">k</span><span class="mtk1">,&nbsp;</span><span class="mtk10">int</span><span class="mtk1">&nbsp;</span><span class="mtk14">n</span><span class="mtk1">,&nbsp;</span><span class="mtk10">List</span><span class="mtk1">&lt;</span><span class="mtk10">Integer</span><span class="mtk1">&gt;&nbsp;</span><span class="mtk14">list</span><span class="mtk1">,&nbsp;</span></span></div><div style="top:228px;height:20px;" class="view-line"><span><span class="mtk10">Set</span><span class="mtk1">&lt;</span><span class="mtk10">List</span><span class="mtk1">&lt;</span><span class="mtk10">Integer</span><span class="mtk1">&gt;&gt;&nbsp;</span><span class="mtk14">set</span><span class="mtk1">)&nbsp;{</span></span></div><div style="top:248px;height:20px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="mtk13">if</span><span class="mtk1">&nbsp;(</span><span class="mtk14">list</span><span class="mtk1">.</span><span class="mtk11">size</span><span class="mtk1">()&nbsp;&gt;&nbsp;k)&nbsp;{</span></span></div><div style="top:268px;height:20px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="mtk13">return</span><span class="mtk1">;</span></span></div><div style="top:288px;height:20px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</span></span></div><div style="top:308px;height:20px;" class="view-line"><span><span></span></span></div><div style="top:328px;height:20px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="mtk14">list</span><span class="mtk1">.</span><span class="mtk11">add</span><span class="mtk1">(curr);</span></span></div><div style="top:348px;height:20px;" class="view-line"><span><span></span></span></div><div style="top:368px;height:20px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="mtk13">if</span><span class="mtk1">&nbsp;(</span><span class="mtk14">list</span><span class="mtk1">.</span><span class="mtk11">size</span><span class="mtk1">()&nbsp;==&nbsp;k)&nbsp;{</span></span></div><div style="top:388px;height:20px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="mtk14">set</span><span class="mtk1">.</span><span class="mtk11">add</span><span class="mtk1">(</span><span class="mtk13">new</span><span class="mtk1">&nbsp;</span><span class="mtk10">ArrayList</span><span class="mtk1">&lt;&gt;(list));</span></span></div><div style="top:408px;height:20px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</span></span></div><div style="top:428px;height:20px;" class="view-line"><span><span></span></span></div><div style="top:448px;height:20px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="mtk13">for</span><span class="mtk1">&nbsp;(</span><span class="mtk10">int</span><span class="mtk1">&nbsp;</span><span class="mtk14">i</span><span class="mtk1">&nbsp;=&nbsp;curr&nbsp;+&nbsp;</span><span class="mtk7">1</span><span class="mtk1">;&nbsp;i&nbsp;&lt;=&nbsp;n;&nbsp;i++)&nbsp;{</span></span></div><div style="top:468px;height:20px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="mtk11">findUsingBackTracking</span><span class="mtk1">(i,&nbsp;k,&nbsp;n,&nbsp;list,&nbsp;set);</span></span></div><div style="top:488px;height:20px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</span></span></div><div style="top:508px;height:20px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="mtk14">list</span><span class="mtk1">.</span><span class="mtk11">remove</span><span class="mtk1">(</span><span class="mtk14">list</span><span class="mtk1">.</span><span class="mtk11">size</span><span class="mtk1">()&nbsp;-&nbsp;</span><span class="mtk7">1</span><span class="mtk1">);</span></span></div></div><div data-mprt="1" class="contentWidgets" style="position: absolute; top: 0px;"></div><div role="presentation" aria-hidden="true" class="cursors-layer cursor-line-style cursor-solid"><div class="cursor monaco-mouse-cursor-text " style="height: 20px; top: 548px; left: 7px; font-family: Consolas, &quot;Courier New&quot;, monospace; font-weight: normal; font-size: 15px; font-feature-settings: &quot;liga&quot; 0, &quot;calt&quot; 0; line-height: 20px; letter-spacing: 0px; display: none; visibility: hidden; width: 2px;"></div></div></div><div role="presentation" aria-hidden="true" class="invisible scrollbar horizontal" style="position: absolute; width: 752px; height: 12px; left: 0px; bottom: 0px;"><div class="slider" style="position: absolute; top: 0px; left: 0px; height: 12px; transform: translate3d(0px, 0px, 0px); contain: strict; width: 752px;"></div></div><canvas class="decorationsOverviewRuler" aria-hidden="true" width="14" height="421" style="position: absolute; transform: translate3d(0px, 0px, 0px); contain: strict; top: 0px; right: 0px; width: 14px; height: 421px; display: block;"></canvas><div role="presentation" aria-hidden="true" class="invisible scrollbar vertical fade" style="position: absolute; width: 14px; height: 421px; right: 0px; top: 0px;"><div class="slider" style="position: absolute; top: 67px; left: 0px; width: 14px; transform: translate3d(0px, 0px, 0px); contain: strict; height: 312px;"></div></div></div><div role="presentation" aria-hidden="true" class="scroll-decoration" style="width: 828px;"></div><textarea data-mprt="6" class="inputarea monaco-mouse-cursor-text focus-visible" wrap="off" autocorrect="off" autocapitalize="off" autocomplete="off" spellcheck="false" aria-label="Editor content;Press Alt+F1 for Accessibility Options." tabindex="0" role="textbox" aria-roledescription="editor" aria-multiline="true" aria-haspopup="false" aria-autocomplete="both" style="font-family: Consolas, &quot;Courier New&quot;, monospace; font-weight: normal; font-size: 15px; font-feature-settings: &quot;liga&quot; 0, &quot;calt&quot; 0; line-height: 20px; letter-spacing: 0px; top: 0px; left: 0px; width: 1px; height: 1px;" data-focus-visible-added=""></textarea><div class="monaco-editor-background textAreaCover margin" style="position: absolute; top: 0px; left: 0px; width: 1px; height: 1px;"></div><div data-mprt="4" class="overlayWidgets" style="width: 828px;"><div class="accessibilityHelpWidget" role="dialog" aria-hidden="true" widgetid="editor.contrib.accessibilityHelpWidget" style="display: none; position: absolute;"><div role="document"></div></div><div widgetid="editor.contrib.quickInputWidget" style="position: absolute; top: 0px; right: 50%;"></div></div><div data-mprt="8" class="minimap slider-mouseover" role="presentation" aria-hidden="true" style="position: absolute; left: 0px; width: 0px; height: 421px;"><div class="minimap-shadow-hidden" style="height: 421px;"></div><canvas width="0" height="421" style="position: absolute; left: 0px; width: 0px; height: 421px;"></canvas><canvas class="minimap-decorations-layer" width="0" height="421" style="position: absolute; left: 0px; width: 0px; height: 421px;"></canvas><div class="minimap-slider" style="position: absolute; transform: translate3d(0px, 0px, 0px); contain: strict; width: 0px;"><div class="minimap-slider-horizontal" style="position: absolute; width: 0px; height: 0px;"></div></div></div></div><div data-mprt="2" class="overflowingContentWidgets"></div></div></div></div><div class="text-label-2 dark:text-dark-label-2 bg-gray-2 dark:bg-dark-gray-2"></div></div><div class="absolute right-[25px] bottom-[20px] z-overlay"><a aria-label="feedback" href="https://leetcode.com/discuss/general-discussion/2238519/Share-your-feedback-to-the-new-question-detail-page" target="_blank" rel="noreferrer"><div class="shadow-level1 dark:shadow-dark-level1 bg-layer-1 dark:bg-dark-layer-1 cursor-pointer group h-12 w-12 rounded-lg flex mb-3 last:mb-0"><div class="hover:bg-fill-4 dark:hover:bg-dark-fill-4 h-full w-full rounded-lg flex"><div class="w-6 m-auto"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor" class="w-full h-full text-blue-s dark:text-dark-blue-s"><path fill-rule="evenodd" d="M20.494 16.249a9.5 9.5 0 01-8.491 5.25 9.38 9.38 0 01-3.939-.855l-4.376.838a1 1 0 01-1.17-1.17l.838-4.376a9.377 9.377 0 01-.856-3.937 9.498 9.498 0 015.25-8.492A9.378 9.378 0 0112 2.5l.555.001c4.825.266 8.678 4.119 8.945 8.999v.497a9.381 9.381 0 01-1.006 4.252zM4.76 19.24l3.252-.622a1 1 0 01.64.09A7.382 7.382 0 0012 19.5a7.5 7.5 0 006.706-4.147A7.386 7.386 0 0019.5 12l.002-.445c-.21-3.807-3.25-6.847-7.002-7.055h-.502a7.385 7.385 0 00-3.35.794A7.5 7.5 0 004.5 12.002a7.38 7.38 0 00.793 3.347 1 1 0 01.09.639L4.76 19.24zM7.9 9.35c0 .718.58 1.3 1.294 1.3h.012c.715 0 1.294-.582 1.294-1.3 0-.718-.58-1.3-1.294-1.3h-.012c-.715 0-1.294.582-1.294 1.3zm6.893 1.3a1.297 1.297 0 01-1.293-1.3c0-.718.58-1.3 1.293-1.3h.014c.714 0 1.293.582 1.293 1.3 0 .718-.58 1.3-1.294 1.3h-.012zm.915 3.708a5.244 5.244 0 01-7.416 0 1 1 0 111.414-1.415 3.244 3.244 0 004.588 0 1 1 0 011.414 1.415z" clip-rule="evenodd"></path></svg></div></div></div></a></div></div></div></div></div><div class="group flex w-full flex-col items-center justify-center transition hover:cursor-row-resize hover:bg-blue-s dark:hover:bg-dark-blue-s h-0 ssg__qd-console-position--right"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 14 2" width="14" height="2" fill="currentColor" class="transition text-gray-3 dark:text-dark-gray-3 group-hover:text-white dark:group-hover:text-white"><circle r="1" transform="matrix(-1 0 0 1 1 1)"></circle><circle r="1" transform="matrix(-1 0 0 1 7 1)"></circle><circle r="1" transform="matrix(-1 0 0 1 13 1)"></circle></svg></div><div class="ssg__qd-console-position--right"><div class="flex h-full flex-col"><div class="flex h-full w-full flex-col bg-layer-1 dark:bg-dark-layer-1"><div class="shrink-0"><div class="flex w-full bg-layer-1 dark:bg-dark-layer-1"><div class="mx-5 my-[10px] flex w-full"><div class="mr-2 flex flex-1 flex-nowrap items-center space-x-4"><button class="px-3 py-1.5 font-medium items-center whitespace-nowrap transition-all focus:outline-none inline-flex bg-fill-3 dark:bg-dark-fill-3 hover:bg-fill-2 dark:hover:bg-dark-fill-2 text-label-2 dark:text-dark-label-2 rounded-lg pl-3 pr-2">Console<div class="ml-1 transform transition"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor" class="fill-gray-6 text-[20px] dark:fill-dark-gray-6"><path fill-rule="evenodd" d="M16.293 14.707a1 1 0 001.414-1.414l-5-5a1 1 0 00-1.414 0l-5 5a1 1 0 101.414 1.414L12 10.414l4.293 4.293z" clip-rule="evenodd"></path></svg></div></button></div><div class="flex flex-row items-center justify-center"><img src="./Combinations - LeetCode_files/dark-judging-723b3c3e728a574bc2a2d4b89a10d4d7.gif" alt="Judging..." class="mr-2 h-8 w-8 hidden"><img src="./Combinations - LeetCode_files/dark-pending-f313d6fe32951fb6b4d48ad3ee4f3821.gif" alt="Pending..." class="mr-2 h-8 w-8 hidden"></div><div class="ml-auto flex items-center space-x-4"><button class="rounded font-medium items-center whitespace-nowrap transition-all focus:outline-none inline-flex p-[6px] cursor-not-allowed opacity-50 hover:bg-fill-3 dark:hover:bg-dark-fill-3"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor" class="text-gray-6 dark:text-dark-gray-6 h-5 w-5"><path fill-rule="evenodd" d="M12 4a2 2 0 00-2 2h4a2 2 0 00-2-2zm3.924 2.384A.997.997 0 0016 6a4 4 0 00-8 0c0 .136.027.265.076.384a5.015 5.015 0 00-1.97 1.48A3.002 3.002 0 014 5a1 1 0 00-2 0 5.001 5.001 0 003.182 4.659A5.005 5.005 0 005 11v1H3a1 1 0 100 2h2v1c0 .425.038.84.11 1.244A5 5 0 002 20.874a1 1 0 102 0c0-1.208.715-2.251 1.746-2.726A7 7 0 0012 22a7 7 0 006.254-3.852A3.002 3.002 0 0120 20.874a1 1 0 102 0 5 5 0 00-3.11-4.63c.072-.404.11-.82.11-1.244v-1h2a1 1 0 100-2h-2v-1c0-.465-.063-.914-.182-1.341A5.001 5.001 0 0022 5a1 1 0 10-2 0 3.002 3.002 0 01-2.105 2.865 5.015 5.015 0 00-1.971-1.481zM17 11a3 3 0 00-3-3h-1v11.9a5.002 5.002 0 004-4.9v-4zm-6 8.9V8h-1a3 3 0 00-3 3v4a5.002 5.002 0 004 4.9z" clip-rule="evenodd"></path></svg></button><button class="px-3 py-1.5 font-medium items-center whitespace-nowrap transition-all focus:outline-none inline-flex bg-fill-3 dark:bg-dark-fill-3 hover:bg-fill-2 dark:hover:bg-dark-fill-2 text-label-2 dark:text-dark-label-2 rounded-lg">Run</button><button class="px-3 py-1.5 font-medium items-center whitespace-nowrap transition-all focus:outline-none inline-flex text-label-r bg-green-s dark:bg-dark-green-s hover:bg-green-3 dark:hover:bg-dark-green-3 rounded-lg">Submit</button></div></div></div></div></div></div></div></div></div></div></div></div></div></div><span></span></div><script id="__NEXT_DATA__" type="application/json">{"props":{"pageProps":{}},"page":"/problems/[slug]/[[...tab]]","query":{},"buildId":"5t12MQGNqIncLszIGV8Ce","nextExport":true,"autoExport":true,"isFallback":false,"scriptLoader":[]}</script><div id="modal-root"></div><next-route-announcer><p aria-live="assertive" id="__next-route-announcer__" role="alert" style="border: 0px; clip: rect(0px, 0px, 0px, 0px); height: 1px; margin: -1px; overflow: hidden; padding: 0px; position: absolute; width: 1px; white-space: nowrap; overflow-wrap: normal;">Combinations - LeetCode</p></next-route-announcer><div class="chakra-portal"><ul role="region" aria-live="polite" id="chakra-toast-manager-top" style="position: fixed; z-index: 5500; pointer-events: none; display: flex; flex-direction: column; margin: 0px auto; top: env(safe-area-inset-top, 0px); right: env(safe-area-inset-right, 0px); left: env(safe-area-inset-left, 0px);"></ul><ul role="region" aria-live="polite" id="chakra-toast-manager-top-left" style="position: fixed; z-index: 5500; pointer-events: none; display: flex; flex-direction: column; top: env(safe-area-inset-top, 0px); left: env(safe-area-inset-left, 0px);"></ul><ul role="region" aria-live="polite" id="chakra-toast-manager-top-right" style="position: fixed; z-index: 5500; pointer-events: none; display: flex; flex-direction: column; top: env(safe-area-inset-top, 0px); right: env(safe-area-inset-right, 0px);"></ul><ul role="region" aria-live="polite" id="chakra-toast-manager-bottom-left" style="position: fixed; z-index: 5500; pointer-events: none; display: flex; flex-direction: column; bottom: env(safe-area-inset-bottom, 0px); left: env(safe-area-inset-left, 0px);"></ul><ul role="region" aria-live="polite" id="chakra-toast-manager-bottom" style="position: fixed; z-index: 5500; pointer-events: none; display: flex; flex-direction: column; margin: 0px auto; bottom: env(safe-area-inset-bottom, 0px); right: env(safe-area-inset-right, 0px); left: env(safe-area-inset-left, 0px);"></ul><ul role="region" aria-live="polite" id="chakra-toast-manager-bottom-right" style="position: fixed; z-index: 5500; pointer-events: none; display: flex; flex-direction: column; bottom: env(safe-area-inset-bottom, 0px); right: env(safe-area-inset-right, 0px);"></ul></div><script src="./Combinations - LeetCode_files/monaco-21a0e60c9ebdbb394e84_0.33.14.js.download" crossorigin="anonymous"></script><div class="monaco-aria-container"><div class="monaco-alert" role="alert" aria-atomic="true"></div><div class="monaco-alert" role="alert" aria-atomic="true"></div><div class="monaco-status" role="complementary" aria-live="polite" aria-atomic="true"></div><div class="monaco-status" role="complementary" aria-live="polite" aria-atomic="true"></div></div><script src="./Combinations - LeetCode_files/[[...ids]]-35dbdb1742054e0e.js.download"></script><div id="headlessui-portal-root"><div data-headlessui-portal=""></div><div data-headlessui-portal=""></div></div><div class="chakra-portal"><ul role="region" aria-live="polite" id="chakra-toast-manager-top" style="position: fixed; z-index: 5500; pointer-events: none; display: flex; flex-direction: column; margin: 0px auto; top: env(safe-area-inset-top, 0px); right: env(safe-area-inset-right, 0px); left: env(safe-area-inset-left, 0px);"></ul><ul role="region" aria-live="polite" id="chakra-toast-manager-top-left" style="position: fixed; z-index: 5500; pointer-events: none; display: flex; flex-direction: column; top: env(safe-area-inset-top, 0px); left: env(safe-area-inset-left, 0px);"></ul><ul role="region" aria-live="polite" id="chakra-toast-manager-top-right" style="position: fixed; z-index: 5500; pointer-events: none; display: flex; flex-direction: column; top: env(safe-area-inset-top, 0px); right: env(safe-area-inset-right, 0px);"></ul><ul role="region" aria-live="polite" id="chakra-toast-manager-bottom-left" style="position: fixed; z-index: 5500; pointer-events: none; display: flex; flex-direction: column; bottom: env(safe-area-inset-bottom, 0px); left: env(safe-area-inset-left, 0px);"></ul><ul role="region" aria-live="polite" id="chakra-toast-manager-bottom" style="position: fixed; z-index: 5500; pointer-events: none; display: flex; flex-direction: column; margin: 0px auto; bottom: env(safe-area-inset-bottom, 0px); right: env(safe-area-inset-right, 0px); left: env(safe-area-inset-left, 0px);"></ul><ul role="region" aria-live="polite" id="chakra-toast-manager-bottom-right" style="position: fixed; z-index: 5500; pointer-events: none; display: flex; flex-direction: column; bottom: env(safe-area-inset-bottom, 0px); right: env(safe-area-inset-right, 0px);"></ul></div></body><grammarly-desktop-integration data-grammarly-shadow-root="true"></grammarly-desktop-integration></html>