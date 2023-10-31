/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.drools.core.reteoo;

import org.drools.core.common.InternalFactHandle;
import org.drools.core.common.PropagationContext;
import org.drools.core.common.ReteEvaluator;

/**
 * Receiver of propagated <code>FactHandleImpl</code>s from a
 * <code>ObjectSource</code>.
 * 
 * @see ObjectSource
 */
public interface ObjectSink
    extends
    Sink {

    void assertObject(InternalFactHandle factHandle,
                      PropagationContext propagationContext,
                      ReteEvaluator reteEvaluator);

    void modifyObject(InternalFactHandle factHandle,
                      ModifyPreviousTuples modifyPreviousTuples,
                      PropagationContext context,
                      ReteEvaluator reteEvaluator);
    
    void byPassModifyToBetaNode (InternalFactHandle factHandle,
                                 ModifyPreviousTuples modifyPreviousTuples,
                                 PropagationContext context,
                                 ReteEvaluator reteEvaluator);
}
