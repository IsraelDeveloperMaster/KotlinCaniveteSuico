package net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.modelEntidades.ModelEntidadeRoomMVVM;

@SuppressWarnings({"unchecked", "deprecation"})
public final class InterfaceDaoRoomMVVM_Impl implements InterfaceDaoRoomMVVM {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ModelEntidadeRoomMVVM> __insertionAdapterOfModelEntidadeRoomMVVM;

  private final EntityDeletionOrUpdateAdapter<ModelEntidadeRoomMVVM> __deletionAdapterOfModelEntidadeRoomMVVM;

  private final EntityDeletionOrUpdateAdapter<ModelEntidadeRoomMVVM> __updateAdapterOfModelEntidadeRoomMVVM;

  public InterfaceDaoRoomMVVM_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfModelEntidadeRoomMVVM = new EntityInsertionAdapter<ModelEntidadeRoomMVVM>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR ABORT INTO `nome_da_tabela` (`id`,`Coluna_nome`,`Coluna_idade`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final ModelEntidadeRoomMVVM entity) {
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
    this.__deletionAdapterOfModelEntidadeRoomMVVM = new EntityDeletionOrUpdateAdapter<ModelEntidadeRoomMVVM>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `nome_da_tabela` WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final ModelEntidadeRoomMVVM entity) {
        statement.bindLong(1, entity.getId());
      }
    };
    this.__updateAdapterOfModelEntidadeRoomMVVM = new EntityDeletionOrUpdateAdapter<ModelEntidadeRoomMVVM>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `nome_da_tabela` SET `id` = ?,`Coluna_nome` = ?,`Coluna_idade` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final ModelEntidadeRoomMVVM entity) {
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
  public Object salvar(final ModelEntidadeRoomMVVM modelEntidadeRoomMVVM,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfModelEntidadeRoomMVVM.insert(modelEntidadeRoomMVVM);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object deletar(final ModelEntidadeRoomMVVM modelEntidadeRoomMVVM,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfModelEntidadeRoomMVVM.handle(modelEntidadeRoomMVVM);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object atualizar(final ModelEntidadeRoomMVVM modelEntidadeRoomMVVM,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfModelEntidadeRoomMVVM.handle(modelEntidadeRoomMVVM);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object listarId(final String idPesquisa,
      final Continuation<? super List<ModelEntidadeRoomMVVM>> $completion) {
    final String _sql = "SELECT * FROM nome_da_tabela WHERE id LIKE ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (idPesquisa == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, idPesquisa);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<ModelEntidadeRoomMVVM>>() {
      @Override
      @NonNull
      public List<ModelEntidadeRoomMVVM> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfNome = CursorUtil.getColumnIndexOrThrow(_cursor, "Coluna_nome");
          final int _cursorIndexOfIdade = CursorUtil.getColumnIndexOrThrow(_cursor, "Coluna_idade");
          final List<ModelEntidadeRoomMVVM> _result = new ArrayList<ModelEntidadeRoomMVVM>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final ModelEntidadeRoomMVVM _item;
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
            _item = new ModelEntidadeRoomMVVM(_tmpId,_tmpNome,_tmpIdade);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @Override
  public Object listarNome(final String nomePesquisa,
      final Continuation<? super List<ModelEntidadeRoomMVVM>> $completion) {
    final String _sql = "SELECT * FROM nome_da_tabela WHERE Coluna_nome LIKE '%' || ? || '%' ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (nomePesquisa == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, nomePesquisa);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<ModelEntidadeRoomMVVM>>() {
      @Override
      @NonNull
      public List<ModelEntidadeRoomMVVM> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfNome = CursorUtil.getColumnIndexOrThrow(_cursor, "Coluna_nome");
          final int _cursorIndexOfIdade = CursorUtil.getColumnIndexOrThrow(_cursor, "Coluna_idade");
          final List<ModelEntidadeRoomMVVM> _result = new ArrayList<ModelEntidadeRoomMVVM>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final ModelEntidadeRoomMVVM _item;
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
            _item = new ModelEntidadeRoomMVVM(_tmpId,_tmpNome,_tmpIdade);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @Override
  public Object listarIdade(final String idadePesquisa,
      final Continuation<? super List<ModelEntidadeRoomMVVM>> $completion) {
    final String _sql = "SELECT * FROM nome_da_tabela WHERE Coluna_idade LIKE '%' || ? || '%' ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (idadePesquisa == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, idadePesquisa);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<ModelEntidadeRoomMVVM>>() {
      @Override
      @NonNull
      public List<ModelEntidadeRoomMVVM> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfNome = CursorUtil.getColumnIndexOrThrow(_cursor, "Coluna_nome");
          final int _cursorIndexOfIdade = CursorUtil.getColumnIndexOrThrow(_cursor, "Coluna_idade");
          final List<ModelEntidadeRoomMVVM> _result = new ArrayList<ModelEntidadeRoomMVVM>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final ModelEntidadeRoomMVVM _item;
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
            _item = new ModelEntidadeRoomMVVM(_tmpId,_tmpNome,_tmpIdade);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @Override
  public Object listarTodos(final Continuation<? super List<ModelEntidadeRoomMVVM>> $completion) {
    final String _sql = "SELECT * FROM nome_da_tabela";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<ModelEntidadeRoomMVVM>>() {
      @Override
      @NonNull
      public List<ModelEntidadeRoomMVVM> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfNome = CursorUtil.getColumnIndexOrThrow(_cursor, "Coluna_nome");
          final int _cursorIndexOfIdade = CursorUtil.getColumnIndexOrThrow(_cursor, "Coluna_idade");
          final List<ModelEntidadeRoomMVVM> _result = new ArrayList<ModelEntidadeRoomMVVM>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final ModelEntidadeRoomMVVM _item;
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
            _item = new ModelEntidadeRoomMVVM(_tmpId,_tmpNome,_tmpIdade);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
