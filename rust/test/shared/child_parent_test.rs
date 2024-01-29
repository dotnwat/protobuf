// Protocol Buffers - Google's data interchange format
// Copyright 2023 Google LLC.  All rights reserved.
//
// Use of this source code is governed by a BSD-style
// license that can be found in the LICENSE file or at
// https://developers.google.com/open-source/licenses/bsd

use googletest::prelude::*;

#[test]
fn test_canonical_types() {
    let _child = child_proto::Child::new();
    let _parent = parent_proto::Parent::new();
    // Parent from child_proto crate should be the same type as Parent from
    // parent_proto crate.
    let _parent_from_child: child_proto::Parent = parent_proto::Parent::new();
}

#[test]
fn test_parent_serialization() {
    assert_that!(*parent_proto::Parent::new().serialize(), empty());
}

#[test]
fn test_child_serialization() {
    assert_that!(*child_proto::Child::new().serialize(), empty());
}