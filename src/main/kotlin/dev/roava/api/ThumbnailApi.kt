/*
 * MIT License
 *
 * Copyright (c) 2024 RoavaDev
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package dev.roava.api

import dev.roava.json.user.ThumbnailListData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ThumbnailApi {
    @GET("/v1/users/avatar")
    fun getAvatar(
        @Query("userIds") userId: Long,
        @Query("size") size: String,
        @Query("format") format: String,
        @Query("isCircular") circular: Boolean
    ): Call<ThumbnailListData>
    @GET("/v1/users/avatar-headshot")
    fun getHeadShot(
        @Query("userIds") userId: Long,
        @Query("size") size: String,
        @Query("format") format: String,
        @Query("isCircular") circular: Boolean
    ): Call<ThumbnailListData>
    @GET("/v1/users/avatar-bust")
    fun getBust(
        @Query("userIds") userId: Long,
        @Query("size") size: String,
        @Query("format") format: String,
        @Query("isCircular") circular: Boolean
    ): Call<ThumbnailListData>
}
