/*
 * Copyright 1999-2018 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.nacos.naming.misc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Locale;

/**
 *
 * @author jiachun.fjc
 */
public class Platform {

    private static final Logger  LOG        = LoggerFactory.getLogger(Platform.class);

    private static final boolean IS_WINDOWS = isWindows0();

    /**
     * Return {@code true} if the JVM is running on Windows
     */
    public static boolean isWindows() {
        return IS_WINDOWS;
    }

    private static boolean isWindows0() {
        final boolean windows = System.getProperty("os.name", "")
            .toLowerCase(Locale.US)
            .contains("win");
        if (windows) {
            LOG.debug("Platform: Windows");
        }
        return windows;
    }
}
