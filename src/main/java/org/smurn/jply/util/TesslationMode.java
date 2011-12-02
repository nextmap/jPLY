/*
 * Copyright 2011 Stefan C. Mueller.
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
package org.smurn.jply.util;

/**
 * Operation mode for triangle generation by {@link NormalizingPlyReader}.
 */
public enum TesslationMode {
    
    /**
     * Does not change the faces.
     */
    PASS_THROUGH,
    
    /**
     * Splits every face with more than three vertices into several
     * triangles.
     */
    TRIANGLES
    
}
