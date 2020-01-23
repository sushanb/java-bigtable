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
// source: google/bigtable/admin/v2/instance.proto

package com.google.bigtable.admin.v2;

public interface ClusterOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.admin.v2.Cluster)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * (`OutputOnly`)
   * The unique name of the cluster. Values are of the form
   * `projects/&lt;project&gt;/instances/&lt;instance&gt;/clusters/[a-z][-a-z0-9]*`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * (`OutputOnly`)
   * The unique name of the cluster. Values are of the form
   * `projects/&lt;project&gt;/instances/&lt;instance&gt;/clusters/[a-z][-a-z0-9]*`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * (`CreationOnly`)
   * The location where this cluster's nodes and storage reside. For best
   * performance, clients should be located as close as possible to this
   * cluster. Currently only zones are supported, so values should be of the
   * form `projects/&lt;project&gt;/locations/&lt;zone&gt;`.
   * </pre>
   *
   * <code>string location = 2;</code>
   *
   * @return The location.
   */
  java.lang.String getLocation();
  /**
   *
   *
   * <pre>
   * (`CreationOnly`)
   * The location where this cluster's nodes and storage reside. For best
   * performance, clients should be located as close as possible to this
   * cluster. Currently only zones are supported, so values should be of the
   * form `projects/&lt;project&gt;/locations/&lt;zone&gt;`.
   * </pre>
   *
   * <code>string location = 2;</code>
   *
   * @return The bytes for location.
   */
  com.google.protobuf.ByteString getLocationBytes();

  /**
   *
   *
   * <pre>
   * (`OutputOnly`)
   * The current state of the cluster.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.Cluster.State state = 3;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * (`OutputOnly`)
   * The current state of the cluster.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.Cluster.State state = 3;</code>
   *
   * @return The state.
   */
  com.google.bigtable.admin.v2.Cluster.State getState();

  /**
   *
   *
   * <pre>
   * The number of nodes allocated to this cluster. More nodes enable higher
   * throughput and more consistent performance.
   * </pre>
   *
   * <code>int32 serve_nodes = 4;</code>
   *
   * @return The serveNodes.
   */
  int getServeNodes();

  /**
   *
   *
   * <pre>
   * (`CreationOnly`)
   * The type of storage used by this cluster to serve its
   * parent instance's tables, unless explicitly overridden.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.StorageType default_storage_type = 5;</code>
   *
   * @return The enum numeric value on the wire for defaultStorageType.
   */
  int getDefaultStorageTypeValue();
  /**
   *
   *
   * <pre>
   * (`CreationOnly`)
   * The type of storage used by this cluster to serve its
   * parent instance's tables, unless explicitly overridden.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.StorageType default_storage_type = 5;</code>
   *
   * @return The defaultStorageType.
   */
  com.google.bigtable.admin.v2.StorageType getDefaultStorageType();
}
