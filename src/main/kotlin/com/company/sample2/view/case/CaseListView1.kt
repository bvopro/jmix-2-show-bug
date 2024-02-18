package com.company.sample2.view.case

import com.company.sample2.entity.Case
import com.company.sample2.view.main.MainView
import com.vaadin.flow.router.Route
import io.jmix.flowui.view.*

@Route(value = "cases1", layout = MainView::class)
@ViewController("Case_.list_1")
@ViewDescriptor("case-list-view-1.xml")
@LookupComponent("casesDataGrid")
@DialogMode(width = "64em")
class CaseListView1 : StandardListView<Case>() {
}
