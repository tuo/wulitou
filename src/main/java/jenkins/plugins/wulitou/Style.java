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

import hudson.model.Result;

/**
 * This class provides various wulitou' styles.
 * @author cliffano
 */
public enum Style {

    /**
     * Gisele B�ndchen.
     */
    THUMB_UP,
    /**
     * Lara Croft (Angelina Jolie).
     */
    ALERT,
    /**
     * Sumo player.
     */
    BAD_ASS;

    /**
     * Gets the style corresponding to the build result.
     * @param result
     *            the build result
     * @return the style
     */
    public static final Style get(final Result result) {
        Style style;
        if (Result.FAILURE.equals(result)) {
            style = BAD_ASS;
        } else if (Result.SUCCESS.equals(result)) {
            style = THUMB_UP;
        } else {
            style = ALERT;
        }
        return style;
    }
}
