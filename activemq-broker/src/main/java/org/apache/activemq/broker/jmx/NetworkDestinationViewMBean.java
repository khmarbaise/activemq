/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.activemq.broker.jmx;

public interface NetworkDestinationViewMBean {

    /**
     * Returns the name of this destination
     */
    @MBeanInfo("Name of this destination.")
    String getName();

    /**
     * Resets the managment counters.
     */
    @MBeanInfo("Resets statistics.")
    void resetStatistics();

    /**
     * Returns the number of messages that have been sent to the destination.
     *
     * @return The number of messages that have been sent to the destination.
     */
    @MBeanInfo("Number of messages that have been sent to the destination.")
    long getCount();

    /**
     * Returns the rate of messages that have been sent to the destination.
     *
     * @return The rate of messages that have been sent to the destination.
     */
    @MBeanInfo("rate of messages sent across the network destination.")
    double getRate();
}
