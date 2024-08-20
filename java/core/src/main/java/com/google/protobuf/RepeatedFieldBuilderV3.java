// Protocol Buffers - Google's data interchange format
// Copyright 2024 Google LLC.  All rights reserved.
//
// Use of this source code is governed by a BSD-style
// license that can be found in the LICENSE file or at
// https://developers.google.com/open-source/licenses/bsd

package com.google.protobuf;

import java.util.List;

/**
 * Stub for RepeatedFieldBuilderV3 wrapping RepeatedFieldBuilder for compatibility with older
 * gencode.
 *
 * @deprecated This class is deprecated, and slated for removal in the next breaking change. Users
 *     should update gencode to >= 4.26.x which replaces RepeatedFieldBuilderV3 with
 *     RepeatedFieldBuilder.
 */
@Deprecated
public class RepeatedFieldBuilderV3<
        MType extends AbstractMessage,
        BType extends AbstractMessage.Builder,
        IType extends MessageOrBuilder>
    extends RepeatedFieldBuilder<MType, BType, IType> {

  public RepeatedFieldBuilderV3(
      List<MType> messages,
      boolean isMessagesListMutable,
      AbstractMessage.BuilderParent parent,
      boolean isClean) {
    super(messages, isMessagesListMutable, parent, isClean);
  }

  /* Returns RepeatedFieldBuilderV3 instead of RepeatedFieldBuilder.
   *
   * @deprecated This method is deprecated, and slated for removal in the next Java breaking change
   * (5.x). Users should update gencode to >= 4.26.x which uses
   * RepeatedFieldBuilder.setMessage() instead.
   */
  @Deprecated
  @Override
  public RepeatedFieldBuilderV3<MType, BType, IType> setMessage(int index, MType message) {
    return (RepeatedFieldBuilderV3<MType, BType, IType>) super.setMessage(index, message);
  }

  /* Returns RepeatedFieldBuilderV3 instead of RepeatedFieldBuilder.
   *
   * @deprecated This method is deprecated, and slated for removal in the next Java breaking change
   * (5.x). Users should update gencode to >= 4.26.x which uses
   * RepeatedFieldBuilder.addMessage() instead.
   */
  public RepeatedFieldBuilderV3<MType, BType, IType> addMessage(MType message) {
    return (RepeatedFieldBuilderV3<MType, BType, IType>) super.addMessage(message);
  }

  /* Returns RepeatedFieldBuilderV3 instead of RepeatedFieldBuilder.
   *
   * @deprecated This method is deprecated, and slated for removal in the next Java breaking change
   * (5.x). Users should update gencode to >= 4.26.x which uses
   * RepeatedFieldBuilder.addMessage() instead.
   */
  public RepeatedFieldBuilderV3<MType, BType, IType> addMessage(int index, MType message) {
    return (RepeatedFieldBuilderV3<MType, BType, IType>) super.addMessage(index, message);
  }

  /* Returns RepeatedFieldBuilderV3 instead of RepeatedFieldBuilder.
   *
   * @deprecated This method is deprecated, and slated for removal in the next Java breaking change
   * (5.x). Users should update gencode to >= 4.26.x which uses
   * RepeatedFieldBuilder.addAllMessages() instead.
   */
  public RepeatedFieldBuilderV3<MType, BType, IType> addAllMessages(
      Iterable<? extends MType> values) {
    return (RepeatedFieldBuilderV3<MType, BType, IType>) super.addAllMessages(values);
  }
}
