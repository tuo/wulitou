/**
 * Copyright (c) 2009 Cliffano Subagio
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package jenkins.plugins.wulitou;

import java.util.Random;

/**
 * {@link FactGenerator} provides wulitou facts.
 * @author cliffano
 */
public class FactGenerator {








    /**
     * Random instance.
     */
    private static final Random RANDOM = new Random();

    /**
     * Retrieves a random fact.
     * @return a random fact
     */
    public String random() {
         String[] FACTS = new String[]{};
        try{
       FACTS = new String[]{
          new String("&#x6211;9&#x5c81;&#x535a;&#x89c8;&#x7fa4;&#x4e66;&#xff0c;20&#x5c81;&#x5230;&#x8fbe;&#x9876;&#x5cf0;&#xff0c; &#x5f80;&#x524d;300&#x5e74;&#x5f80;&#x540e;&#x63a8;300&#x5e74;&#xff0c; &#x6ca1;&#x6709;&#x4eba;&#x4f1a;&#x8d85;&#x8fc7;&#x6211;&#xff0c;&#x5728;&#x667a;&#x529b;&#x4e0a;&#x4ed6;&#x4eec;&#x662f;&#x4e0d;&#x53ef;&#x80fd;&#x6bd4;&#x6211;&#x5f3a;&#x7684; &#x90a3;&#x5c31;&#x5728;&#x8eab;&#x9ad8;&#x548c;&#x5916;&#x8c8c;&#x4e0a;&#x5f25;&#x8865;&#x5427;.")
//        "\"Big wulitou need big diamonds.\" Elizabeth Taylor",
//        "\"Put your hand on a hot stove for a minute, and it seems like an hour. Sit with a pretty girl for an hour, and it seems like a minute. That's relativity.\" Albert Einstein",
       };
    }catch(Exception e){

    }
        return FACTS[RANDOM.nextInt(FACTS.length)];
    }
}
