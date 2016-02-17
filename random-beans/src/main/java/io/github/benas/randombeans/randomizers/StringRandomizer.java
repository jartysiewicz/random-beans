/*
 * The MIT License
 *
 *   Copyright (c) 2016, Mahmoud Ben Hassine (mahmoud.benhassine@icloud.com)
 *
 *   Permission is hereby granted, free of charge, to any person obtaining a copy
 *   of this software and associated documentation files (the "Software"), to deal
 *   in the Software without restriction, including without limitation the rights
 *   to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *   copies of the Software, and to permit persons to whom the Software is
 *   furnished to do so, subject to the following conditions:
 *
 *   The above copyright notice and this permission notice shall be included in
 *   all copies or substantial portions of the Software.
 *
 *   THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *   IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *   FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *   AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *   LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *   OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *   THE SOFTWARE.
 */

package io.github.benas.randombeans.randomizers;

import java.math.BigInteger;

/**
 * Generate a random {@link String}.
 *
 * @author Mahmoud Ben Hassine (mahmoud.benhassine@icloud.com)
 */
public class StringRandomizer extends AbstractRandomizer<String> {

    public static final int NUM_BITS = 128;

    public static final int RADIX = 32;

    /**
     * Create a new {@link StringRandomizer}.
     */
    public StringRandomizer() {
    }

    /**
     * Create a new {@link StringRandomizer}.
     *
     * @param seed initial seed
     */
    public StringRandomizer(long seed) {
        super(seed);
    }

    /**
     * Create a new {@link StringRandomizer}.
     *
     * @return a new {@link StringRandomizer}.
     */
    public static StringRandomizer aNewStringRandomizer() {
        return new StringRandomizer();
    }

    /**
     * Create a new {@link StringRandomizer}.
     *
     * @param seed initial seed
     * @return a new {@link StringRandomizer}.
     */
    public static StringRandomizer aNewStringRandomizer(final long seed) {
        return new StringRandomizer(seed);
    }

    @Override
    public String getRandomValue() {
        return new BigInteger(NUM_BITS, random).toString(RADIX);
    }
}
