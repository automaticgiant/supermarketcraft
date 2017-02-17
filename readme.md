# tdp software craftsmanship workshop
## Kata01: Supermarket Pricing

---

### intro - 5m
brief us stuff

or should c1/tdp heavy stuff go here, 15 min?

---

### overview - 5m
where we talk about supermarket pricing

and some of the concerns that can be practiced with tdd

<iframe width="640" height="360" src="https://www.youtube.com/embed/iiiznDpoapQ?t=46" frameborder="0" allowfullscreen></iframe>

Note: describe kata - https://www.youtube.com/watch?v=auavC2MGnMU

---

#### system requirements - 10m
where we describe the system requirments for practicing the exercise

---

##### github account
- https://github.com/join?source=header-home

---

##### fork repo
- https://github.com/automaticgiant/supermarketcraft

---

##### codenvy.io
goto https://codenvy.io
- login with oauth (gh)
- import from gh (reload a few times if don't see repos), select fork
- java ready to go stack
- create
- profile->preferences->git->committer and fill out
- profile->preferences->ssh->vcs->gh button
- edit build command to have commandline be `clean compile test`
- press play

---

#### acceptance criteria - 5m
where we describe the initial requirements required to exercise the driver

---

### feature 1: nx sale - 10m
feature branch - apple
#### write a test
```java
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class AppleTest {
    @Test
    public void singlePrice(){
        // expected, actual
        assertEquals(1, Apple.subtotal(1));
    }
}
```

watch it fail

---

#### write some code
make it pass

```java
public class Apple {
    // does 3 for 2 deal
    static int singlePrice = 1;
    static int priceFor3 = 2;
    public static int subtotal(int qty) {
        //naive
        return singlePrice*qty;
}
```

commit/merge

Note: not necessary for this exercise until criteria met.

---

### hook up travis - 2m
- https://travis-ci.org/
talk about ci (don't forget to run tests, check pr automatically, don't build on broken code, history)

talk about test coverage benefits (prevent brittle code, catch regressions, frees you to iterate, facilitates teamwork)

---

### feature 2: bogo - 10m
feature branch
#### write a test
watch it fail
#### write some code
make it pass

commit/merge

---

# links
- [kata](http://codekata.com/kata/codekata-intro/)
- [kata backstory](http://codekata.com/kata/codekata-how-it-started/)
- [supermarket exercise](http://codekata.com/kata/kata01-supermarket-pricing/)

