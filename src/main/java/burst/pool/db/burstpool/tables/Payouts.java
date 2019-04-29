/*
 * This file is generated by jOOQ.
 */
package burst.pool.db.burstpool.tables;


import burst.pool.db.burstpool.Burstpool;
import burst.pool.db.burstpool.Indexes;
import burst.pool.db.burstpool.Keys;
import burst.pool.db.burstpool.tables.records.PayoutsRecord;

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
public class Payouts extends TableImpl<PayoutsRecord> {

    private static final long serialVersionUID = 45292382;

    /**
     * The reference instance of <code>BURSTPOOL.PAYOUTS</code>
     */
    public static final Payouts PAYOUTS = new Payouts();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PayoutsRecord> getRecordType() {
        return PayoutsRecord.class;
    }

    /**
     * The column <code>BURSTPOOL.PAYOUTS.DB_ID</code>.
     */
    public final TableField<PayoutsRecord, Long> DB_ID = createField("DB_ID", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>BURSTPOOL.PAYOUTS.TRANSACTIONID</code>.
     */
    public final TableField<PayoutsRecord, Long> TRANSACTIONID = createField("TRANSACTIONID", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>BURSTPOOL.PAYOUTS.SENDERPUBLICKEY</code>.
     */
    public final TableField<PayoutsRecord, byte[]> SENDERPUBLICKEY = createField("SENDERPUBLICKEY", org.jooq.impl.SQLDataType.VARBINARY, this, "");

    /**
     * The column <code>BURSTPOOL.PAYOUTS.FEE</code>.
     */
    public final TableField<PayoutsRecord, Long> FEE = createField("FEE", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>BURSTPOOL.PAYOUTS.DEADLINE</code>.
     */
    public final TableField<PayoutsRecord, Long> DEADLINE = createField("DEADLINE", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>BURSTPOOL.PAYOUTS.ATTACHMENT</code>.
     */
    public final TableField<PayoutsRecord, byte[]> ATTACHMENT = createField("ATTACHMENT", org.jooq.impl.SQLDataType.VARBINARY, this, "");

    /**
     * Create a <code>BURSTPOOL.PAYOUTS</code> table reference
     */
    public Payouts() {
        this(DSL.name("PAYOUTS"), null);
    }

    /**
     * Create an aliased <code>BURSTPOOL.PAYOUTS</code> table reference
     */
    public Payouts(String alias) {
        this(DSL.name(alias), PAYOUTS);
    }

    /**
     * Create an aliased <code>BURSTPOOL.PAYOUTS</code> table reference
     */
    public Payouts(Name alias) {
        this(alias, PAYOUTS);
    }

    private Payouts(Name alias, Table<PayoutsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Payouts(Name alias, Table<PayoutsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Payouts(Table<O> child, ForeignKey<O, PayoutsRecord> key) {
        super(child, key, PAYOUTS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Burstpool.BURSTPOOL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PRIMARY_KEY_FB);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<PayoutsRecord, Long> getIdentity() {
        return Keys.IDENTITY_PAYOUTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PayoutsRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_FB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PayoutsRecord>> getKeys() {
        return Arrays.<UniqueKey<PayoutsRecord>>asList(Keys.CONSTRAINT_FB);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Payouts as(String alias) {
        return new Payouts(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Payouts as(Name alias) {
        return new Payouts(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Payouts rename(String name) {
        return new Payouts(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Payouts rename(Name name) {
        return new Payouts(name, null);
    }
}
