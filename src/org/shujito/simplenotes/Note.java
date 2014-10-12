package org.shujito.simplenotes;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Column.ConflictAction;
import com.activeandroid.annotation.Table;

@Table(name = "notes")
public class Note extends Model
{
	public static final String TAG = Note.class.getSimpleName();
	@Column(name = "_id", notNull = true, unique = true, onUniqueConflict = ConflictAction.REPLACE)
	public String id;
	@Column(name = "description", notNull = true, onNullConflict = ConflictAction.IGNORE)
	public String description;
	@Column(name = "done")
	public boolean done;
}
