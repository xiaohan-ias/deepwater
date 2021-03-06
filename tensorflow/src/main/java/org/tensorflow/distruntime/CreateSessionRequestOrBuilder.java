// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/master.proto

package org.tensorflow.distruntime;

public interface CreateSessionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.CreateSessionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The initial graph definition.
   * </pre>
   *
   * <code>optional .tensorflow.GraphDef graph_def = 1;</code>
   */
  boolean hasGraphDef();
  /**
   * <pre>
   * The initial graph definition.
   * </pre>
   *
   * <code>optional .tensorflow.GraphDef graph_def = 1;</code>
   */
  org.tensorflow.framework.GraphDef getGraphDef();
  /**
   * <pre>
   * The initial graph definition.
   * </pre>
   *
   * <code>optional .tensorflow.GraphDef graph_def = 1;</code>
   */
  org.tensorflow.framework.GraphDefOrBuilder getGraphDefOrBuilder();

  /**
   * <pre>
   * Configuration options.
   * </pre>
   *
   * <code>optional .tensorflow.ConfigProto config = 2;</code>
   */
  boolean hasConfig();
  /**
   * <pre>
   * Configuration options.
   * </pre>
   *
   * <code>optional .tensorflow.ConfigProto config = 2;</code>
   */
  org.tensorflow.framework.ConfigProto getConfig();
  /**
   * <pre>
   * Configuration options.
   * </pre>
   *
   * <code>optional .tensorflow.ConfigProto config = 2;</code>
   */
  org.tensorflow.framework.ConfigProtoOrBuilder getConfigOrBuilder();
}
