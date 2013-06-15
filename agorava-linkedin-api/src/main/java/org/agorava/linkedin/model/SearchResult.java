/*
 * Copyright 2012 Agorava
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.agorava.linkedin.model;

import java.io.Serializable;

/**
 * Abstract class for Search and certain other types of query list results
 *
 * @author Robert Drysdale
 * @author Antoine Sabot-Durand
 */
public abstract class SearchResult implements Serializable {
    private static final long serialVersionUID = 1L;

    private final int count;

    private final int start;

    private final int total;

    public SearchResult(int count, int start, int total) {
        this.count = count;
        this.start = start;
        this.total = total;
    }

    public int getCount() {
        return count;
    }

    public int getStart() {
        return start;
    }

    public int getTotal() {
        return total;
    }

}
