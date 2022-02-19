require rust-source.inc
require rust-snapshot.inc

FILESEXTRAPATHS:prepend := "${THISDIR}/cargo-${PV}:"

require cargo-cross-canadian.inc
