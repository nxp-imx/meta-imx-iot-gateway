do_install_append() {
    # change group owner to fix install conflicts between polkit
    # and polkit-group-rule-network
    chown polkitd:root ${D}${sysconfdir}/polkit-1/rules.d
}
