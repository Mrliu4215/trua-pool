/*
 * This file is generated by jOOQ.
 */
package burst.pool.migrator.db.tables;


import burst.pool.migrator.db.Indexes;
import burst.pool.migrator.db.Keys;
import burst.pool.migrator.db.Pooldb;
import burst.pool.migrator.db.tables.records.BestsubmissionsRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Bestsubmissions extends TableImpl<BestsubmissionsRecord> {

    private static final long serialVersionUID = -258033271;

    /**
     * The reference instance of <code>pooldb.bestsubmissions</code>
     */
    public static final Bestsubmissions BESTSUBMISSIONS = new Bestsubmissions();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BestsubmissionsRecord> getRecordType() {
        return BestsubmissionsRecord.class;
    }

    /**
     * The column <code>pooldb.bestsubmissions.db_id</code>.
     */
    public final TableField<BestsubmissionsRecord, Long> DB_ID = createField("db_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>pooldb.bestsubmissions.height</code>.
     */
    public final TableField<BestsubmissionsRecord, Long> HEIGHT = createField("height", org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>pooldb.bestsubmissions.accountId</code>.
     */
    public final TableField<BestsubmissionsRecord, Long> ACCOUNTID = createField("accountId", org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>pooldb.bestsubmissions.nonce</code>.
     */
    public final TableField<BestsubmissionsRecord, String> NONCE = createField("nonce", org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>pooldb.bestsubmissions.deadline</code>.
     */
    public final TableField<BestsubmissionsRecord, Long> DEADLINE = createField("deadline", org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>pooldb.bestsubmissions</code> table reference
     */
    public Bestsubmissions() {
        this(DSL.name("bestsubmissions"), null);
    }

    /**
     * Create an aliased <code>pooldb.bestsubmissions</code> table reference
     */
    public Bestsubmissions(String alias) {
        this(DSL.name(alias), BESTSUBMISSIONS);
    }

    /**
     * Create an aliased <code>pooldb.bestsubmissions</code> table reference
     */
    public Bestsubmissions(Name alias) {
        this(alias, BESTSUBMISSIONS);
    }

    private Bestsubmissions(Name alias, Table<BestsubmissionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Bestsubmissions(Name alias, Table<BestsubmissionsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Bestsubmissions(Table<O> child, ForeignKey<O, BestsubmissionsRecord> key) {
        super(child, key, BESTSUBMISSIONS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Pooldb.POOLDB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.BESTSUBMISSIONS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<BestsubmissionsRecord, Long> getIdentity() {
        return Keys.IDENTITY_BESTSUBMISSIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<BestsubmissionsRecord> getPrimaryKey() {
        return Keys.KEY_BESTSUBMISSIONS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BestsubmissionsRecord>> getKeys() {
        return Arrays.<UniqueKey<BestsubmissionsRecord>>asList(Keys.KEY_BESTSUBMISSIONS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Bestsubmissions as(String alias) {
        return new Bestsubmissions(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Bestsubmissions as(Name alias) {
        return new Bestsubmissions(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Bestsubmissions rename(String name) {
        return new Bestsubmissions(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Bestsubmissions rename(Name name) {
        return new Bestsubmissions(name, null);
    }
}
