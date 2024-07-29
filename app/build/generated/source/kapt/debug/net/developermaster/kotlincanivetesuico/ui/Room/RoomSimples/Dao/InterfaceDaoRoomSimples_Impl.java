package net.developermaster.kotlincanivetesuico.ui.Room.RoomSimples.Dao;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.developermaster.kotlincanivetesuico.ui.Room.RoomSimples.ModelEntidade.ClasseDeDadosEntidadeRoomSimples;

@SuppressWarnings({"unchecked", "deprecation"})
public final class InterfaceDaoRoomSimples_Impl implements InterfaceDaoRoomSimples {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ClasseDeDadosEntidadeRoomSimples> __insertionAdapterOfClasseDeDadosEntidadeRoomSimples;

  private final EntityDeletionOrUpdateAdapter<ClasseDeDadosEntidadeRoomSimples> __deletionAdapterOfClasseDeDadosEntidadeRoomSimples;

  private final EntityDeletionOrUpdateAdapter<ClasseDeDadosEntidadeRoomSimples> __updateAdapterOfClasseDeDadosEntidadeRoomSimples;

  public InterfaceDaoRoomSimples_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfClasseDeDadosEntidadeRoomSimples = new EntityInsertionAdapter<ClasseDeDadosEntidadeRoomSimples>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR ABORT INTO `nome_da_tabela` (`id`,`Coluna_nome`,`Coluna_idade`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final ClasseDeDadosEntidadeRoomSimples entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getNome() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getNome());
        }
        if (entity.getIdade() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getIdade());
        }
      }
    };
    this.__deletionAdapterOfClasseDeDadosEntidadeRoomSimples = new EntityDeletionOrUpdateAdapter<ClasseDeDadosEntidadeRoomSimples>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `nome_da_tabela` WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final ClasseDeDadosEntidadeRoomSimples entity) {
        statement.bindLong(1, entity.getId());
      }
    };
    this.__updateAdapterOfClasseDeDadosEntidadeRoomSimples = new EntityDeletionOrUpdateAdapter<ClasseDeDadosEntidadeRoomSimples>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `nome_da_tabela` SET `id` = ?,`Coluna_nome` = ?,`Coluna_idade` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final ClasseDeDadosEntidadeRoomSimples entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getNome() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getNome());
        }
        if (entity.getIdade() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getIdade());
        }
        statement.bindLong(4, entity.getId());
      }
    };
  }

  @Override
  public void salvar(final ClasseDeDadosEntidadeRoomSimples classeDeDadosEntidadeRoomSimples) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfClasseDeDadosEntidadeRoomSimples.insert(classeDeDadosEntidadeRoomSimples);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deletar(final ClasseDeDadosEntidadeRoomSimples classeDeDadosEntidadeRoomSimples) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfClasseDeDadosEntidadeRoomSimples.handle(classeDeDadosEntidadeRoomSimples);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void atualizar(final ClasseDeDadosEntidadeRoomSimples classeDeDadosEntidadeRoomSimples) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfClasseDeDadosEntidadeRoomSimples.handle(classeDeDadosEntidadeRoomSimples);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<ClasseDeDadosEntidadeRoomSimples> listarId(final String idPesquisado) {
    final String _sql = "SELECT * FROM nome_da_tabela WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (idPesquisado == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, idPesquisado);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfNome = CursorUtil.getColumnIndexOrThrow(_cursor, "Coluna_nome");
      final int _cursorIndexOfIdade = CursorUtil.getColumnIndexOrThrow(_cursor, "Coluna_idade");
      final List<ClasseDeDadosEntidadeRoomSimples> _result = new ArrayList<ClasseDeDadosEntidadeRoomSimples>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final ClasseDeDadosEntidadeRoomSimples _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpNome;
        if (_cursor.isNull(_cursorIndexOfNome)) {
          _tmpNome = null;
        } else {
          _tmpNome = _cursor.getString(_cursorIndexOfNome);
        }
        final String _tmpIdade;
        if (_cursor.isNull(_cursorIndexOfIdade)) {
          _tmpIdade = null;
        } else {
          _tmpIdade = _cursor.getString(_cursorIndexOfIdade);
        }
        _item = new ClasseDeDadosEntidadeRoomSimples(_tmpId,_tmpNome,_tmpIdade);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<ClasseDeDadosEntidadeRoomSimples> listarNome(final String nomePesquisa) {
    final String _sql = "SELECT * FROM nome_da_tabela WHERE Coluna_nome LIKE '%' || ? || '%' ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (nomePesquisa == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, nomePesquisa);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfNome = CursorUtil.getColumnIndexOrThrow(_cursor, "Coluna_nome");
      final int _cursorIndexOfIdade = CursorUtil.getColumnIndexOrThrow(_cursor, "Coluna_idade");
      final List<ClasseDeDadosEntidadeRoomSimples> _result = new ArrayList<ClasseDeDadosEntidadeRoomSimples>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final ClasseDeDadosEntidadeRoomSimples _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpNome;
        if (_cursor.isNull(_cursorIndexOfNome)) {
          _tmpNome = null;
        } else {
          _tmpNome = _cursor.getString(_cursorIndexOfNome);
        }
        final String _tmpIdade;
        if (_cursor.isNull(_cursorIndexOfIdade)) {
          _tmpIdade = null;
        } else {
          _tmpIdade = _cursor.getString(_cursorIndexOfIdade);
        }
        _item = new ClasseDeDadosEntidadeRoomSimples(_tmpId,_tmpNome,_tmpIdade);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<ClasseDeDadosEntidadeRoomSimples> listarIdade(final String idadePesquisa) {
    final String _sql = "SELECT * FROM nome_da_tabela WHERE Coluna_idade LIKE '%' || ? || '%' ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (idadePesquisa == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, idadePesquisa);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfNome = CursorUtil.getColumnIndexOrThrow(_cursor, "Coluna_nome");
      final int _cursorIndexOfIdade = CursorUtil.getColumnIndexOrThrow(_cursor, "Coluna_idade");
      final List<ClasseDeDadosEntidadeRoomSimples> _result = new ArrayList<ClasseDeDadosEntidadeRoomSimples>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final ClasseDeDadosEntidadeRoomSimples _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpNome;
        if (_cursor.isNull(_cursorIndexOfNome)) {
          _tmpNome = null;
        } else {
          _tmpNome = _cursor.getString(_cursorIndexOfNome);
        }
        final String _tmpIdade;
        if (_cursor.isNull(_cursorIndexOfIdade)) {
          _tmpIdade = null;
        } else {
          _tmpIdade = _cursor.getString(_cursorIndexOfIdade);
        }
        _item = new ClasseDeDadosEntidadeRoomSimples(_tmpId,_tmpNome,_tmpIdade);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<ClasseDeDadosEntidadeRoomSimples> listarTodos() {
    final String _sql = "SELECT * FROM nome_da_tabela";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfNome = CursorUtil.getColumnIndexOrThrow(_cursor, "Coluna_nome");
      final int _cursorIndexOfIdade = CursorUtil.getColumnIndexOrThrow(_cursor, "Coluna_idade");
      final List<ClasseDeDadosEntidadeRoomSimples> _result = new ArrayList<ClasseDeDadosEntidadeRoomSimples>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final ClasseDeDadosEntidadeRoomSimples _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpNome;
        if (_cursor.isNull(_cursorIndexOfNome)) {
          _tmpNome = null;
        } else {
          _tmpNome = _cursor.getString(_cursorIndexOfNome);
        }
        final String _tmpIdade;
        if (_cursor.isNull(_cursorIndexOfIdade)) {
          _tmpIdade = null;
        } else {
          _tmpIdade = _cursor.getString(_cursorIndexOfIdade);
        }
        _item = new ClasseDeDadosEntidadeRoomSimples(_tmpId,_tmpNome,_tmpIdade);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
