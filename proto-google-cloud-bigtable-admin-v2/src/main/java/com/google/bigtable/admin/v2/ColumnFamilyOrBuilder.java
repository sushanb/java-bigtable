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
// source: google/bigtable/admin/v2/table.proto

package com.google.bigtable.admin.v2;

public interface ColumnFamilyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.admin.v2.ColumnFamily)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Garbage collection rule specified as a protobuf.
   * Must serialize to at most 500 bytes.
   * NOTE: Garbage collection executes opportunistically in the background, and
   * so it's possible for reads to return a cell even if it matches the active
   * GC expression for its family.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.GcRule gc_rule = 1;</code>
   *
   * @return Whether the gcRule field is set.
   */
  boolean hasGcRule();
  /**
   *
   *
   * <pre>
   * Garbage collection rule specified as a protobuf.
   * Must serialize to at most 500 bytes.
   * NOTE: Garbage collection executes opportunistically in the background, and
   * so it's possible for reads to return a cell even if it matches the active
   * GC expression for its family.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.GcRule gc_rule = 1;</code>
   *
   * @return The gcRule.
   */
  com.google.bigtable.admin.v2.GcRule getGcRule();
  /**
   *
   *
   * <pre>
   * Garbage collection rule specified as a protobuf.
   * Must serialize to at most 500 bytes.
   * NOTE: Garbage collection executes opportunistically in the background, and
   * so it's possible for reads to return a cell even if it matches the active
   * GC expression for its family.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.GcRule gc_rule = 1;</code>
   */
  com.google.bigtable.admin.v2.GcRuleOrBuilder getGcRuleOrBuilder();
}
