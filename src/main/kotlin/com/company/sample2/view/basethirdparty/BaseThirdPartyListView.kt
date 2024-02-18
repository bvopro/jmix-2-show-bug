package com.company.sample2.view.basethirdparty

import com.company.sample2.entity.BaseThirdParty
import com.company.sample2.view.main.MainView
import com.vaadin.flow.router.Route
import io.jmix.flowui.view.*

@Route(value = "baseThirdParties", layout = MainView::class)
@ViewController("BaseThirdParty.list")
@ViewDescriptor("base-third-party-list-view.xml")
@LookupComponent("baseThirdPartiesDataGrid")
@DialogMode(width = "64em")
class BaseThirdPartyListView : StandardListView<BaseThirdParty>() {
}
