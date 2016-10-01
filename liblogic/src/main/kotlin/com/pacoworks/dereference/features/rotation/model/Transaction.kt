/*
 * Copyright (c) pakoito 2016
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.pacoworks.dereference.features.rotation.model

sealed class Transaction {
    object Idle : Transaction()
    data class Loading(val user: UserInput) : Transaction()
    data class Success(val charInfo: BookCharacter) : Transaction()
    data class Failure(val reason: String) : Transaction()
    data class WaitingForRetry(val seconds: Int) : Transaction()
}