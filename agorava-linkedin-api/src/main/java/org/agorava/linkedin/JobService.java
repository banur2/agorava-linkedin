/*
 * Copyright 2013 Agorava
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

package org.agorava.linkedin;

import org.agorava.linkedin.model.Job;
import org.agorava.linkedin.model.JobBookmarks;
import org.agorava.linkedin.model.JobSearchParameters;
import org.agorava.linkedin.model.Jobs;

/**
 * Operations on Linkedin Jobs API
 *
 * @author Robert Drysdale
 * @author Antoine Sabot-Durand
 */
public interface JobService {

    /**
     * Search form Jobs
     *
     * @param parameters Various parameters that control behaviour of search
     * @return Search Result
     */
    Jobs searchJobs(JobSearchParameters parameters);

    /**
     * Retreive and Job by ID
     *
     * @param id Numerical id of job
     * @return Job
     */
    Job getJob(int id);

    /**
     * Bookmark Job
     *
     * @param id
     */
    void bookmarkJob(int id);

    /**
     * Unbookmark Job
     *
     * @param id
     */
    void unbookmarkJob(int id);

    /**
     * Get suggested list of jobs
     *
     * @param start First job to return
     * @param count Number of jobs to return
     * @return Job Search Result
     */
    Jobs getSuggestions(int start, int count);

    /**
     * Get List of Bookmarked Jobs
     *
     * @param start First job to return
     * @param count Number of jobs to return
     * @return Job Bookmark Result
     */
    JobBookmarks getBookmarks(int start, int count);

}
