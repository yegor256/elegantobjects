<img src="https://rawgithub.com/yegor256/elegantobjects/master/cactus.svg" height="100px"/>

[![License](https://img.shields.io/badge/license-MIT-green.svg)](https://github.com/yegor256/takes/blob/master/LICENSE.txt)

This repository contains all code samples from
[Elegant Objects](http://www.yegor256.com/elegant-objects.html) book,
both
[vol.1](http://goo.gl/W2WVMk) and
[vol.2](http://amzn.to/2oYNncj).

## Changelog

7/9 [`af90e7f01`]() (thanks to Mauricio Togneri)

  * new champion: `android.view.View` into Vol.2

7/2 [`7df68b002`](https://github.com/zerocracy/books/commit/7df68b002) (thanks to Christian Köstlin)

  * "a Factory Pattern" replaced with "the Factory Pattern"
  * "CRLF" renamed to "EOL" in Section 2.5
  * "synchronized(this.dollars)" replaced with "synchronized(this)" in Section 2.6.6

5/7 [`4c94462b3`](https://github.com/zerocracy/books/commit/4c94462b3) (thanks to Krzysztof Szafrański)

  * Foot note about inevitable recursion in Fibo example

4/21 (thanks to John Page): multiple small typos

4/18/2017 **v1.4** published (with Vol.2).

2/10 [`20cfbf9`](https://github.com/zerocracy/books/commit/20cfbf95184f4a83d07c1fc662d3f4ec2b306017) (thanks to Andrey Valyaev)

  * The entire C++ example in Section 3.4 to the one you can
    find in [this file](https://github.com/yegor256/elegantobjects/blob/master/vol-1/chapter-3/3.4/immutable-list-cpp/main.cpp).
  * Inaccurate C++ attribute definition fixed in Section 3.5.1:
    `const std::string& print();` replaced with `std::string print() const;`.

2/8 [`9d84f5f`](https://github.com/zerocracy/books/commit/9d84f5f21c9a97bac9dd2b58ef6b243e13fd3c0d) (thanks to Andrey Valyaev):

  * Typo fixed in Section 2.5: `"{ %s }"` replaced with `"{ %s }%s"`.
  * Typo fixed in Section 3.2.2: `def events` replaced with `def evens`.

1/31 [`6a57308`](https://github.com/zerocracy/books/commit/6a57308ee6fad5db31ee74e3b74429837177ee8e) (thanks to Artem Gapchenko):

  * _Object Oriented Software Construction_ by Bertrand Meyer was mentioned
    in a footnote, in Section 2.4.

1/7/2017 **v1.3** published.

1/5 [`6f69b54`](https://github.com/zerocracy/books/commit/6f69b545fac8db24dc8e7cc0e6a330ee95f454e8) (thanks to Ilya Vassilevsky):

  * Semi-colon removed from Ruby code in Section 1.1.
  * Type in Section 1.3, `Code` replaced with `Cash`.

1/1 [`29f0ae9`](https://github.com/zerocracy/books/commit/29f0ae9e08a04c11286a38ffd779870476bcf8f9):

  * Java code in Section 2.6.6 was replaced with the code
    from [this file](https://github.com/yegor256/elegantobjects/blob/master/vol-1/chapter-2/2.6.6/unsafe-cash/Main.java).

12/25 [`8126324`](https://github.com/zerocracy/books/commit/81263242faee149924cabb50525b1f904cd66b01):

  * Right after the long Java script in Section 2.6.6 I added this
    text: "Of course, the script must `shutdown()` the `svc` at the end.
    I skipped that part for the sake of brevity."

12/14 [`32db197`](https://github.com/zerocracy/books/commit/32db197592060403434f0fc78382f854a982a35c) (thanks to Andrey Valyaev):

  * Typo in Java script in Section 4.1, after
    `print("Can't print; it's not a title.")` goes `return;`.
  * Typo in Java script in Section 3.2.6:
    `fee = 2.5` replaced with `rate = 2.5` and
    `fee = 3.0` replaced with `rate = 3.0`.
  * Typo in Java declaration of interface `Exchange` in Section 2.9:
    `toUsd(String target)` replaced with `toUsd(String source)`
    and `return this.origin.rate("USD", target)` replaced with `return this.origin.rate(source, "USD")`.

9/12 [`9e3e7ff`](https://github.com/zerocracy/books/commit/9e3e7ff853fe6f21446ed65255cf2fff03f2eef6):

  * Typo in preface: `thew` replaced with `threw`.

8/20 **v1.2** published.

8/3 [`71eeb7d`](https://github.com/zerocracy/books/commit/71eeb7d769ae99499826a1105129a92f238c6774):

  * A new footnote added to the paragraph talking about
    `@RetryOnFailure` Java annotation in Section 4.2.4
    with a link to [aspects.jcabi.com](http://aspects.jcabi.com/).

7/15 [`13409df`](https://github.com/zerocracy/books/commit/13409dfb7ac44ebade4aca70629d43cbcd7ff077) (thanks to Nicole Cordes):

  * Typo in Section 1.1: `a extension` replaced with `an extension`.
  * Class renamed in Section 1.3: `IntegerAsString` to `StringAsInteger`.

6/28 [`44420be`](https://github.com/zerocracy/books/commit/44420bea21bbc686f48121e2885105431c6b3545):

  * C++ code fix in Section 4.4:
    `Text t = new Text("/tmp/test.txt")` replaced with
    `Text t("/tmp/test.txt")`.

5/25 **v1.1** published.

5/17 [`38f1ca8`](https://github.com/zerocracy/books/commit/38f1ca803545b26e7ebbf8dbe94efba4d1add943):

  * Broken section reference in Section 1.2 fixed.

4/20 [`9b245d0`](https://github.com/zerocracy/books/commit/9b245d0bab875b598a4697324176ac6a3880459b):

  * Spelling mistakes fixed and introduced automated spell checking.

2/22/2016 **v1.0** published.

