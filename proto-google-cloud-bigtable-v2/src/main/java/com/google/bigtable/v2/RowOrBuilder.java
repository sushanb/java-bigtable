/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/v2/data.proto

package com.google.bigtable.v2;

public interface RowOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.v2.Row)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The unique key which identifies this row within its table. This is the same
   * key that's used to identify the row in, for example, a MutateRowRequest.
   * May contain any non-empty byte string up to 4KiB in length.
   * </pre>
   *
   * <code>bytes key = 1;</code>
   *
   * @return The key.
   */
  com.google.protobuf.ByteString getKey();

  /**
   *
   *
   * <pre>
   * May be empty, but only if the entire row is empty.
   * The mutual ordering of column families is not specified.
   * </pre>
   *
   * <code>repeated .google.bigtable.v2.Family families = 2;</code>
   */
  java.util.List<com.google.bigtable.v2.Family> getFamiliesList();
  /**
   *
   *
   * <pre>
   * May be empty, but only if the entire row is empty.
   * The mutual ordering of column families is not specified.
   * </pre>
   *
   * <code>repeated .google.bigtable.v2.Family families = 2;</code>
   */
  com.google.bigtable.v2.Family getFamilies(int index);
  /**
   *
   *
   * <pre>
   * May be empty, but only if the entire row is empty.
   * The mutual ordering of column families is not specified.
   * </pre>
   *
   * <code>repeated .google.bigtable.v2.Family families = 2;</code>
   */
  int getFamiliesCount();
  /**
   *
   *
   * <pre>
   * May be empty, but only if the entire row is empty.
   * The mutual ordering of column families is not specified.
   * </pre>
   *
   * <code>repeated .google.bigtable.v2.Family families = 2;</code>
   */
  java.util.List<? extends com.google.bigtable.v2.FamilyOrBuilder> getFamiliesOrBuilderList();
  /**
   *
   *
   * <pre>
   * May be empty, but only if the entire row is empty.
   * The mutual ordering of column families is not specified.
   * </pre>
   *
   * <code>repeated .google.bigtable.v2.Family families = 2;</code>
   */
  com.google.bigtable.v2.FamilyOrBuilder getFamiliesOrBuilder(int index);
}
