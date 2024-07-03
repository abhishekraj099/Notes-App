package com.example.notesapp.presentation

import androidx.lifecycle.ViewModel
import com.example.notesapp.core.domain.model.NoteItem
import com.example.notesapp.note_list.domain.use_case.DeleteNote
import com.example.notesapp.note_list.domain.use_case.GetAllNotes
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

@HiltViewModel
class NoteListViewModel(
    private val getAllNotes: GetAllNotes,
    private val deleteNote: DeleteNote
): ViewModel() {
    private val _noteListState = MutableStateFlow<List<NoteItem>>(emptyList())
    val noteListState = _noteListState.asStateFlow()

    private val _orderByTitleState = MutableStateFlow(false)
    val orderByTitleState = _orderByTitleState.asStateFlow()

    fun loadNotes(){

    }

    fun deleteNotes(noteItem: NoteItem){

    }
    fun changeOrder(){

    }
}