package com.company.sample2.view.naturalperson

import com.company.sample2.entity.NaturalPerson
import com.company.sample2.view.main.MainView
import com.vaadin.flow.router.Route
import io.jmix.flowui.view.*

@Route(value = "naturalPersons", layout = MainView::class)
@ViewController("NaturalPerson.list")
@ViewDescriptor("natural-person-list-view.xml")
@LookupComponent("naturalPersonsDataGrid")
@DialogMode(width = "64em")
class NaturalPersonListView : StandardListView<NaturalPerson>() {
}
