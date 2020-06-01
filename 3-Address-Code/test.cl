class Main inherits IO {
  x: Int;
  s: String <- "Hello 3AC";
  ans1: Int;
  ans2: Int;
  main(): Object {{
    x <- in_int();
    ans1 <- fact1(x);
    ans2 <- fact2(x);
    out_int(ans1);
    out_string("\n");
    out_int(ans2);
    out_string("\n");
    fun(1);
    out_string("\n");
    fun("SSS");
    out_string("\n");
    fun(x = 1);
  }};

  fact1(n: Int): Int {
    if(n = 0) then 1
    else n * fact1(n - 1)
    fi
  };

  fact2(n: Int): Int {
    let ret: Int <- 1, i: Int <- 1 in {
      while(i <= n) loop {
        ret <- ret * i;
        i <- i + 1;
      }
      pool;
      ret;
    }
  };

  fun(obj: Object): Object {
    case obj of
      i: Int => out_int(i + 1);
      s: String => out_string(s);
      o: Object  => out_string("Boolean");
    esac
  };
};