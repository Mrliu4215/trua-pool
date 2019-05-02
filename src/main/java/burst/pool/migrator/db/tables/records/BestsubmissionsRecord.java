/*
 * This file is generated by jOOQ.
 */
package burst.pool.migrator.db.tables.records;


import burst.pool.migrator.db.tables.Bestsubmissions;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


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
public class BestsubmissionsRecord extends UpdatableRecordImpl<BestsubmissionsRecord> implements Record5<Long, Long, Long, String, Long> {

    private static final long serialVersionUID = 1954010850;

    /**
     * Setter for <code>pooldb.bestsubmissions.db_id</code>.
     */
    public void setDbId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pooldb.bestsubmissions.db_id</code>.
     */
    public Long getDbId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pooldb.bestsubmissions.height</code>.
     */
    public void setHeight(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pooldb.bestsubmissions.height</code>.
     */
    public Long getHeight() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pooldb.bestsubmissions.accountId</code>.
     */
    public void setAccountid(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pooldb.bestsubmissions.accountId</code>.
     */
    public Long getAccountid() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>pooldb.bestsubmissions.nonce</code>.
     */
    public void setNonce(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>pooldb.bestsubmissions.nonce</code>.
     */
    public String getNonce() {
        return (String) get(3);
    }

    /**
     * Setter for <code>pooldb.bestsubmissions.deadline</code>.
     */
    public void setDeadline(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>pooldb.bestsubmissions.deadline</code>.
     */
    public Long getDeadline() {
        return (Long) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, Long, Long, String, Long> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, Long, Long, String, Long> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Bestsubmissions.BESTSUBMISSIONS.DB_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return Bestsubmissions.BESTSUBMISSIONS.HEIGHT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return Bestsubmissions.BESTSUBMISSIONS.ACCOUNTID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Bestsubmissions.BESTSUBMISSIONS.NONCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return Bestsubmissions.BESTSUBMISSIONS.DEADLINE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getDbId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getHeight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getAccountid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getNonce();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component5() {
        return getDeadline();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getDbId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getHeight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getAccountid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getNonce();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getDeadline();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BestsubmissionsRecord value1(Long value) {
        setDbId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BestsubmissionsRecord value2(Long value) {
        setHeight(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BestsubmissionsRecord value3(Long value) {
        setAccountid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BestsubmissionsRecord value4(String value) {
        setNonce(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BestsubmissionsRecord value5(Long value) {
        setDeadline(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BestsubmissionsRecord values(Long value1, Long value2, Long value3, String value4, Long value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BestsubmissionsRecord
     */
    public BestsubmissionsRecord() {
        super(Bestsubmissions.BESTSUBMISSIONS);
    }

    /**
     * Create a detached, initialised BestsubmissionsRecord
     */
    public BestsubmissionsRecord(Long dbId, Long height, Long accountid, String nonce, Long deadline) {
        super(Bestsubmissions.BESTSUBMISSIONS);

        set(0, dbId);
        set(1, height);
        set(2, accountid);
        set(3, nonce);
        set(4, deadline);
    }
}
