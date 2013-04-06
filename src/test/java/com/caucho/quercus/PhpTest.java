package com.caucho.quercus;

import junit.framework.TestCase;

/**
 * php test
 *
 * @author linux_china
 */
public class PhpTest extends TestCase {
    /**
     * cli test
     *
     * @throws Exception exception
     */
    public void testCli() throws Exception {
        CliQuercus.main(new String[]{"./src/test/resources/demo.php"});
    }
}
